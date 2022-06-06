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

        if(width<0){
            return 0;
        }
        return width;
    }

    public void setWidth(double width) {
        if(width<0){
            width=0;
        }
        this.width = width;
    }

    public double getHeight() {
        if(height<0){
            return 0;
        }
        return height;
    }

    public void setHeight(double height) {
        if(height<0){
            height=0;
        }
        this.height = height;
    }

    public double getArea(){

        return height*width;
    }
}