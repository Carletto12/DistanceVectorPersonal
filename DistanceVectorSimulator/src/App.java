public class App {
    public static void main(String[] args) throws Exception {
        Network network = new Network();
        System.out.println("\n");
        Thread main = new Thread(network);
        main.start();
    }
}
