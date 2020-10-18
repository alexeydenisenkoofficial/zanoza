import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";

    public static void PrintColoredText(String text, Enum color){
        String text_color="\u001B["+color.getCol_Code()+"m";
        System.out.println(text_color+text+ANSI_RESET);
    }

    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        PrintColoredText(scanner.nextLine(),Enum.BrightMagenta);

    }

}
