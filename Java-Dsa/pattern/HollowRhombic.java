public class HollowRhombic {
    public static void main(String args[]) {
        int n = 5; // Size of the rhombus

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            System.out.print(" ".repeat(n - i));

            // Print stars and hollow spaces
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("*"); // Print boundary stars
                } else {
                    System.out.print(" "); // Print hollow space
                }
            }

            System.out.println(); // Move to the next line
        }
    }
}
