public class Stringcompression {
    public static String compression(String str) {
        String newstr = "";

        for (int i = 0; i < str.length(); i++) {

            Integer count = 1; // this declaration is just because of next we are converting into string
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {

                count++;
                i++;

            }

            newstr += str.charAt(i);
            if (count > 1) {
                newstr += count.toString();
            }
        }

        return newstr;
    }


    // with string builder 
   public static  String compress(String str){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){

            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i + 1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
              sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "aaabbccddee";
        //System.out.print(compression(str));//a3b2c2d2e2
        System.out.print("the compressed string is:"+compress(str));

    }

}
