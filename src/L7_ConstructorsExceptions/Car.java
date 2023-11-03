package L7_ConstructorsExceptions;

public class Car {

    public static void main(String[] args) {

        Car car1 = new Car("Peugeot 3008", "red", 2023, 225, false);
        Car car2 = new Car("Tesla", "white", false);
        Car car3 = new Car("Nisan", "black", 2018, 170);
        Car car4 = new Car("BMW", 2015, 330, true);
        Car car5 = new Car();

    }

        String name;
        String color;
        int releaseYear;
        int horsePower;
        boolean secondHand;

        public Car(String name, String color, int releaseYear, int horsePower, boolean secondHand) {
            this.name = name;
            this.color = color;
            this.releaseYear = releaseYear;
            this.horsePower = horsePower;
            this.secondHand = secondHand;
        }

        public Car(String name, String color, boolean secondHand) {
            this(name, color, -1, 0, secondHand);

        }

        public Car(String name, String color, int releaseYear, int horsePower) {
            this(name, color, releaseYear, horsePower, false);
        }

        public Car(String name, int releaseYear, int horsePower, boolean secondHand) {
            this(name, "N/A", releaseYear, horsePower, secondHand);
        }

        public Car() {
            this("N/A", "N/A", 0, -1, false);
        }

//    public String getName() {
//        return name;
//    }

//    public  void setName(String name) {
//        name = "Peugeot 3008";
//    }
    }
