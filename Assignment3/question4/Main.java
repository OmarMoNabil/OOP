import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner x =  new Scanner(System.in);
        System.out.print("Enter the three sides of the Triangle: ");
        double s1 = x.nextDouble();
        double s2 = x.nextDouble();
        double s3 = x.nextDouble();
        System.out.print("Enter the color of the Triangle: ");
        String color = x.next();
        System.out.print("Enter True/False if the Triangle is filled: ");
        boolean isFilled = x.nextBoolean();

        Triangle t1 = new Triangle(s1,s2,s3,color,isFilled);
        System.out.println("The area of the Triangle is: "+ t1.getArea());
        System.out.println("The perimeter of the Triangle is: "+ t1.getPerimeter());
        System.out.println("The color of the Triangle is: "+ t1.getColor());
        System.out.println("Is the Triangle filled: "+ t1.isFilled());

    }
}