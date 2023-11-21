import java.util.*;
import java.io.*;

class Patient {
    private Service service;
    private Data data;
    private Doctor doctor;

    public Patient(Service service, Data data) {
        this.service = service;
        this.data = data;
        System.out.println("Person has been created");
    }

    public void printPatient() {
        System.out.println("NumberPas:" + data.getNumberPas() + " Height:" + data.getHeight() + " Weight:" + data.getWeight() + "  Age:" + data.getAge() + " Date:" + service.getDate() + " Cost:" + service.getCost());
    }

    public void setDoctor(Doctor doctor) {
        data.setDoctor(doctor);
    }
}

