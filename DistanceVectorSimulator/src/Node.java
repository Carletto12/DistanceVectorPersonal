import java.util.ArrayList;

public class Node extends Thread {
    char id;
    private ArrayList<Integer> vector;

    Node(int id, int[][] ma) {
        this.id = (char) (id + 65);
        this.vector = new ArrayList<>();
        init(id, ma);
    }

    synchronized void init(int riga, int[][] ma) {
        for (int i = 0; i < ma[riga].length; i++) {
            vector.add(ma[riga][i]);
        }
    }

    String getDV() {
        String d = "";
        for (Integer i : vector)
            d += i + "|";
        return d;
    }
}
