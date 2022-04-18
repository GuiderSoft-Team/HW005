

public class MainApp {
    public static void main(String[] args) {
        //Test your code


        Wall wall1=new Wall(5,4);
        System.out.println("Width           :"+wall1.getWith() );
        System.out.println("Heigth          :"+wall1.getHeigth());

        System.out.println("1.Duvarın Alanı:"+wall1.alanHesapla());
        System.out.println();

        wall1.setHeigth(-1.5);
        System.out.println("Width          : "+wall1.getWith());
        System.out.println("Height         :"+wall1.getHeigth());
        System.out.println("2.Duvarın Alanı:"+wall1.alanHesapla());



    }
}

