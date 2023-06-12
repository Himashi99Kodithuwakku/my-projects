import java.text.ParseException;

public interface SkinConsultationManager {

    void addNewDoctor () throws ParseException;
    void deleteDoctor();
    void displayDoctorList ();
    void saveFile ();

}
