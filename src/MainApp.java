public class MainApp {
    public static void main(String[] args) {

        Wall wall=new Wall(5,4);
        Wall wall1=new Wall(1,-5);
        System.out.println("Heigth="+wall.getHeight());
        System.out.println("Width="+wall.getWidth());
        System.out.println("Area="+wall.areaHesapla());
        System.out.println("Area="+wall1.areaHesapla());


    }
}
