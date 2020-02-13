public class Rectangle {
    private int height;
    private int width;
    private int surface;
    private int circumference;

    public  Rectangle(int height,int width){
        this.height=height;
        this.width=width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int calculateSurface(){
        surface=height*width;
        System.out.println("The surface of the rectangle is " + surface);
        return surface;

    }
    public int calculateCircumference(){
        circumference = (2*width + 2*height);
        System.out.println("The circumference of the rectangle is " +circumference);
        return circumference;

    }
}
