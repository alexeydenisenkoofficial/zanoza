import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задайте размер матрицы: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] Arr = new int[size][size];
        System.out.println("Заполните матрицу значениями: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 1; i < Arr.length; i++) {
            Arr[i][0] += Arr[i-1][0];
            Arr[0][i] += Arr[0][i-1];
        }

        for (int i = 1; i <Arr.length ; i++) {
            for (int j = 1; j <Arr.length ; j++) {
                Arr[i][j] = Arr[i][j]+Math.max(Arr[i][j-1],Arr[i-1][j]);
            }
        }
        System.out.println("Max=" + Arr[Arr.length-1][Arr.length-1]);
    }

}
