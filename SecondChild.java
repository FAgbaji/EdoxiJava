class SecondChild implements Parent, Parent2 {
    public void printP() {
        System.out.println("Africa");
    }

    public void printL() {
        System.out.println("Europe");
    }

    public class Main {
        public static void main(String[] args) {
            System.out.println("I no sabi anything");
            SecondChild oh = new SecondChild();
            oh.printL();
            oh.printP();
        }
    }
}