package coursework;

import java.io.Serializable;

public class Passenger implements Serializable {

    private String firstName;
    private String lastName;
    private String vehicleNo;
    private int noOfLiters;


    public Passenger (String firstName,String lastName,String vehicleNo,int noOfLiters){

        this.firstName = firstName;
        this.lastName= lastName;
        this.noOfLiters = noOfLiters;
        this.vehicleNo = vehicleNo;

    }
    //getter for the first name
    public  String getFirstName() {
        return firstName;
    }
    //setter for the first name
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }


    //getter for the last name
    public  String getLastName() {
        return firstName;
    }
    //setter for the last name
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    //getter to get the vehicle number
    public String getVehicleNumber() {
        return vehicleNo;
    }

    //setter to set  the vehicle number
    public void setVehicleNumber(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    //getter to get the number of liters
    public int getNoOfLiters() {
        return noOfLiters;
    }

    //setter to set  the vehicle number
    public void setNoOfLiters(int  noOfLiters) {
        this.noOfLiters = noOfLiters;
    }

    //to convert the object into a string
    @Override
    public String toString() {
        return "Passenger" +
                "First name:" + firstName + '\'' +
                " Last name:" + lastName + '\'' +
                " Vehicle No:" + vehicleNo + '\'' +
                "Number of liters required:" +noOfLiters;
    }


}
