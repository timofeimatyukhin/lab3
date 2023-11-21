import java.io.*;

class Data {
    public int NumberPas;
    public int Height;
    public int Weight;
    public int Age;

    public Data(int temp_NumberPas, int temp_Height, int temp_Weight, int temp_Age) {
        NumberPas = temp_NumberPas;
        Height = temp_Height;
        Weight = temp_Weight;
        Age = temp_Age;
        System.out.println("Person has been created");
    }

    public void print_data() {
        System.out.println("NumberPas:" + NumberPas + " Height:" + Height + " Weight:" + Weight + "  Age:" + Age);
    }

    public void SetNumberPas(Data Data, int NumberPas) {
        Data.NumberPas = NumberPas;
    }

    public void SetHeight(Data Data, int Height) {
        Data.Height = Height;
    }

    public void SetWeight(Data Data, int Weight) {
        Data.Weight = Weight;
    }

    public void SetAge(Data Data, int Age) {
        Data.Age = Age;
    }
}

