import java.io.*;
import java.util.*;
public class T {
    public static void main(String args[]){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("ffd");
        arr.add("ghj");
        arr.add("kilo");

        LinkedList<String> ll = new LinkedList<>();
        ll.add("yu");
        ll.add("hii");
        ll.add("nm,");
        try{
           
            BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"));
            bw.write("file handling started");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String str;
          
            while((str = br.readLine())!= null){
                arr.add(str);
                ll.add(str);
            }
              

            System.out.println("This is for Arralist");
            for(int i=0;i<arr.size();i++){
                System.out.println(arr.get(i));
            }
            System.out.println("This is for LinkedList");
            for(int i=0;i<ll.size();i++){
                System.out.println(ll.get(i));
            }
        }catch(Exception e){
            System.out.println("Error:"+e);
        }
    }
    
}
