/*public class Main {
    public int x = 5;
    final String s = "I hate java";
    char d = 'd';
    boolean hun = true;
    float usman = 5.67f;

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
        System.out.println(myObj.s);
        System.out.println(myObj.d);
        System.out.println(myObj.hun);
        System.out.println(myObj.usman);
    }
}
*/

public class Main {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 10;
            int result = a + b;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("Im done - finished.");
        }
    }
}
