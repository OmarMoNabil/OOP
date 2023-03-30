public abstract class GeometricObject {
    private double s1;
    private double s2;
    private double s3;
    private double area;
    private double perimeter;

    public double getS1() {
        return s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getS3() {
        return s3;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

    public GeometricObject(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double getArea() {
        if ((s1 + s2) > s3 && (s1 + s3) > s2 && (s2 + s3) > s1) {
            double s = (s1 + s2 + s3) / 2;
            area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
            return area;
        }
        return 0;
    }

    public double getPerimeter(){
        return s1+s2+s3;
    }
}
