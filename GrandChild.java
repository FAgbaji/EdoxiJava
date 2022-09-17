public class GrandChild {
    public void disp() {
        System.out.println("This is the grand child");
    }
}

class GrandFather extends GrandChild {
    public void disp() {
        System.out.println("This is the Grand  Father");
    }
}

class Father extends GrandChild {
    public void disp() {
        System.out.println("This is the Father");
    }

}

class GreatGrandSon extends GrandFather {
    public void disp() {
        System.out.println("This is the great grandson");
    }

    public static void main(String args[]) {

        GreatGrandSon obj = new GreatGrandSon();
        obj.disp();
    }
}
