abstract class Figure {
    public abstract double calculateSquare();
    public abstract double calculatePerimeter();

    public void showInfo() {
        System.out.println("Figure name: " + this.getClass().getName() + "\nPerimeter: " + this.calculatePerimeter() + "\nSquare: " + this.calculateSquare());
    }
}

class Rectangle extends Figure {
    private double width;
    private double height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateSquare() {
        return height * width;
    }

    @Override
    public double calculatePerimeter() {
        return (height + width) * 2;
    }
}

class Circle extends Figure {

    private final double PI = 3.14;
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSquare() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}

class Triangle extends Figure {

    private double base;
    private double a;
    private double b;
    private double height;
    Triangle(double height, double base, double a, double b) {
        this.height = height;
        this.base = base;
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateSquare() {
        return (base * height) / 2;
    }

    @Override
    public double calculatePerimeter() {
       return a + b + base;
    }
}

class FigureTest {
    public static void main(String[] args) {
        Figure [] figure = {new Circle(25.0), new Rectangle(25.5, 38.4), new Triangle(19.3, 30.0, 21.0,21.0), new Circle(30.0), new Rectangle(24.1, 43.2)};

        System.out.print("Sum of perimeters: ");
        double sum = 0;
        for(Figure fig: figure) {
            sum += fig.calculatePerimeter();
        }
        System.out.println(sum);
        System.out.println();
        
        Rectangle rec = new Rectangle(20.0, 15.0);
        rec.showInfo();
    }
}