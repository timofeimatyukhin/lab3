import java.util.*;

class Service {
    String date;
    int cost;

    Service(String temp_date, int temp_cost) {
        date = temp_date;
        cost = temp_cost;
        System.out.println("Service has been created");
    }

    void printService() {
        System.out.println("Date: " + date + " Cost: " + cost);
    }
}

