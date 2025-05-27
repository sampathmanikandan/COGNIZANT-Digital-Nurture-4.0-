class Car {
    String make;
    String model;
    int year;

    Car(String mk, String mdl, int yr) {
        make = mk;
        model = mdl;
        year = yr;
    }

    void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2022);
        car1.displayDetails();
        car2.displayDetails();
    }
}
