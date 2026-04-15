public class Circle extends Shape{
    double raduis;
    Circle(double raduis){
        this.raduis = raduis;
    }

    @Override
    double area(){
        return Math.PI * raduis * raduis;
    };


}
