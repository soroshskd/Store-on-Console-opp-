import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class SingUp extends JFrame { 
Scanner input = new Scanner (System.in);
static ArrayList<Costomer>COST=new ArrayList();
static ArrayList<Address>ADD=new ArrayList();

/*public void getCostomer(){
Costomer cost = new Costomer();
Address add = new Address();
System.out.print("Please Enter your FirstName : ");
cost.setFirstName(input.next());
System.out.print("Please Enter your LostName : ");
cost.setLastName(input.next());
System.out.print("Please Enter your Code Meli : ");
cost.setCodeMeli(input.nextLong());
System.out.print("Please Enter your Age : ");
cost.setAge(input.nextInt());
System.out.print("Please Enter Gender : ");
cost.setGender(input.next());
System.out.print("Please Enter Number Phone : ");
cost.setNumberPhone(input.nextLong());
cost.setIdCostomer(cost.getCodeMeli());
System.out.print("Please Enter State : ");
add.setState(input.next());
System.out.print("Please Enter City : ");
add.setCity(input.next());
System.out.print("Please Enter StreetName : ");
add.setStreetName(input.next());
System.out.print("Please Enter PostalCode : ");
add.setPostalCode(input.nextLong());
System.out.format("*********\nYour registration was successful\nYour ID is : %d\n",cost.getCodeMeli());
System.out.println("*********");
COST.add(cost);
ADD.add(add);
}*/

public void SingUp () {
Costomer cost = new Costomer();
Address add = new Address();    
Color soroshColor1 = new Color(121,185,122);
soroshColor1.getRGB();
Color soroshColor2 = new Color(167,107,207);
soroshColor2.getRGB();    
this.setSize(369, 666);
this.setTitle("sorosh Brand");
Toolkit tool = this.getToolkit();
Dimension sizeScreen = tool.getScreenSize();
this.setLocation(sizeScreen.width/2-369/2,sizeScreen.height/2-700/2);
JPanel panel = new JPanel();
this.add(panel);
panel.setLayout(new GridLayout(12, 2, 13, 13));
JLabel firstName1 = new JLabel();
panel.add(firstName1);
firstName1.setText(" First Name");
firstName1.setForeground(soroshColor1);

JTextField firstName2 = new JTextField();
panel.add(firstName2);
cost.setFirstName(firstName2.getText());
//---
JLabel lastName1 = new JLabel();
panel.add(lastName1);
lastName1.setText(" Last Name");
lastName1.setForeground(soroshColor1);

JTextField lastName2 = new JTextField();
panel.add(lastName2);
cost.setLastName(lastName2.getText());
//---
JLabel codeMeli1 = new JLabel();
panel.add(codeMeli1);
codeMeli1.setText(" Code Meli");
codeMeli1.setForeground(soroshColor2);

JTextField codeMeli2 = new JTextField();
panel.add(codeMeli2);
String cM1 = codeMeli2.getText();
long cM2 = Long.parseLong(cM1);
cost.setCodeMeli(cM2);
cost.setIdCostomer(cM2);
//---
JLabel age1 = new JLabel();
panel.add(age1);
age1.setText(" age");
age1.setForeground(soroshColor1);

JTextField age2 = new JTextField();
panel.add(age2);
String ag1 = codeMeli2.getText();
int ag2 = Integer.parseInt(ag1);
cost.setAge(ag2);
//---
JLabel gender1 = new JLabel();
panel.add(gender1);
gender1.setText(" Gender");
gender1.setForeground(soroshColor1);

JTextField gender2 = new JTextField();
panel.add(gender2);
cost.setGender(gender2.getText());
//---
JLabel numberPhone1 = new JLabel();
panel.add(numberPhone1);
numberPhone1.setText(" Number Phone");
numberPhone1.setForeground(soroshColor1);

JTextField numberPhone2 = new JTextField();
panel.add(numberPhone2);
String nP1 = codeMeli2.getText();
long nP2 = Long.parseLong(nP1);
cost.setNumberPhone(nP2);
//---
JLabel idCostomer1 = new JLabel();
panel.add(idCostomer1);
idCostomer1.setText(" ID ===>");
idCostomer1.setForeground(Color.RED);

JLabel idCostomer2 = new JLabel();
panel.add(idCostomer2);

//---
JLabel state1 = new JLabel();
panel.add(state1);
state1.setText(" State");
state1.setForeground(soroshColor1);

JTextField state2 = new JTextField();
panel.add(state2);
add.setState(state2.getText());
//---
JLabel city1 = new JLabel();
panel.add(city1);
city1.setText(" City");
city1.setForeground(soroshColor1);

JTextField city2 = new JTextField();
panel.add(city2);
add.setCity(city2.getText());
//---
JLabel streetName1 = new JLabel();
panel.add(streetName1);
streetName1.setText(" Street Name");
streetName1.setForeground(soroshColor1);

JTextField streetName2 = new JTextField();
panel.add(streetName2);
add.setStreetName(streetName2.getText());
//---
JLabel postalCode1 = new JLabel();
panel.add(postalCode1);
postalCode1.setText(" Postal Code");
postalCode1.setForeground(soroshColor1);

JTextField postalCode2 = new JTextField();
panel.add(postalCode2);
String pC1 = postalCode2.getText();
long pC2 = Long.parseLong(pC1);
add.setPostalCode(pC2);
//---
JButton btnSingUp = new JButton();
panel.add(btnSingUp);
btnSingUp.setText("SingUp");
btnSingUp.setBackground(soroshColor2);
btnSingUp.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
    COST.add(cost);
    ADD.add(add);   
    idCostomer2.setText(codeMeli2.getText());
    String s2 = codeMeli2.getText();
    String s3 = "your ID is : "+s2;
    JOptionPane.showMessageDialog(null,s3);
    }
});
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);


}


}
