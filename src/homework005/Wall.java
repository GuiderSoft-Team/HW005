package homework005;

public class Wall {
    private double width;
    private double heigth;

    public Wall() {
    }

    public Wall(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setWidth(double width) {
        if (width < 0) {
            width = 0;
        }
        this.width = width;
    }
    public void setHeigth(double heigth) {
        if (heigth < 0) {
            heigth = 0;
        }
        this.heigth = heigth;
    }
    public double getArea() {
        return width * heigth;
    }
}