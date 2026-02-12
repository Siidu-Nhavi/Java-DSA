import java.io.*;
import java.util.*;
public class FP {
    public static void main(String args[]) throws Exception {
        if(args.length == 0){
            System.out.println("---provide Source file<file>----");
            return;
        }
        File file = new File(args[0]);
        file.createNewFile(); // creates new File if file not exists


       System.out.println("=========current Record=========");
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			br.lines().forEach(System.out::println);
		}

        Scanner sc = new Scanner(System.in);
        System.out.println("enter 'Exit' to stop");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
            String str;
            while (!(str = sc.nextLine()).equalsIgnoreCase("exit")) {
                bw.write(str);
                bw.newLine();
            }
            System.out.println("-=-=-=-=data is appended successfulluy-=-=-=");
        }
        System.out.println("========updated data in the file is=======");
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            br.lines().forEach(System.out::println);
        }
    }

    
}
