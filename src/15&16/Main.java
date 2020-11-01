import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Сurve curve = new Сurve();
        int Number = sc.nextInt();
        while (Number!=-1) {
            curve.work(Number);
            Number = sc.nextInt();
        }
        
    }
}
