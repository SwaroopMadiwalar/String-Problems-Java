public class RemoveSpecialChars {
    public static void main(String[] args) {

        String str = "$java$&is%cool";

        String plainStr = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(plainStr);
    }
}
