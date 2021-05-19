import java.util.Scanner;

public class AreaCirculo {

    private static final double PI = 3.14159;

    public static void main(String[] args) {
        System.out.printf("A=%.4f\n", getCircleArea(new Scanner(System.in).nextDouble()));
    }

    public static Double getCircleArea(Double radius) {
        return PI * Math.pow(radius, 2);
    }
}
