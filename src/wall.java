public class wall {
    private double width;
    private double height;

    public wall(double with, double log) {
        this.width = with;
        this.height = log;
    }

    public wall() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <0){
            width =0;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <0){
            height =0;
        }
        this.height = height;
    }
    public double getarea(){
        return width * height;
    }


}
