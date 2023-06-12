import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class WestminsterSkinConsultationManager  implements SkinConsultationManager{

    static int menuNum;
    public ArrayList<Doctor> doctors= new ArrayList<Doctor>(10);
    public LinkedList<Patient> patients = new LinkedList<>();

    static WestminsterSkinConsultationManager wsc = new WestminsterSkinConsultationManager();

    public static void main (String[]args) throws ParseException, IOException {
        Scanner chooseMethod = new Scanner (System.in);

        while (true){
            System.out.println(" Enter 1 to Add a Doctor ");
            System.out.println(" Enter 2 to Delete a Doctor ");
            System.out.println(" Enter 3 to Display Doctor list ");
            System.out.println(" Enter 4 to save in the file ");

            menuNum = chooseMethod.nextInt();

            if (menuNum == 1) {
                wsc.addNewDoctor();

            } else if (menuNum == 2) {
                wsc.deleteDoctor();

            }else if (menuNum == 3 ){
                wsc.displayDoctorList();

            }else if (menuNum == 4){
                wsc.saveFile();
            }
            else{
                System.out.println("Please enter correct number!!!");
            }
        }
    }



    @Override
    public  void addNewDoctor() throws ParseException {
        // taking all the information of a doctor to add him
      Scanner  input1=new Scanner (System.in);
      System.out.print("Enter the name of the doctor");
      String name = input1.next();

      Scanner  input2=new Scanner (System.in);
      System.out.print("Enter the surname of the doctor");
      String surname = input2.next();

      Scanner input3= new Scanner(System.in);
      System.out.print("Enter the date of birth of the doctor(yyyy-MM-dd) : ");
      String dateOfBirth = input3.next();
      Date date;
      date = new SimpleDateFormat("yyyy-MM-dd").parse(dateOfBirth);


      Scanner input4 = new Scanner(System.in);
      System.out.print("Enter the tel no of the doctor : ");
      int telNo = input3.nextInt();

      Scanner input5 = new Scanner(System.in);
      System.out.print("Enter the licence No of the doctor : ");
      int licenceNo = input3.nextInt();

      Scanner input6 = new Scanner(System.in);
      System.out.print("Enter the specialized category of the doctor : ");
      String specialization = input3.next();

    }

    @Override
    public void deleteDoctor() {

            Scanner input10 = new Scanner(System.in);
            System.out.println("Enter the name of the doctor you want to delete: ");
            String deleteDoctor = input10.next();
            boolean check = true;

            for (int x = 0; x < doctors.size(); x++) {
                if (doctors.get(x).getName().equalsIgnoreCase(deleteDoctor)) {
                    System.out.println(deleteDoctor + " has been deleted from the skin consultation.");
                    doctors.remove(x);
                    check = false;
                    System.out.println("-------------------------");
                    break;
                }
            }
            if (check) {
                System.out.println("Couldn't find a driver called " + deleteDoctor + ". Please enter the name again!");
                System.out.println("-------------------------");

            }
        }



    @Override
    public void displayDoctorList() {

        Scanner input13 = new Scanner(System.in);
        System.out.println("Enter the name of the doctor you want to check statistics: ");
        String checkName = input13.next();
        boolean check4 = true;
        for (int i = 0; i < doctors.size(); i++) {
            if ( doctors.get(i).getName().equalsIgnoreCase(checkName)) {
                check4 = false;
                System.out.println("Name :- " +  doctors.get(i).getName() +
                        "\n Surname :- " +  doctors.get(i).getSurName() +
                        "\n Constructor team :- " +  doctors.get(i).getDateOfBirth() +
                        "\n Number of 1st Positions :- " +  doctors.get(i).getMobileNo() +
                        "\n Number of 2nd Positions :- " +  doctors.get(i).getMediLicenceNum() +
                        "\n Number of 3rd Positions :- " +  doctors.get(i).getSpecialization());
                System.out.println("-------------------------");
            }
        }
        if(check4){
            System.out.println("couldn't find a doctor called  "+ checkName + ",Please re-enter the name of the doctor: ");
            System.out.println("-------------------------------------------");
        }
    }

    @Override
    public void saveFile() {

    }


}














