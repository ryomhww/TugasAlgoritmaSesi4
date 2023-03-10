public class No3 {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= i + 3; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}