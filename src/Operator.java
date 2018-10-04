import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float height;
        float weight;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        height = sc.nextFloat();
        System.out.println("Enter weight: ");
        weight = sc.nextFloat();
        float area = weight * height;
        System.out.println("Area is: " + area);
    }
}
