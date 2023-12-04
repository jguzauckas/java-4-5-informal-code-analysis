public class Do {
    public static void main (String[] args){
        for (int i = 0; i < 20; i += 2) {
            for (int j = 0; j < i; j += 3) {
                System.out.println(i + " " + j);
            }
        }

        for (int k = 30; k > 10; k -= 4) {
            for (int l = 15; l < k; l++) {
                System.out.println(k + " " + l);
            }
        }
    }
}
