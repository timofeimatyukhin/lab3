import java.util.Arrays;

public class Hospital {
    private Patient[] patients;
    private Doctor[] doctors;
    private int countPatients;
    private int countDoctors;

    public Hospital(Patient[] patients, Doctor[] doctors, int countPatients, int countDoctors) {
        this.patients = patients;
        this.doctors = doctors;
        this.countPatients = countPatients;
        this.countDoctors = countDoctors;
    }

    public void setPatient(Patient patient) {
        this.patients = new Patient[]{patient};
    }

    public void setDoctor(Doctor doctor) {
        this.doctors = new Doctor[]{doctor};
    }
}

