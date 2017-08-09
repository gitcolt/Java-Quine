public class Quine {
    public static void main(String[] args) {
        char quote = (char)34;
        String s = "public class Quine { public static void main(String[] args) { char quote = (char)34; String s = ;System.out.println(s.substring(0, 96) + quote + s + quote + s.substring(96, s.length()));}}";
        System.out.println(s.substring(0, 96) + quote + s + quote + s.substring(96, s.length()));
    }
}
