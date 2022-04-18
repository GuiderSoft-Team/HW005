

public class Wall {
    private double with;
    private double heigth;


    public Wall(double with, double heigth) {
        this.with = with;
        this.heigth = heigth;


    }

    public Wall() {
    }

    public double getWith() {
        return with;
    }

    public void setWith(double with) {
        this.with=with;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;

    }


    public double alanHesapla() {
        //double width = getWith()<0?:getWith()=0;
        //double height = getHeigth()<0?:getHeigth()=0;
        return 0 ;//width  height;
    }
}
