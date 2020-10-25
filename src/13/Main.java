import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        People Mark = new People();
        try {
            System.out.println("Введите рост человека");
            Scanner scan = new Scanner(System.in);
            int height = Integer.parseInt(scan.nextLine());
            System.out.println("Введите возраст человека");
            int age = Integer.parseInt(scan.nextLine());
            Mark.comprasionheightage(height,age);
            System.out.println("Нет исключений");
        }
        catch (MyExc e) {
            System.out.println("Введён неправдоподобный рост или возраст");
        }
        catch (NumberFormatException ee) {
            System.out.println("Неправильный тип даннах на ввод");
        }
        finally {
            System.out.println(Mark);
        }

        throw new RuntimeException();
    }
}
