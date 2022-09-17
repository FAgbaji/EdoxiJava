public class javaex {
    public int a;
    public int b;

    public javaex() {

    }

    public javaex(int a1, int b1) {
        a = a1;
        b = b1;
    }

    public static void main(String[] args) {
        javaex a = new javaex(100, 200);

        System.out.println(a.a);
        System.out.println(a.b);
    }
}
