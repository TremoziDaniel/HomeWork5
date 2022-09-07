import java.util.Scanner;

public class hWork3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Площадь чего вы хотите узнать? Введите: 1 - Треугольник, 2 - Четырехугольник, 3 - Круг.");
        int userInput = scan.nextInt();
        double S;

        switch(userInput) {
            case 1:
                S = triangleArea(scan);
                break;
            case 2:
                S = quadrilateralArea(scan);
                break;
            case 3:
                S = circleArea(scan);
                break;
            default:
                System.out.println("Неправильный тип фигуры");
                return;
        }
        System.out.printf("%.2f", S);
    }
    static double triangleArea(Scanner scan){
        System.out.println("Введите значения 3 сторон треугольника");
        double triA = scan.nextDouble();
        double triB = scan.nextDouble();
        double triC = scan.nextDouble();
        double p = (triA + triB + triC) / 2;
        double S = Math.sqrt(p * (p - triA) * (p - triB) * (p - triC));
        return S;
    }
    static double quadrilateralArea(Scanner scan) {
        double quadA = scan.nextDouble();
        double quadB = scan.nextDouble();
        double S = quadA * quadB;
        return S;
    }
    static double circleArea(Scanner scan) {
        double cirR = scan.nextDouble();
        double S = Math.abs(cirR) * Math.PI;
        return S;
    }
}
