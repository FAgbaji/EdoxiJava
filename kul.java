public final class kul { // creation of class

    // creating 3 variables
    public String y = "Im tired of Dubai";
    public String s = "Qatar 2022 here I come";
    public String h = "I hate java";

    // creating a final integer method
    public final int test() {
        return 800;
    }

    // creating a static method float
    static float greet() {
        return (float) 5.67;
    }

    // printing all values through the main method
    public static void main(String[] args) {
        System.out.println(kul.greet());
        kul yu = new kul();
        System.out.println(yu.y);
        System.out.println(yu.s);
        System.out.println(yu.h);
        System.out.println(yu.test());

    }
}
