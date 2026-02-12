public class GratestCommonDivisor {
    public int Gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return Gcd(b, a % b);
    }

    public String commonDivisor(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) // if both strings are not equal then return empty string here
            return "";
        int gcd = Gcd(str1.length(), str2.length()); // calculate gcd for strings
        return str1.substring(0, gcd); // return the substring from 0 to gcd
    }

    public static void main(String args[]) {
        String str1 = "AbAb", str2 = "ab";
        GratestCommonDivisor c = new GratestCommonDivisor();
        System.out.print("the gcd of String is =" + c.commonDivisor(str1, str2));

        System.out.print(str1.substring(0));

    }
}