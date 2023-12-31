package nestedClass.inner_class;

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

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }
    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public class Engine {
        private int horsePower;

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
        Car car = new Car("Black",3);
        Car.Engine engine = car.new Engine(249);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);
    }
}


