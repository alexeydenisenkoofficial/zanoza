import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        StringBuilder patterns= new StringBuilder();
        Map<String, String> map = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int N;
        String symbol1;
        String symbol2;
        String text;


        System.out.println("Введите количнство кол-во замен(N):");
        N = scan.nextInt();
        while (N<1||N>300)
        {
            System.out.println("Неверное количество N! Повторите ввод кол-ва замен(N):");
            N=scan.nextInt();
        }
        System.out.println("Вводите, что заменяем и на что через пробел:");
        int count=0;
        while (N > count) {
            symbol1 = scan.next();
            symbol2 = scan.next();
            map.put(symbol1, symbol2);
            N--;
        }
        System.out.println("Введите текст, в котором нужно применить замены");
        text = scan.next();


        //////// С помощью регулярных выражений
        System.out.println("====С помощью регулярных выражений====");
        List<Map.Entry<String, String>> list2 = new ArrayList<>(map.entrySet());
        for(int i=0;i<list2.size();i++){
            patterns.append(list2.get(i).getKey());
            if(i<list2.size()-1)
                patterns.append("|");
        }
        Pattern patt = Pattern.compile(patterns.toString());
        Matcher match = patt.matcher(text);
        String result = match.replaceAll(h->map.get(h.group()));
        System.out.println(result);


        //////////Без регулярных выражений
        System.out.println("====Без помощи регулярных выражений====");
        Boolean proverka = false;
        String text2 = "";
        String a="";
        List<Map.Entry<String, String>> list1 = new ArrayList<>(map.entrySet());
        for (int j = 0; j < text.length(); j++) {
            proverka = false;
            for (int i = 0; i < list1.size(); i++) {
                if (j + list1.get(i).getKey().length() <= text.length()) {
                    a = text.substring(j, j + list1.get(i).getKey().length());
                    if (a.equals(list1.get(i).getKey())) {
                        proverka = true;
                        text2 += list1.get(i).getValue();
                        j += list1.get(i).getKey().length()-1;
                        break;
                    }
                }
            }
            if(!proverka)
                text2+=text.charAt(j);
        }
        System.out.println(text2);

    }
}
