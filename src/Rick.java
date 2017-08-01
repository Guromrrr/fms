/**
 * Created by Мария on 02.08.2017.
 */
import java.util.Scanner;
public class Rick {
    public static void main(String[] args) {
        Scanner Rick = new Scanner( System.in);
        double q,w,e,r, result;
        System.out.println("Введите первое число: ");
        q = Rick.nextDouble();
        System.out.println("Введите второе число: ");
        w = Rick.nextDouble();
        System.out.println("Введите третье число: ");
        e = Rick.nextDouble();
        System.out.println("Введите четвертое число: ");
        r = Rick.nextDouble();
        result = q+w-e+r;
        System.out.println("Сумма равна: " + result);
    }
}
