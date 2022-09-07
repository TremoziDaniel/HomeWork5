import java.util.Scanner;

public class hWork1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double flask1 = scan.nextDouble();
        double flask2 = scan.nextDouble();
        System.out.println(verifyTemperature(flask1, flask2));
    }
    static boolean verifyTemperature(double flask1, double flask2){
        if(flask1 > 100 && flask2 < 100)
            return true;
        return  false;
    }
}
