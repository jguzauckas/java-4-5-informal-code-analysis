public class NotesRuntime1 {
    public static void main(String[] args) {
        // Approach 1
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        // Approach 2
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}
