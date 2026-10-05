class Car {
    private String plateNumber;
    private String carModel;
    private double dailyRate;
    private boolean rented;

    public static String companyName = "JUST Rentals";
    public static int totalCars = 0;

    public Car() {
        this.plateNumber = "Unknown";
        this.carModel = "Unknown";
        this.dailyRate = 0.0;
        this.rented = false;
        totalCars++;
    }

    public Car(String plateNumber, String carModel, double dailyRate) {
        this.plateNumber = plateNumber;
        this.carModel = carModel;
        setDailyRate(dailyRate);
        this.rented = false;
        totalCars++;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getModel() {
        return carModel;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public boolean isRented() {
        return rented;
    }

    public void setDailyRate(double rate) {
        if (rate >= 0) {
            this.dailyRate = rate;
        } else {
            System.out.println("Invalid rate! Rent Cannot be negative.");
        }
    }

    public void rent() {
        if (rented) {
            System.out.println("Car " + plateNumber + " is already rented!");
        } else {
            rented = true;
            System.out.println("Car " + plateNumber + " rented successfully.");
        }
    }

    public void returnCar() {
        if (rented) {
            System.out.println("Car " + plateNumber + " is not rented.");
        } else {
            rented = false;
            System.out.println("Car " + plateNumber + " returned.");
        }
    }

    public void displayInfo() {
        System.out.println("Plate: " + plateNumber);
        System.out.println("Model: " + carModel);
        System.out.println("Rate: $" + dailyRate);

        if (rented) {
            System.out.println("Status: Rented");
        } else {
            System.out.println("Status: Available");
        }
        System.out.println();
    }

    public static void displayCompanyName() {
        System.out.println("Company: " + companyName);
    }

    public static void displayTotalCars() {
        System.out.println("Total Cars: " + totalCars);
    }
}

 class TestCar {
    public static void main(String[] args) {
        Car.displayCompanyName();
        System.out.println();

        Car car1 = new Car("ABC-123", "Toyota Camry", 50.0);
        Car car2 = new Car("XYZ-789", "Honda Civic", 45.0);

        Car.displayTotalCars();
        System.out.println();

        car1.displayInfo();
        car2.displayInfo();

        car1.rent();
        car1.rent();

        System.out.println();
        car1.returnCar();

        System.out.println();

        car2.setDailyRate(55.0);
        car2.setDailyRate(-10.0);

        System.out.println();
        car2.displayInfo();
    }
}