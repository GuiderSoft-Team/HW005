import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("type width ");
        double width=input.nextDouble();
        System.out.println("type heigt");
        double height= input.nextDouble();

        Wall nesne1=new Wall(width,height);
        System.out.println("width:"+nesne1.getWidth());
        System.out.println("height:"+nesne1.getHeight());
        System.out.println("area:" +nesne1.getArea());


    }
}
