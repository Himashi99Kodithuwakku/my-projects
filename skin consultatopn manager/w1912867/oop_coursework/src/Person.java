import java.util.Date;
public class Person {

    String name;
    String surName;
    Date dateOfBirth;
    int mobileNo;

    public Person (String Name,String Surname,Date DateOFBirth, int MobileNum){
        this.name=Name;
        this.surName=Surname;
        this.dateOfBirth=DateOFBirth;
        this.mobileNo=MobileNum;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }



}

