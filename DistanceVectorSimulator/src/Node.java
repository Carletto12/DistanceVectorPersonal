import java.util.ArrayList;

public class Node extends Thread {
    int id;
    ArrayList<Integer> vector;

    Node(int id, int[][] ma) {
        this.id = id;
        this.vector = new ArrayList<>();
        init(id, ma);
    }

    synchronized void init(int riga, int[][] ma) {
        for (int i = 0; i < ma[riga].length; i++) {
            vector.add(ma[riga][i]);
        }
    }

    public String tag() {
        return "" + (char) (id + 65);
    }

    String getDV() {
        String d = "";
        for (Integer i : vector)
            d += i + "|";
        return d;
    }

    ArrayList<Integer> getNear() {
        ArrayList<Integer> p = new ArrayList<>();
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) > 0) {
                p.add(i);
            }
        }
        return p;
    }
}
