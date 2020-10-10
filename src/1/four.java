import java.util.Random;
import java.util.Arrays;

    public class four  {
        public static void main(String[] args) {

            int Size=10;
            int[] Arr = new int[Size];
            Random rand = new Random();
            System.out.println("Заполним массив, используя \"Math.random()\" ");
            
            for (int i = 0; i < Size; i++){
                double b= Math.round(Math.random() * 100);
                Arr[i]=(int) b;
                System.out.print(Arr[i] + " ");
            }
            System.out.println();
            Arrays.sort(Arr);
            System.out.println("Выводим отсортированный массив: ");
            
            for (int i = 0; i < Size; i++){
                System.out.print(Arr[i] + " ");
            }
            System.out.println();
            System.out.println("Заполним массив, используя \"класс Random\" ");
            
            for (int i = 0; i < Size; i++){
                double b= Math.round(rand.nextDouble() * 100);
                Arr[i]=(int) b;
                System.out.print(Arr[i] + " ");
            }
            Arrays.sort(Arr);
            System.out.println();
            System.out.println("Выводим отсортированный массив: ");
            
            for (int i = 0; i < Size; i++){
                System.out.print(Arr[i] + " ");
            }
        }
    }
