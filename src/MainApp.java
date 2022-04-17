public class MainApp {
    public static void main(String[] args) {
        //TODO: Test your code
        Wall wall=new Wall(5,4);
        System.out.println("Area: "+wall.gerArea());
        wall.setWidth(5.0);
        wall.setHeight(-1.5);
        System.out.println("Width: "+wall.getWidth());
        System.out.println("Haight: "+wall.getHeight());
        System.out.println("Alan: "+wall.gerArea());

    }
}
