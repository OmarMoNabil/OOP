public class Triangle extends GeometricObject{
    private String color;
    private boolean isFilled;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public Triangle(double s1, double s2, double s3, String color, boolean isFilled) {
        super(s1,s2,s3);
        this.color = color;
        this.isFilled = isFilled;
    }
}
