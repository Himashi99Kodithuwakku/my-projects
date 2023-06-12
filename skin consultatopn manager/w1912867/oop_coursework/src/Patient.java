import java.util.Date;

public class Patient extends Person {

    int patientNum;

    public Patient ( String Name,String Surname, Date DateOFBirth, int MobileNum, int patientNum){
        super(Name,Surname,DateOFBirth,MobileNum);
        this.patientNum=patientNum;
    }

    public int getPatientNum() {
        return patientNum;
    }

    public void setPatientNum(int patientNum) {
        this.patientNum = patientNum;
    }
}
