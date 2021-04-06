public class HelloWorld {
    public static void main(String[] args) {
        String str1 = "like";
        String str2 = str1.concat(" a dog.");
        char ch = str1.charAt(1);

        StdOut.print(str1.getClass());
    }

    public static void increase(Counter a) {
        a.increment();
    }
}
