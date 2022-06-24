import java.util.*;
import java.io.*;
public class Address implements Serializable {

private String state;
private String city;
private String streetName;
private long postalCode;

public Address() {
}

public Address(String state, String city, String streetName, long postalCode) {
    this.state = state;
    this.city = city;
    this.streetName = streetName;
    this.postalCode = postalCode;
}

public String getState() {
    return state;
}
public void setState(String state) {
    this.state = state;
}

public String getCity() {
    return city;
}
public void setCity(String city) {
    this.city = city;
}

public String getStreetName() {
    return streetName;
}
public void setStreetName(String streetName) {
    this.streetName = streetName;
}

public long getPostalCode() {
    return postalCode;
}
public void setPostalCode(long postalCode) {
    this.postalCode = postalCode;
}
}