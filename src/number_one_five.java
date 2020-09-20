import java.util.Scanner;

public class Solution {

    public static int factorial(int N){
        if (N <= 1) {
            return 1;
        } else {
            return N * factorial(N - 1);
        }
    }

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println(factorial(a));
    }

}
