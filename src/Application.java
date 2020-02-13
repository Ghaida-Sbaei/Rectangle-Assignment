public class Application {
    public static void main(String[] args) {
        Rectangle rectangle1= new Rectangle(3,10);
        Rectangle rectangle2 = new Rectangle(5,6);
        System.out.println("The surface of the rectangle is " +   rectangle1.calculateSurface());
        System.out.println("The surface of the rectangle is " +   rectangle2.calculateSurface());
        System.out.println("**********************************************************");
        System.out.println("The circumference of the rectangle is " +rectangle1.calculateCircumference()) ;
        System.out.println("The circumference of the rectangle is " +rectangle1.calculateCircumference()) ;
        System.out.println("**********************************************************");
        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());


    }



}
