import java.util.*;
import java.io.*;
public class Costomer implements Serializable {
Address add = new Address();
private String firstName;
private String lastName;
private long codeMeli;
private int age;
private String Gender;
private long numberPhone;
private long idCostomer;
private Address[] address;

public Costomer() {
}
public Costomer(String firstName, String lastName, long codeMeli, int age, String Gender, long numberPhone, long idCostomer, Address[] address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.codeMeli = codeMeli;
    this.age = age;
    this.Gender = Gender;
    this.numberPhone = numberPhone;
    this.idCostomer = idCostomer;
    this.address = address;
}

public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public String getLastName() {
    return lastName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}

public long getCodeMeli() {
    return codeMeli;
}
public void setCodeMeli(long codeMeli) {
    this.codeMeli = codeMeli;
}

public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}

public String getGender() {
    return Gender;
}
public void setGender(String Gender) {
    this.Gender = Gender;
}

public long getNumberPhone() {
    return numberPhone;
}
public void setNumberPhone(long numberPhone) {
    this.numberPhone = numberPhone;
}

public long getIdCostomer() {
    return idCostomer;
}
public void setIdCostomer(long idCostomer) {
    this.idCostomer = idCostomer;
}

public Address[] getAddress() {
    return address;
}
public void setAddress(Address[] address) {
    this.address = address;
}
}