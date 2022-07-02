import java.util.ArrayList;
import java.util.List;

public class Node {
    private int row;
    private int column;
    private boolean beenThere;
    private final int value;
    Node[][] nodeMatrix;
    private List<Node> neighbors = new ArrayList<>();

    public Node(int row, int column, int value, Node[][] nodeMatrix) {
        this.row = row;
        this.column = column;
        this.value = value;
        this.nodeMatrix = nodeMatrix;
    }

    public List<Node> getNearNodes() {
        int matRows = nodeMatrix.length;
        int matColumns = nodeMatrix[0].length;
        if ((this.row - 1) >= 0) {
            if (nodeMatrix[row - 1][column].getValue() != 1)
                neighbors.add(nodeMatrix[row - 1][column]);
        }
        if ((this.row + 1) < matRows) {
            if (nodeMatrix[row + 1][column].getValue() != 1)
                neighbors.add(nodeMatrix[row + 1][column]);
        }
        if ((this.column + 1) < matColumns) {
            if (nodeMatrix[row][column + 1].getValue() != 1)
                neighbors.add(nodeMatrix[row][column + 1]);
        }
        if ((this.column - 1) >= 0) {
            if (nodeMatrix[row][column - 1].getValue() != 1) {
                neighbors.add(nodeMatrix[row][column - 1]);
            }
        }
        return neighbors;
    }


    public boolean isBeenThere() {
        return beenThere;
    }

    public void setBeenThere(boolean beenThere) {
        this.beenThere = beenThere;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getValue() {
        return value;
    }

}