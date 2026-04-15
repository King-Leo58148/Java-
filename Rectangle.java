public class Rectangle extends Shape{
    double length;
    double breath;

    Rectangle(double length, double breath){
        this.length=length;
        this.breath = breath;
    }

    @Override
    double area(){

        return this.length * this.breath;
    }
}
