public class Understanding {
    public static void main (String[] args){
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        for (int j = 100; j >= 0; j--) {
            if (j > 50 && j % 5 == 0) {
                System.out.println(j);
            }
        }
    }
}