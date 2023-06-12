package coursework;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class FuelQueue {

    static int queue_1 = 6;
    static int queue_2 = 6;
    static int queue_3 = 6;
    static int queue_4 = 6;
    static int queue_5 = 6;

    static String fileName = "storedata.txt";

    static int fuelStock = 6600;
    static int stockReachvalue = 500;

    static int served = 0;

    static int tokenNum = 0;


    //creating three  arrays for 3 queues
    static main[] queue1 = new main[queue_1];
    static main[] queue2 = new main[queue_2];
    static main[] queue3 = new main[queue_3];
    static main[] queue4 = new main[queue_4];
    static main[] queue5 = new main[queue_5];

    static Scanner chooseMethod = new Scanner(System.in);

    public static void mainMenu() {

        Scanner chooseMethod = new Scanner(System.in);

        //initialize
        initialise();

        //Main menu

        while (true) {

            System.out.println(" ");
            System.out.println("Choose from here");
            System.out.println(" ");
            System.out.println("100 or VFQ -> View all Fuel Queues");
            System.out.println("101 or VEQ -> View all Empty Queue ");
            System.out.println("102 or ACQ -> Add customer to a queue ");
            System.out.println("103 or RCQ -> Remove Customer from a Queue ");
            System.out.println("104 or PCQ -> Remove a served customer ");
            System.out.println("105 or VCS -> View Customer Sorted in alphabetical order ");
            System.out.println("106 or SPD -> Store program data into file ");
            System.out.println("107 or LPD -> Load program data from file ");
            System.out.println("108 or STK -> View Remaining Fuel Stock ");
            System.out.println("109 or AFS -> Add Fuel Stock ");
            System.out.println("110 or IFQ -> Income of each Fuel Queue ");
            System.out.println("999 or EXT -> Exit the program");
            System.out.println(" ");
            System.out.print("Enter the menu number or code -> ");
            String choose = chooseMethod.next();
            System.out.println(" ");


            // getting input


            if ((choose.equals("100") || (choose.equalsIgnoreCase("VCQ")))) {
                System.out.println("View all Fuel Queues");
                viewAllQueues();

            } else if ((choose.equals("101") || (choose.equalsIgnoreCase("VEQ")))) {
                System.out.println("View all empty  Queues");
                //  displayEmptyQueues();

            } else if ((choose.equals("102") || (choose.equalsIgnoreCase("ACQ")))) {
                System.out.println(" Add customer to a queue");
                addPassenger();


            } else if ((choose.equals("103") || (choose.equalsIgnoreCase("RCQ")))) {
                System.out.println("Remove Customer from a Queue");
                //  removeCustomer();

            } else if ((choose.equals("104") || (choose.equalsIgnoreCase("PCQ")))) {

                // removeServedCustomer();

            } else if ((choose.equals("105") || (choose.equalsIgnoreCase("VCS")))) {
                System.out.println("View Customer Sorted in alphabetical order");
                //  alphabetOrderName();

            } else if ((choose.equals("106") || (choose.equalsIgnoreCase("SPD")))) {
                System.out.println("Store program data into file");
                //   storeData();


            } else if ((choose.equals("107") || (choose.equalsIgnoreCase("LPD")))) {
                System.out.println("Load program data from file");
                // loadData();

            } else if ((choose.equals("108") || (choose.equalsIgnoreCase("STK")))) {
                System.out.println("View Remaining Fuel Stock");
                //  remainingStock();

            } else if ((choose.equals("109") || (choose.equalsIgnoreCase("AFS")))) {
                System.out.println("Add Fuel Stock");
                //  addFuelStock();

            } else if ((choose.equals("110") || (choose.equalsIgnoreCase("IFQ")))) {
                System.out.println("Income of each Fuel Queue");
                //incomeFuelQueue


            } else if ((choose.equals("999") || (choose.equalsIgnoreCase("EXT")))) {
                {
                    System.out.println("Exit the program");
                    break;


                }
            }

        }
    }

    private static void initialise() {
        for (int i = 0; i < queue_1; i++) {
            queue1[i] = new main();
            queue1[i].setTokenNumber(i);
        }
        for (int i = 0; i < queue_2; i++) {
            queue1[i] = new main();
            queue1[i].setTokenNumber(i);
        }
        System.out.println("initialise");
    }

    // adding passengers to cabins
    private static int addPassenger() {
        System.out.println("Enter Queue number (1-5) : ");
        int queuenum = chooseMethod.nextInt();

        if (queuenum == 1) {

            System.out.println("Enter token number (0-5) : ");
            int tokenNum = chooseMethod.nextInt();


            if (!queue1[tokenNum].isFull()) {
                System.out.println("Enter the first name :");
                String fname = chooseMethod.next();
                System.out.println("Enter the last name :");
                String lname = chooseMethod.next();
                System.out.println("Enter the Vehicle number :");
                String vehicleNo = chooseMethod.next();
                System.out.println("Enter the number of liters required :");
                int noofliters = chooseMethod.nextInt();

                Passenger passenger = new Passenger(fname, lname, vehicleNo, noofliters);
                queue1[tokenNum].addPassenger(passenger);
                System.out.println("token " + tokenNum + " is successfully booked");
            } else {
                System.out.println("queue 1 " + tokenNum + " is full");
            }


        }else if ( queuenum == 2){

            System.out.println("Enter token number (0-5) : ");
            int tokenNum = chooseMethod.nextInt();


            if (!queue2[tokenNum].isFull()) {
                System.out.println("Enter the first name :");
                String fname = chooseMethod.next();
                System.out.println("Enter the last name :");
                String lname = chooseMethod.next();
                System.out.println("Enter the Vehicle number :");
                String vehicleNo = chooseMethod.next();
                System.out.println("Enter the number of liters required :");
                int noofliters = chooseMethod.nextInt();

                Passenger passenger = new Passenger(fname, lname, vehicleNo, noofliters);
                queue2[tokenNum].addPassenger(passenger);
                System.out.println("token " + tokenNum + " is successfully booked");
            } else {
                System.out.println("queue 1 " + tokenNum + " is full");
            }


        }
        return tokenNum;
    }


    // viewing the data in queues
    public static void viewAllQueues() {
        //viewing the queue q
        System.out.println("Queue 1\n");
        for (int i = 0; i < queue_1; i++) {
            System.out.println("token" + " " + i + " " + "occupied by" + " " + queue1[i]);
        }

        System.out.println(" ");
        System.out.println("Queue 2\n");
        for (int i = 0; i < queue_2; i++) {
            System.out.println("token" + " " + i + " " + "occupied by" + " " + queue2[i]);
        }
    }

    public static void main(String[] args) {
        mainMenu();


    }

}













