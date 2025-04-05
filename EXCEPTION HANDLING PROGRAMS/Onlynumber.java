public class Onlynumber {
    public static void main(String[] args) {
        try {
            String s = "abc";
            int num = Integer.parseInt(s);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }
    }
}