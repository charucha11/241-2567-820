import java.util.Scanner;
public class Lab2Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cylinder radius: "); double radius = scanner.nextDouble();
        System.out.print("Enter cylinder height: "); double height = scanner.nextDouble();
        double surfaceArea = 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
        double volume = Math.PI * radius * radius * height;
        System.out.printf("\nCylinder radius: %.2f\n", radius);
        System.out.printf("Cylinder height: %.2f\n", height);
        System.out.printf("Surface area = %.0f\n", surfaceArea);
        System.out.printf("Volume = %.0f\n", volume);

        scanner.close();
    }
}