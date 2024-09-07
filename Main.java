package main;
import projects.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1,"toyota",2023,15000.0,"564746"));
        carList.add(new Car(2,"ford",2018,12000.0,"564747"));
        carList.add(new Car(3,"bmw",2021,25000.0,"564748"));
        carList.add(new Car(4,"mazda",2019,23000.0,"564758"));
        while(true){
            System.out.println("\nМеню: " );
            System.out.println("1. Додати нову машину");
            System.out.println("2. Список машин з заданою моделю");
            System.out.println("3. Список автомобілів заданої моделі, які експлуатуються більше n років");
            System.out.println("4. Список автомобілів заданого року випуску, ціна яких більше вказаної");
            System.out.println("5. Вивести список машин ");
            System.out.println("6. Вихід");
            System.out.print("Виберіть пункт меню: ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Введіть номер машини: ");
                    int id = scanner.nextInt();
                    while(IsCaridExists(carList, id)){
                        System.out.println("Машину з таким номером вже існує!");
                        id = scanner.nextInt();
                    }
                    System.out.print("Введіть модель машини: ");
                    String model = scanner.next();
                    System.out.print("Введіть рік випуску машини: ");
                    int year = scanner.nextInt();
                    System.out.print("Введіть ціну машини: ");
                    double price = scanner.nextDouble();
                    System.out.print("Введіть регістраційний номер машини: ");
                    String registrationNumber = scanner.next();
                    Car newCar = new Car(id,model,year,price,registrationNumber);
                    carList.add(newCar);
                    System.out.println("Автомобіль додано успішно!");
                    break;
                case 2:
                    System.out.print("Введіть модель машини: ");
                    String searchModel = scanner.next();
                    System.out.println("Список машин з моделлю " + searchModel + ":");
                    for(Car car : carList){
                        if(car.getModel().equals(searchModel)){
                            System.out.println(car);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Введіть модель машини: ");
                    String modelForExpl = scanner.next();
                    System.out.print("Введіть кількість років, які має бути більше: ");
                    int yearsForExpl = scanner.nextInt();
                    System.out.println("Список автомобілів з моделлю " + modelForExpl + ", які експлуатуються більше " + yearsForExpl + " років:");
                    for(Car car : carList){
                        if(car.getModel().equals(modelForExpl) && 2024-car.getYear()>=yearsForExpl){
                            System.out.println(car);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Введіть рік випуску машини: ");
                    int yearForPrice = scanner.nextInt();
                    System.out.print("Введіть мінімальну ціну машини: ");
                    double minPrice = scanner.nextDouble();
                    System.out.println("Список автомобілів з ріком випуску " + yearForPrice + ", ціна яких більше " + minPrice + ":");
                    for(Car car : carList){
                        if(car.getYear() == yearForPrice && car.getPrice() > minPrice){
                            System.out.println(car);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Список машин:");
                    for(Car car : carList){
                        System.out.println(car);
                    }
                    break;
                case 6:
                    System.out.println("До побачення!");
                    scanner.close();
                    return;

            }
        }

    }
    public static boolean IsCaridExists(List<Car> carList,int id){
        for(Car car : carList){
            if(car.getID() == id){
                return true;
            }
        }
        return false;
    }
}

