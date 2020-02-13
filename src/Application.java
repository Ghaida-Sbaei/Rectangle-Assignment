public class Application {
    public static void main(String[] args) {
        Rectangle rectangle1= new Rectangle(3,10);
        Rectangle rectangle2 = new Rectangle(5,6);
        rectangle1.calculateSurface();
        rectangle2.calculateSurface();
        System.out.println("**********************************************************");
        rectangle1.calculateCircumference();
        rectangle2.calculateCircumference();
    }


}
