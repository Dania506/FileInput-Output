package File;

import java.io.*;
import java.util.ArrayList;


public class Program {
    public static void main(String[] args) {
        Car []cars ={ new Car(11,"Ford",12,1990,"Red",123454),
                new Car(12,"Ford1",12,1990,"Red",123454),
                new Car(13,"Ford2",12,1990,"Red",123454),
                new Car(14,"Ford3",12,1990,"Red",123454),
                new Car(15,"Ford4",12,1990,"Red",123454),
                new Car(16,"Ford5",12,1990,"Red",123454),
                new Car(17,"Ford6",12,1990,"Red",123454),
                          };

      //  saveToFile(cars, "cars.csv");
        ArrayList<Car> listCar = getCarsListFromFile("cars.csv");
        System.out.println(listCar);


        BufferedReader console = new BufferedReader (new InputStreamReader(System.in));
        String brand = null;
        try {
            System.out.println("Enter Brand");
            brand = console.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<Car> listFord1 = getCarsByBrand(listCar, brand);
        System.out.println(listFord1);

    }


    private static ArrayList<Car> getCarsByBrand(ArrayList<Car> listCar, String brand) {
        ArrayList<Car> listFord1 = new ArrayList<>();
        for (Car car: listCar) {
            if (car.getBrand().equals(brand))
                listFord1.add(car);

        }
        return listFord1;
    }

    private static ArrayList<Car> getCarsListFromFile(String fileName) {
        ArrayList<Car> listCar = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String str = null;
            while ((str = br.readLine())!=null){
             String [] words =str.split(";");
             if (words[0].equals("Car"))
             listCar.add(new Car(Integer.parseInt(words[1]),
                     words[2],
                     Integer.parseInt(words[3]),
                     Integer.parseInt(words[4]),
                     words[5],
                     Integer.parseInt(words[6])
                     ));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listCar;
    }

    private static void saveToFile(Car[] cars, String fileName) {
        try(FileWriter fw = new FileWriter(fileName)){
            for (Car car:cars) {
                fw.write(car.toCSV());
                fw.write("\n");
            }
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
