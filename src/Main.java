import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first point. Format: \"x y z\":");
        Point point1 = new Point();
        point1.setX(sc.nextDouble());
        point1.setY(sc.nextDouble());
        point1.setZ(sc.nextDouble());

        System.out.println("Enter the coordinates of the second point. Format: \"x y z\":");
        Point point2 = new Point();
        point2.setX(sc.nextDouble());
        point2.setY(sc.nextDouble());
        point2.setZ(sc.nextDouble());

        System.out.println("Enter the coordinates of the third point. Format: \"x y z\":");
        Point point3 = new Point();
        point3.setX(sc.nextDouble());
        point3.setY(sc.nextDouble());
        point3.setZ(sc.nextDouble());

        double length = Math.sqrt((point1.getX() - point2.getX()) * (point1.getX() - point2.getX()) +
                (point1.getY() - point2.getY()) * (point1.getY() - point2.getY()) +
                (point1.getZ() - point2.getZ()) * (point1.getZ() - point2.getZ()))
                + Math.sqrt((point3.getX() - point2.getX()) * (point3.getX() - point2.getX()) +
                (point3.getY() - point2.getY()) * (point3.getY() - point2.getY()) +
                (point3.getZ() - point2.getZ()) * (point3.getZ() - point2.getZ()));
        System.out.println("Distance is " + length);
    }
}
