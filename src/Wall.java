public class Wall {
    private double width;
    private double height;

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Wall() {

    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double areaHesapla(){
        double width = getWidth() > 0 ? getWidth() : 0;
        double height = getHeight() > 0 ? getHeight() : 0;
        return width*height;
    }
}
