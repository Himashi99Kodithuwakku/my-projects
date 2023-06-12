package coursework;

public class Passenger {


    private  String firstName;
    private String  lastName;
    private String vehicleNo;
    private int noOfLiters = 0;

    public  Passenger(String firstName,String lastName,String vehicleNo, int noOfLiters){



        this.firstName = firstName;
        this.lastName = lastName;
        this.vehicleNo =vehicleNo;
        this.noOfLiters= noOfLiters;
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

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {

        this.vehicleNo = vehicleNo;
    }


    public int getNoOfLiters() {

        return noOfLiters;
    }

    public void setNoOfLiters(int noOfLiters) {

        this.noOfLiters = noOfLiters;
    }


}





