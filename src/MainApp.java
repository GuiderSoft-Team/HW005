public class MainApp {
    public static void main(String[] args) {
        wall wall=new wall(5,4);
         System.out.println("area= " + wall.getarea());

         wall.setHeight(-1.5);
         System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
         System.out.println("area= " + wall.getarea());
    }
}
