package projects;
public class Car {
    private int ID;
    private String model;
    private int year;
    private Double price;
    private String registration_number;
    public Car(int ID, String model, int year, Double price, String registration_number) {
        this.ID = ID;
        this.model = model;
        this.year = year;
        this.price = price;
        this.registration_number = registration_number;
    }

    public void setID(int id) {
        this.ID = id;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }
    public int getID() {
        return ID;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public Double getPrice() {
        return price;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    public String toStringId() {
        return "ID: " + this.ID;}
    public String toStringModel() {
        return "Модель: " + this.model;}
    public String toStringYear() {
        return "Рік: " + this.year;}
    public String toStringPrice() {
        return "Ціна: " + this.price;}
    public String toStringRegNumber() {
        return "Реєстраційний номер: " + this.registration_number;}
    public String toString(){
        String str = new String();
        str += this.toStringId() + "\n";
        str += this.toStringModel() + "\n";
        str += this.toStringYear() + "\n";
        str += this.toStringPrice() + "\n";
        str += this.toStringRegNumber() + "\n";
        return str;
    }

}
