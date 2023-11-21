import java.util.ArrayList;

public class Doctor {
    private Data data;
    private Patient patient;
    private int count;

    public Doctor(Data temp_Data, Patient temp_Patient, int temp_Count) {
        data = temp_Data;
        patient = temp_Patient;
        count = temp_Count;
        System.out.println("Person has been created");
    }

    public void print_doctor() {
        System.out.println("NumberPas: " + data.getNumberPas() + " Height: " + data.getHeight() + " Weight: " + data.getWeight() + " Age: " + data.getAge());
    }

    public void printPatients(Doctor doctor) {
        for (int i = 0; i < doctor.getCount(); i++) {
            printPatient(doctor.getPatient().get(i));
        }
    }

    private void printPatient(Patient patient) {
        System.out.println("NumberPas: " + patient.getNumberPas() + " Height: " + patient.getHeight() + " Weight: " + patient.getWeight() + " Age: " + patient.getAge());
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

