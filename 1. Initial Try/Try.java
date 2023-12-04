public class Try {
    public static void main (String[] args){
        String str = "Hello, World!";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(i, i + 1));
        }
    }
}
