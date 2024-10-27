package abstract_problem_solving;

public class Rectangle extends Shape{
    Rectangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    @Override
    void area() {
        double result = dim1*dim2;
        System.out.println("Area of Rectangle: "+result);
    }
}
