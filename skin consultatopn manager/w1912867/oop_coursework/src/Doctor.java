import java.util.Date;

public class Doctor extends Person {

    String specialization;
    int mediLicenceNum;

    public Doctor (String Name, String Surname, Date DateOFBirth, int MobileNum, String specialization, int mediLicenceNum){
        super(Name,Surname,DateOFBirth,MobileNum);
        this.mediLicenceNum=mediLicenceNum;
        this.specialization=specialization;


    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getMediLicenceNum() {
        return mediLicenceNum;


    }

    public void setMediLicenceNum(int mediLicenceNum) {
        this.mediLicenceNum = mediLicenceNum;
    }
}
