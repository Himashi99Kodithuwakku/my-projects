package cw;

import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;

import java.io.IOException;

public class arrayversion {

    static String CustomerName;
    static int queue_1 = 6;
    static int queue_2 = 6;
    static int queue_3 = 6;

    static int fuelStock = 6600;
    static int stockReachvalue = 500;

    static int served= 0;


    //creating three  arrays for 3 queues
    static String[] queue1 = new String[6];
    static String[] queue2 = new String[6];
    static String[] queue3 = new String[6];
    static Scanner chooseMethod = new Scanner(System.in);


    public static void mainMenu() {

        Scanner chooseMethod = new Scanner(System.in);

        //initialize
        initialize(queue1, queue2, queue3);

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
                displayEmptyQueues();

            } else if ((choose.equals("102") || (choose.equalsIgnoreCase("ACQ")))) {
                System.out.println(" Add customer to a queue");
                addToQueue();

            } else if ((choose.equals("103") || (choose.equalsIgnoreCase("RCQ")))) {
                System.out.println("Remove Customer from a Queue");
                removeCustomer();

            } else if ((choose.equals("104") || (choose.equalsIgnoreCase("PCQ")))) {

                removeServedCustomer();

            } else if ((choose.equals("105") || (choose.equalsIgnoreCase("VCS")))) {
                System.out.println("View Customer Sorted in alphabetical order");
                alphabetOrderName();

            } else if ((choose.equals("106") || (choose.equalsIgnoreCase("SPD")))) {
                System.out.println("Store program data into file");
                storeData();


            } else if ((choose.equals("107") || (choose.equalsIgnoreCase("LPD")))) {
                System.out.println("Load program data from file");
                loadData();

            } else if ((choose.equals("108") || (choose.equalsIgnoreCase("STK")))) {
                System.out.println("View Remaining Fuel Stock");
                remainingStock();

            } else if ((choose.equals("109") || (choose.equalsIgnoreCase("AFS")))) {
                System.out.println("Add Fuel Stock");
                addFuelStock();


            } else if ((choose.equals("999") || (choose.equalsIgnoreCase("EXT")))) {
                {
                    System.out.println("Exit the program");
                    break;

                }


            }


        }
    }


    private static void initialize(String[] que1ref, String[] que2ref, String[] que3ref) {
        // creating empty places
        for (int i = 0; i < queue_1; i++) que1ref[i] = "Empty";
        System.out.println("initialise");

        for (int i = 0; i < queue_2; i++) que2ref[i] = "Empty";


        for (int i = 0; i < queue_3; i++) que3ref[i] = "Empty";

    }

    public static void viewAllQueues() {
        //viewing all the queues
        System.out.println("Queue 1\n");

        for (int i = 0; i < queue_1; ) {
            System.out.println(queue1[i]);
            i++;

        }
        System.out.println();
        System.out.println("Queue 2\n");

        for (int i = 0; i < queue_2; ) {
            System.out.println(queue2[i]);
            i++;

        }

        System.out.println(" ");
        System.out.println("Queue 3\n");

        for (int i = 0; i < queue_3; ) {
            System.out.println(queue3[i]);
            i++;

        }

    }


    public static void addToQueue() {
        // add customer into one of the three queue when  customer added they are given  token number to customer.

        System.out.println("Enter queue number (1-3) :");
        int queunum = chooseMethod.nextInt();


        if (queunum == 1) {


            System.out.println("Enter  token number (0-5) :");
            int token = chooseMethod.nextInt();

            System.out.println("Enter  customer name :");
            CustomerName = chooseMethod.next();

            queue1[token] = CustomerName;
            System.out.println("Customer added to the queue 1");
            // reduct 10 liters from the stock
            fuelStock = fuelStock - 10;
            // add 10 liters to served stock
            served = served +10;



        } else if (queunum == 2) {

            System.out.println("Enter  token number (0-5) :");
            int token = chooseMethod.nextInt();

            System.out.println("Enter  customer name :");
            CustomerName = chooseMethod.next();
            queue2[token] = CustomerName;
            System.out.println("Customer added to the queue 2");
            // reduct 10 liters from the stock
            fuelStock = fuelStock - 10;
            // add 10 liters to served stock
            served = served +10;


        } else if (queunum == 3) {

            System.out.println("Enter   token number (0-5) :");
            int token = chooseMethod.nextInt();

            System.out.println("Enter  customer name :");
            CustomerName = chooseMethod.next();
            queue3[token] = CustomerName;
            System.out.println("Customer added to the queue 3");
            // reduct 10 liters from the stock
            fuelStock = fuelStock - 10;
            // add 10 liters to served stock
            served = served +10;


        }
    }


    public static void displayEmptyQueues() {

        // display all the empty places in the queues

        System.out.println("  ");
        System.out.println("Queue 1\n");
        for (int i = 0; i < queue_1; i++) {
            if (queue1[i].equals("Empty")) {
                System.out.println("Empty");
            } else
                System.out.println(" token number" + i + " occupied by " + queue1[i]);
        }
        System.out.println("  ");
        System.out.println("Queue 2\n");
        for (int i = 0; i < queue_2; i++) {
            if (queue2[i].equals("Empty")) {
                System.out.println("Empty");

            } else
                System.out.println(" token number" + i + " occupied by " + queue2[i]);
        }
        System.out.println("  ");
        System.out.println("Queue 3\n");
        for (int i = 0; i < queue_3; i++) {
            if (queue3[i].equals("Empty")) {
                System.out.println("Empty");
            } else
                System.out.println(" token number" + i + " occupied by " + queue3[i]);
        }
    }

    public static void removeCustomer() {

        // remove a customer  from specific location

        int tokenNo;
        System.out.println("Enter queue number :");
        int queunum = chooseMethod.nextInt();

        if (queunum == 1) {
            System.out.println("Enter  token number (0-5) :");
            tokenNo = chooseMethod.nextInt();
            for (int i = 0; i < queue_1; i++) {
                if ((i) == tokenNo) {
                    queue1[i] = "Empty";
                    // when customer remove from the queue ,after that 10 liters add to fuel stock
                    fuelStock = fuelStock + 10;
                    System.out.println("customer " + " " + i + " " + "is Removed");
                }
            }

        } else if (queunum == 2) {

            System.out.println("Enter  token number (0-5):");
            tokenNo = chooseMethod.nextInt();
            for (int i = 0; i < queue_2; i++) {
                if ((i) == tokenNo) {
                    queue2[i] = "Empty";
                    fuelStock = fuelStock + 10;
                    System.out.println("customer " + " " + i + " " + "is Removed");
                }
            }
        } else {
            System.out.println("Enter  token number (0-5):");
            tokenNo = chooseMethod.nextInt();
            for (int i = 0; i < queue_3; i++) {
                if ((i) == tokenNo) {
                    queue3[i] = "Empty";
                    fuelStock = fuelStock + 10;
                    System.out.println("customer " + " " + i + " " + "is Removed");
                }else{
                    System.out.println("");
                }

            }

        }
    }

    public static void removeServedCustomer() {

        // remove  customer after received 10 liters

        System.out.println("Enter queue number:");
        int  queuenum = chooseMethod.nextInt();


         if (queuenum == 1) {
             queue1[0] ="Empty";

             for (int i = 0;i <5;i++){
                 queue1[i] =queue1[i+1];
             }
             queue1[5] ="Empty";

         }

        if (queuenum == 2) {
            queue2[0] ="Empty";

            for (int i = 0;i <5;i++){
                queue2[i] =queue2[i+1];
            }
            queue2[5] ="Empty";

        }

        if (queuenum == 3) {
            queue3[0] ="Empty";

            for (int i = 0;i <5;i++){
                queue3[i] =queue3[i+1];
            }
            queue3[5] ="Empty";
        }




    }


        public static void alphabetOrderName () {

        // display customers name according to alphabetical order

            System.out.println("Enter queue number:");
            int queuenum = chooseMethod.nextInt();

            if (queuenum == 1) {

                // create string array called names
                String temp;
                for (int i = 0; i < queue_1; i++) {
                    for (int j = i + 1; j < queue_1; j++) {

                        // to compare one string with other strings
                        if (queue1[i].compareTo(queue1[j]) > 0) {
                            // swapping
                            temp = queue1[i];
                            queue1[i] = queue1[j];
                            queue1[j] = temp;
                        }
                    }
                }

                // print output array
                System.out.println(
                        "The names in alphabetical order are: ");
                for (int i = 0; i < queue_1; i++) {
                    System.out.println(queue1[i]);
                }

            } else if (queuenum == 2) {
                String temp;
                for (int i = 0; i < queue_2; i++) {
                    for (int j = i + 1; j < queue_2; j++) {

                        // to compare one string with other strings
                        if (queue2[i].compareTo(queue2[j]) > 0) {
                            // swapping
                            temp = queue2[i];
                            queue2[i] = queue2[j];
                            queue2[j] = temp;
                        }
                    }
                }

                // print output array
                System.out.println(
                        "The names in alphabetical order are: ");
                for (int i = 0; i < queue_2; i++) {
                    System.out.println(queue2[i]);
                }

            } else {
                String temp;
                for (int i = 0; i < queue_3; i++) {
                    for (int j = i + 1; j < queue_3; j++) {

                        // to compare one string with other strings
                        if (queue3[i].compareTo(queue3[j]) > 0) {
                            // swapping
                            temp = queue3[i];
                            queue3[i] = queue3[j];
                            queue3[j] = temp;
                        }
                    }
                }

                // print output array
                System.out.println(
                        "The names in alphabetical order are: ");
                for (int i = 0; i < queue_3; i++) {
                    System.out.println(queue3[i]);
                }
            }
        }

        public static void storeData () {
        // store data into a file
            try {
                FileOutputStream storefile = new FileOutputStream("storedata.txt");

                for (int i = 0; i < queue_1; i++) {
                    String filedata;

                    if (queue1[i].equals("empty")) {
                        filedata = "token " + " " + i + " " + "is empty\n";
                    } else
                        filedata = "token " + " " + i + " occupied by " + queue1[i] + "\n";
                    storefile.write(filedata.getBytes());
                }

                for (int i = 0; i < queue_2; i++) {
                    String filedata;

                    if (queue2[i].equals("empty")) {
                        filedata = "token " + " " + i + " " + "is empty\n";
                    } else
                        filedata = "token " + " " + i + " occupied by " + queue2[i] + "\n";
                    storefile.write(filedata.getBytes());
                }

                for (int i = 0; i < queue_3; i++) {
                    String filedata;

                    if (queue3[i].equals("empty")) {
                        filedata = "token " + " " + i + " " + "is empty\n";
                    } else
                        filedata = "token " + " " + i + " occupied by " + queue3[i] + "\n";
                    storefile.write(filedata.getBytes());
                }

                System.out.println("Successfully wrote to the file.");
                storefile.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
            }
        }

        public static void loadData () {
        // load data from  stored file
            try {
                File inputFile = new File("storedata.txt");
                Scanner readfile = new Scanner(inputFile);
                String filedata;
                while (readfile.hasNextLine()) {
                    filedata = readfile.nextLine();
                    System.out.println(filedata);
                }
                readfile.close();
            } catch (IOException e) {
                System.out.println("Error");
            }


        }

        public static void remainingStock () {
        //display remaining  fuel stock

            System.out.println("Remaining Fuel stock " + fuelStock +" l");


            if (fuelStock <= stockReachvalue) {

                System.out.print("Warning!");

            }

        }

        public static void   addFuelStock(){
        // display served fuel stock

        System.out.println("Served fuel stock :" + served+" l");

        }


        public static void main (String[]args){
        //main menu

            mainMenu();
        }


    }



























