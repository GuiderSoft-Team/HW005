public class MainApp {
    public static void main(String[] args) {
        //TODO: Test your code
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        System.out.println("-".repeat(20));
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());





    }
}
