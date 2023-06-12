package coursework;

import java.io.Serializable;
import java.util.Arrays;

public class main implements Serializable  {

    private int tokenNumber;
    //array for  passengers
     private Passenger [] passengers = new Passenger[1];



    // No argument constructor
    public main() {

    }

    public main( int tokenNumber, Passenger [] passengers){
        this.tokenNumber =tokenNumber;
        this.passengers=passengers;

    }

    //getter for the token number
    public int getTokenNumber() {
        return tokenNumber;
    }

    //setter for the token number
    public void setTokenNumber(int tokenNumber) {
        this.tokenNumber = tokenNumber;
    }

    //getter for the passengers
    public Passenger[] getPassengers() {
        return passengers;
    }

    //setter for the passengers
    public void setPassenger(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public void addPassenger(Passenger passenger) {
        for (int i = 0; i < 6; i++) {
            if (passengers[i] == null) {
                passengers[i] = passenger;
                break;

            }
        }

    }


    //function to check if cabin is full
    public boolean isFull() {
        return passengers[0] != null ;
    }


    //function to check if cabin is empty
    public boolean isEmpty() {
        return passengers[0] == null ;
    }

   @Override
    public String toString(){
        return "Queue1 -" + "token number" + tokenNumber+"passengers :"+ Arrays.toString(passengers);
   }
}





