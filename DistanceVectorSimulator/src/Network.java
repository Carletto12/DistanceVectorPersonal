import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Network implements Runnable{
    private ArrayList<Node> nodes; // list of nodes
    private int[][] ma; // adiacence matrix
    private int NODE_QUANTITY; // total nodes in network

    public Network() {
        nodes = new ArrayList<>();
        initMA(); // fill matrix from csv file
        initNodes();
        for (Node n : nodes)
            System.out.println(n.id + ") " + n.getDV());
        vicino();
    }

    private void initMA() {
        try {
            /*
             * String currentPath = new java.io.File(".").getCanonicalPath();
             * System.out.println("Current dir:" + currentPath);
             */
            FileReader fr = new FileReader("mat.csv");
            BufferedReader br = new BufferedReader(fr);
            String riga = br.readLine();
            NODE_QUANTITY = Integer.parseInt(riga);
            ma = new int[NODE_QUANTITY][NODE_QUANTITY];
            for (int i = 0; i < NODE_QUANTITY; i++) {
                riga = br.readLine();
                String[] p = riga.split(",");
                for (int j = 0; j < NODE_QUANTITY; j++)
                    ma[i][j] = Integer.parseInt(p[j].trim());
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private void initNodes() {
        for (int i = 0; i < NODE_QUANTITY; i++)
            nodes.add(new Node(i, ma));
    }

    public void test() {
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                System.out.print(ma[i][j] + "|");
            }
            System.out.print("\n");
        }
    }

    public void vicino() {
        for (Node n : nodes) {
            ArrayList<Integer> list = n.getNear();
            System.out.println("\nNodo " + n.tag() + " | Adiacenti:");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(nodes.get(list.get(i)).tag() + " ");
                for (int j = 0; j<nodes.get(i).vector.size(); j++){
                    if (nodes.get(i).vector.get(j) > nodes.get(list.get(i)).vector.get(j) + nodes.get(l);
                }
            }
        }
    }

    @Override
    public void run() {
        while (true){
            //exe dv
        }
    }

}
