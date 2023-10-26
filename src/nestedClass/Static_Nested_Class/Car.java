package nestedClass.Static_Nested_Class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    @Override
    public String toString() {
        return "My Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    public static class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(249);
        System.out.println(e);
        Car car = new Car("Red", 2, e);
        System.out.println(car);
    }
}
