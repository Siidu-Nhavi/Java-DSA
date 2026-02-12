public class RemoveDuplicaes {
    public static void rd(String str,int idex,StringBuilder sb,boolean map[]){
        //base case

        if(idex == str.length()){
            System.out.print(sb);
            return;
        }
        // kaam
        char currentChar = str.charAt(idex);
        if(map[currentChar -'a'] == true){
            //duplicates
            rd(str,idex+1,sb,map);
        }else{
            map[currentChar-'a'] = true;
            rd(str,idex+1,sb.append(currentChar),map);
        }
    }
    public static void main(String args[]){
        String str = "apanacolleage";
        rd(str,0,new StringBuilder (" "),new boolean[26]);

    }
    
}

