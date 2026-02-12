public class BuildBinary {
    public static void printBinaryStr(int n, int lastPlace, StringBuilder str) {
        // Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Always put '0'
        printBinaryStr(n - 1, 0, new StringBuilder(str).append("0"));

        // Put '1' only if last place was '0'
        if (lastPlace == 0) {
            printBinaryStr(n - 1, 1, new StringBuilder(str).append("1"));
        }
    }

    public static void main(String[] args) {
        int n = 3; // example length
        printBinaryStr(n, 0, new StringBuilder());
    }
}
