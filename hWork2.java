import java.sql.SQLOutput;
import java.util.Scanner;

public class hWork2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int direction = scan.nextInt();

        switch(direction) {
            case  1:
                System.out.println("Вверх");
                break;
            case 2:
                System.out.println("Вниз");
                break;
            case 3:
                System.out.println("Вправо");
                break;
            case 4:
                System.out.println("Влево");
                break;
            case 0:
                System.out.println("Не двигаться");
                break;
            default:
                System.out.println("Ошибка!");
        }
    }
}
