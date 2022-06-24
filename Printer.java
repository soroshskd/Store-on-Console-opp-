import java.util.*;
import java.io.*;
public class Printer extends SingUp {
Scanner input = new Scanner(System.in);

public void Print(){
    SingUp sing = new SingUp();
Menu menu = new Menu();
while(true){
menu.mainMenu();
int get = input.nextInt();
    if (get==1) {    
    System.out.print("Please Enter your ID : ");
    long getId = input.nextLong();
    FileInputStream read1;
    ObjectInputStream read2;
    Costomer read = null;
    try {
        read1 = new FileInputStream("sorosh.txt");
        read2 = new ObjectInputStream(read1);
        read = (Costomer) read2.readObject();
        read2.close();
    } catch (Exception e) {
         System.out.println("Error.");
    }
    System.out.format("\nHi %s\n\n",read.getFirstName());
            System.out.format("First Name : %s\n"
                            + "Last Name : %s\n"
                            + "Code Meli : %d\n"
                            + "Age : %d\n"
                            + "Gender : %s\n"
                            + "Number Phone : %d\n"
                            + "Address:\n"
                            + "%s\n\n",read.getFirstName(),
                            read.getLastName(),read.getCodeMeli(),read.getAge(),
                            read.getGender(),read.getNumberPhone(),read.getAddress());
        /*for (int i = 0; i < COST.size()  ; i++) {
            if (getId==COST.get(i).getCodeMeli()) {
            System.out.format("\nHi %s\n\n",COST.get(i).getFirstName());
            System.out.format("First Name : %s\n"
                            + "Last Name : %s\n"
                            + "Code Meli : %d\n"
                            + "Age : %d\n"
                            + "Gender : %s\n"
                            + "Number Phone : %d\n"
                            + "Address:\n"
                            + "%s,%s,%s (PostalCode : %d)\n\n",COST.get(i).getFirstName(),
                            COST.get(i).getLastName(),COST.get(i).getCodeMeli(),COST.get(i).getAge(),
                            COST.get(i).getGender(),COST.get(i).getNumberPhone(),ADD.get(i).getState(),
                            ADD.get(i).getCity(),ADD.get(i).getStreetName(),ADD.get(i).getPostalCode());
            }else {
            System.out.println("You are not a member of sorosh's app.");
            }*/
    
        
    }else if (get==2) {
    sing.SingUp();
    try {
        FileOutputStream save1 = new FileOutputStream("sorosh.txt");
        ObjectOutputStream save2 = new ObjectOutputStream(save1);
        for(Costomer C:COST){
        save2.writeObject(C);
        }
        save2.flush();
    } catch (IOException ex) {
        System.out.println("Error.");
    }
   
    
    }else if (get==3) {
    break;    
    }
}
}
}