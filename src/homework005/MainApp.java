package homework005;

public class MainApp {
    public static void main(String[] args) {

        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());

        wall.setHeigth(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("heigth= " + wall.getHeigth());
        System.out.println("area= " + wall.getArea());
    }
}
/* OUTPUT:  area= 20.0
            width= 5.0
            heigth= 0.0
             area= 0.0    */