import java.io.*;
import java.util.*;

public class S {

    public static void main(String args[]) throws Exception {
        if (args.length == 0) {
            System.out.println("Provide source File");
            return;
        }

        File file = new File(args[0]);
        file.createNewFile(); // if file not exists it creates the new one

        System.out.println("=======Current File Data========");
        try (BufferedReader br = new BufferedReader(new FileReader(file));) {

            br.lines().forEach(System.out::println);
        }

        Scanner  sc = new Scanner(System.in);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
            String str;
            System.out.println("===== from keyboard  insert data into file if(not): \n Enter 'Exit' to exit from file=====");
            while(!(str = sc.nextLine()).equalsIgnoreCase("exit")){
                bw.write(str);
                bw.newLine();
            }
            System.out.println("----data appended successfully-----");
        }

        System.out.println("==updated file==");
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            br.lines().forEach(System.out::println);
        }
        

    }
}