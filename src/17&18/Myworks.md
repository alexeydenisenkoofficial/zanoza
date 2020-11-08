******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba1/four.java **********************
package laba1;

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
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba1/one.java **********************
package laba1;

public class one {
    public static void main (String[] args)
    {
        int Size=5,j=0;
        int Summa=0;
        int Arr[]=new int[Size];
        while(j<Size)
        {
            Arr[j]=j+1;
            j++;
        }
        for (int i=0;i<Size;i++)
        {
            Summa+=Arr[i];
        }
        System.out.print(Summa+" ");
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba1/Solution.java **********************
package laba1;

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
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba1/three.java **********************
package laba1;

public class three {
    public static void main(String[] args)
    {
        for (int i=1;i<=10;i++)
            System.out.printf("%.3f%n", 1d/i);
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba1/two.java **********************
package laba1;

public class two {
    public static void main(String[] args)
    {
        for (int i=0; i<args.length; i++)
        {
            System.out.println("Аргумент "+args[i]);
        }
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba10/Main.java **********************
package laba10;

import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
                    Mycalculator app = new Mycalculator();
                }
        );
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba10/Mycalculator.java **********************
package laba10;

import javax.swing.*;

public class Mycalculator extends JFrame {

    public Mycalculator() {

        setTitle("Калькулятор");
        setSize(320, 310);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JTextField a = new JTextField();
        JTextField b = new JTextField();
        JButton slButton = new JButton("+");
        JButton raznButton = new JButton("-");
        JButton prButton = new JButton("*");
        JButton delButton = new JButton("/");
        JLabel result = new JLabel();
        JLabel firstnumber = new JLabel();
        JLabel secondnumber = new JLabel();
        JLabel resulttext = new JLabel();

        firstnumber.setText("Первое");
        secondnumber.setText("Второе");
        resulttext.setText("Р е з у л ь т а т :");
        a.setBounds(20, 40, 80, 30);
        add(a);
        b.setBounds(200, 40, 80, 30);
        add(b);
        result.setBounds(130, 200, 300, 30);
        add(result);
        slButton.setBounds(20, 110, 45, 30);
        add(slButton);
        raznButton.setBounds(92, 110, 45, 30);
        add(raznButton);
        prButton.setBounds(164, 110, 45, 30);
        add(prButton);
        delButton.setBounds(236, 110, 45, 30);
        add(delButton);
        firstnumber.setBounds(38,15,60,15);
        add(firstnumber);
        secondnumber.setBounds(220,15,60,15);
        add(secondnumber);
        resulttext.setBounds(110,170,120,15);
        add(resulttext);

        slButton.addActionListener(action -> {
            try {
                result.setText(String.format("%.2f", Double.parseDouble(a.getText()) + Double.parseDouble(b.getText())));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Некорректный ввод!");
            }
        });

        raznButton.addActionListener(action -> {
            try {
                result.setText(String.format("%.2f", Double.parseDouble(a.getText()) - Double.parseDouble(b.getText())));
            } catch (Exception E) {
                JOptionPane.showMessageDialog(null, "Некорректный ввод!");
            }
        });

        prButton.addActionListener(action -> {
            try {
                result.setText(String.format("%.2f", Double.parseDouble(a.getText()) * Double.parseDouble(b.getText())));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Некорректный ввод!");
            }
        });

        delButton.addActionListener(action -> {
            try {
                if (Double.parseDouble(b.getText())==0)
                    result.setText("Ошибка");
                else
                    result.setText(String.format("%.3f", Double.parseDouble(a.getText()) / Double.parseDouble(b.getText())));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Некорректный ввод!");
            }
        });


    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba11/Main.java **********************
package laba11;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static AtomicInteger totalSum=new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        ArrayList<Thread> threads = new ArrayList<>();

        for(int i=1;i<11;i++){
            work(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Итоговое время: "+ (endTime-startTime));

        startTime=System.currentTimeMillis();

        for (int i = 1; i < 11; i++){
            final int localI = i;
            Thread thread = new Thread(()->work(localI));
            thread.start();
            threads.add(thread);

        }

        for(Thread t: threads){
            t.join();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Итоговое время: " + (endTime - startTime));
        System.out.println("Итоговая сумма: " + totalSum);
    }

    private static void work(int i) {
        long startTime = System.currentTimeMillis();
        long result = doHardWork(i * 300, 10_000_000);
        long endTime = System.currentTimeMillis();
        System.out.println(i + ": " + result + " | " + (endTime-startTime));
    }

    private static long doHardWork(int start, int count) {
        long temp = 0;
        for (int i = 0; i < count; i++) {
            temp+=Math.pow(i,start)/(start*start);
            totalSum.incrementAndGet();
        }
        return temp;
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba12/Enum.java **********************
package laba12;

public enum Enum {

    RED(31),
    GREEN(32),
    YELLOW(33),
    BLUE(34),
    Magenta(35),
    Cyan(36),
    BrightRed(91),
    BrightGreen(92),
    BrightYellow(93),
    BrightBlue(94),
    BrightMagenta(95),
    BrightCyan(96);

    private final int Col_Code;

    Enum(int Col_Code){
        this.Col_Code = Col_Code;
    }

    public int getCol_Code() {
        return Col_Code;
    }
}

```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba12/Main.java **********************
package laba12;

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
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba13/Main.java **********************
package laba13;

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
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba13/MyExc.java **********************
package laba13;

public class MyExc extends RuntimeException{
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba13/People.java **********************
package laba13;

public class People {
    public int height;
    public int age;

    public void comprasionheightage(int height, int age) throws MyExc {
        if (height < 30 || height>210 || age<0 || age>140) {
            throw new MyExc();
        }
        this.height+= height;
        this.age+= age;
    }

    @Override
    public String toString() {
        return "People{" +
                "height=" + height +
                ", age=" + age +
                '}';
    }
}

```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba13/RuntimeExeption.java **********************
package laba13;

public class RuntimeExeption {
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba14/Main.java **********************
package laba14;

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

```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba2/Book.java **********************
package laba2;

public class Book {
    private int year = 2000;
    private String name = "1984";

    public Book(){
    }

    public static void main(String[] args) {
        Book b001 = new Book();
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba2/Main.java **********************
package laba2;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape("red", 10);
        System.out.println(shape);
    }

}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba2/Myach.java **********************
package laba2;

public class Myach {

    private String material;
    private String color;
    private int size;

    public Myach(){
    }

    public static void main(String[] args) {
        Myach ball = new Myach();
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba2/Shape.java **********************
package laba2;

public class Shape {
    private String color;
    private int sideCount;

    public Shape(String color, int sideCount) {
        this.color = color;
        this.sideCount = sideCount;
    }

    public String getColor() {
        return color;
    }

    public int getSideCount() {
        return sideCount;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSideCount(int sideCount) {
        this.sideCount = sideCount;
    }

    public void print() {
        System.out.println(color);
        System.out.println(sideCount);
    }

    @Override
    public String toString() {
        return "Shape{" + "color='" + color + '\'' + ", sideCount=" + sideCount + '}';
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba3/Book.java **********************
package laba3;

public class Book {
    private String name;
    private int year;
    private String writer;
    private int pages;
    private int price;

    public Book(String name, int year,  String writer, int pages, int price){
        this.name = name;
        this.year = year;
        this.writer = writer;
        this.pages = pages;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String author) {
        this.writer = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book" + "name = " + name + "year = " + year + "writer = " + writer + "pages = " + pages + "price = " + price;
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba3/Circle.java **********************
package laba3;

public class Circle {
    private String color;
    private double radius;


    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle:" + "color = " + color + " radius = " + radius;
    }

}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba3/Hand.java **********************
package laba3;

public class Hand {
    public int length;

    public Hand(int length) {
        this.length = length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "length =" + length;
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba3/Head.java **********************
package laba3;

public class Head {
    public double size;

    public Head(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "size = " + size;
    }
}

```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba3/Human.java **********************
package laba3;

public class Human {
    private Head Head;
    private Leg Leg;
    private Hand Hand;

    public Human(int legLength, int handLength, double headsize) {
        this.Head = new Head(headsize);
        this.Leg = new Leg(legLength);
        this.Hand = new Hand(handLength);
    }

    public void setHandLength(int handLength) {
        this.Hand.setLength(handLength);
    }

    public void setLegLength(int legLength) {
        this.Leg.setLength(legLength);
    }

    @Override
    public String toString() {
        return "Human: Head= " + Head + " Leg= " + Leg + " Hand= " + Hand;
    }

    public static void main(String[] args) {
        Human Bob = new Human(76, 48, 22);
        System.out.println(Bob);
        Bob.Head.setSize(28);
        Bob.setHandLength(62);
        Bob.setLegLength(85);
        System.out.println(Bob);
    }

}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba3/Leg.java **********************
package laba3;

public class Leg {
    public int length;

    public Leg(int length) {
        this.length = length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }


    @Override
    public String toString() {
        return "length =" + length;
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba4/Circle.java **********************
package laba4;

public class Circle extends Shape {
    public double radius;

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super (color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: " + "radius = " + radius;
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba4/Rectangle.java **********************
package laba4;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle: " + "width = " + width + " length = " + length;
    }

}

```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba4/Shape.java **********************
package laba4;

public abstract class Shape{
    protected String color = "Белый";
    protected boolean filled = true;

    public Shape(){
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea(){
        return 0;
    }

    public double getPerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape: " + "color= " + color + ", filled= " + filled;
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba4/Square.java **********************
package laba4;

public class Square extends Rectangle{

    public Square(){
    }

    public Square( double side, String color, boolean filled) {
        super(side, side, color, filled);
    }


    @Override
    public void setWidth(double width) {
        this.width = this.length = width;
    }

    @Override
    public void setLength(double length) {
        this.length = this.width = length;
    }

    @Override
    public String toString() {
        return "Square: " + "width = " + width + " length = " + length + " color = " + color + " filled=" + filled;
    }

    public static void main(String[] args) {
        Square s = new Square( 3, "Чёрный", true);

        System.out.println(s);
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba5/Movable.java **********************
package laba5;

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba5/MovableCircle.java **********************
package laba5;

import laba4.*;

public class MovableCircle extends Circle implements Movable{
    private MovablePoint center;

    public MovableCircle(int radius, int x, int y, int Speedx, int Speedy) {
        this.center = new MovablePoint(x, y, Speedx, Speedy);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle: " + " radius = " + radius + " center = " + center;
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba5/MovablePoint.java **********************
package laba5;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int Speedx;
    private int Speedy;

    public MovablePoint(int x, int y, int Speedx, int Speedy) {
        this.x = x;
        this.y = y;
        this.Speedx = Speedx;
        this.Speedy = Speedy;
    }

    @Override
    public void moveUp() {
        this.y += Speedy;
    }

    @Override
    public void moveDown() {
        this.y -= Speedy;
    }

    @Override
    public void moveLeft() {
        this.x -= Speedx;
    }

    @Override
    public void moveRight() {
        this.x += Speedx;
    }

    public void setSpeed(int x, int y){
        this.Speedx = x;
        this.Speedy = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return Speedx;
    }

    public void setxSpeed(int xSpeed) {
        this.Speedx = Speedx;
    }

    public int getySpeed() {
        return Speedy;
    }

    public void setySpeed(int ySpeed) {
        this.Speedy = Speedy;
    }

    @Override
    public String toString() {
        return "MovablePoint:" + "x = " + x + " y = " + y + " Speedx = " + Speedx + " Speedy = " + Speedy;
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba5/MovableRectangle.java **********************
package laba5;

public class MovableRectangle implements Movable{
    public int height;
    public int width;
    public MovablePoint leftUp;
    public MovablePoint downRight;

    public MovableRectangle(int x, int y, int Speedx, int Speedy, int x1, int y1, int Speedx1, int Speedy1){
        this.leftUp = new MovablePoint(x, y, Speedx, Speedy);
        this.downRight = new MovablePoint(x1, y1, Speedx1, Speedy1);
        this.height = getHeight();
        this.width = getWidth();
    }

    public void setSpeed(int x, int y){
        leftUp.setSpeed(x, y);
        downRight.setSpeed(x, y);
    }

    @Override
    public void moveUp() {
        leftUp.moveUp();
        downRight.moveUp();
    }

    @Override
    public void moveDown() {
        leftUp.moveDown();
        downRight.moveDown();
    }

    @Override
    public void moveLeft() {
        leftUp.moveLeft();
        downRight.moveLeft();
    }

    @Override
    public void moveRight() {
        leftUp.moveRight();
        downRight.moveRight();
    }

    public int getHeight() {
        return Math.abs(leftUp.getY() - downRight.getY());
    }

    public int getWidth() {
        return Math.abs(downRight.getX() - leftUp.getX());
    }

    public void setHeight(int height) {
        leftUp.setY(leftUp.getY() + height - this.height);
        this.height = height;
    }

    public void setWidth(int width) {
        downRight.setX(downRight.getX() + width - this.width);
        this.width = width;
    }

    @Override
    public String toString() {
        return "MovableRectangle: " + "height = " + height + " width = " + width + " leftUp = " + leftUp + " downRight = " + downRight;
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba5/TestCircle.java **********************
package laba5;

public class TestCircle {
    public static void main(String[] args) {

        MovableRectangle rectangle = new MovableRectangle(0,3,1,1,5,0,1,1);

        System.out.println(rectangle);

        rectangle.setHeight(10);

        rectangle.setWidth(5);

        System.out.println(rectangle);

        rectangle.moveDown();

        System.out.println(rectangle);
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba6/Main.java **********************
package laba6;

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
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba7/Company.java **********************
package laba7;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Company {

    private List<Employee> list = new ArrayList<>();

    public Company(){

    }

    public List<Employee> getList() {
        return list;
    }

    public void hire(Employee employee){
        list.add(employee);
    }

    public void hireAll(List<Employee> employees){
        list.addAll(employees);
    }

    public void fire(Employee employee){
        list.remove(employee);
    }

    public long getIncome(){
        long dohod = 0;
        for (Employee employee : list) {
            if (employee.position.getJobTitle().equals("Менеджер")) {
                dohod += employee.pribl;
            }
        }
        return dohod;
    }


    public List<Employee> getTopSalaryStaff(int count) {

        List<Employee> nList = new ArrayList<>(list);
        nList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getZp() - o1.getZp();
            }
        });
        return nList.subList(0, count);
    }


    public List<Employee> getLowestSalaryStaff(int count) {
        List<Employee> nList = new ArrayList<>(list);
        nList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getZp() - o2.getZp();
            }
        });
        return nList.subList(0, count);
    }

}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba7/Employee.java **********************
package laba7;

public class Employee {
    protected String surname;
    protected String name;
    protected EmployeePosition position;
    protected int zp; //зарплата фиксированнная
    public double pribl; //прибыль для компании с одного менеджера
    protected double dohod; //общий доход компании

    public Employee(String surname, String name, int zp, EmployeePosition position) {
        this.surname = surname;
        this.name = name;
        this.zp = zp;
        this.position = position;
        this.pribl = (Math.random()*35_000+115_000);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }

    public void setZp(int zp) {
        this.zp = zp;
    }

    public int getZp() {
        return zp;
    }

    @Override
    public String toString() {
        return "Фамилия = " + surname + ", имя  = " + name + ", зарплата = " + position.calcSalary(zp, dohod) + ", должность = " + position.getJobTitle();
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba7/EmployeePosition.java **********************
package laba7;

public interface EmployeePosition {
    public String getJobTitle();
    double calcSalary(double baseSalary, double pribl);
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba7/Main.java **********************
package laba7;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        EmployeePosition ТопМенеджер = new TopManager(company);
        EmployeePosition Оператор = new Operator(company);
        EmployeePosition Менеджер = new Manager(company);

        ArrayList<Employee> List = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            List.add(new Employee("Иванов ", "Оператор " + (i + 1) +"-ый", 15_000+i*110, Оператор));
        }

        for (int i = 0; i < 80; i++) {
            List.add(new Employee("Пупкин ", "Менеджер " + (i + 1) +"-ый", 50_000+i*220, Менеджер));
        }

        for (int i = 0; i < 10; i++) {
            List.add(new Employee("Распутин ", "ТопМенеджер " + (i + 1) + "-ый", 80_000+i*330, ТопМенеджер));
        }

        company.hireAll(List);
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.println("10 самых высокооплачиваемых сотрудников:");
        List<Employee> list = new ArrayList<>(company.getTopSalaryStaff(10)) ;
        for (int i = 0; i<list.size();i++)
            System.out.println(i+1+": " + list.get(i));
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.println("30 самых низких зарплат:");
        list = company.getLowestSalaryStaff(30);
        for (int i = 0; i<list.size();i++)
            System.out.println(i+1+": " + list.get(i));

        Random r = new Random();
        int sizeafter=company.getList().size()/2;
        for (int i = 0; i < sizeafter; i++) {
            int index;
            if (sizeafter != 1)
                index = r.nextInt(sizeafter - 1);
            else
                index = 0;
            company.fire(company.getList().get(index));
        }

        System.out.println("После увольнения 50% штата");
        System.out.println("10 самых высокооплачиваемых сотрудников:");
        list = new ArrayList<>(company.getTopSalaryStaff(11)) ;
        for (int i = 0; i<list.size();i++)
            System.out.println(i+1+": " + list.get(i));
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.println("30 самых низких зарплат:");
        list = company.getLowestSalaryStaff(30);
        for (int i = 0; i<list.size();i++)
            System.out.println(i+1+": " + list.get(i));
    }
}

```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba7/Manager.java **********************
package laba7;

public class Manager implements EmployeePosition {
    private Company company;

    public Manager(Company company){
        this.company = company;
    }

    @Override
    public String getJobTitle() {
        return "Менеджер";
    }

    @Override
    public double calcSalary(double baseSalary, double pribl) {
        return (pribl*0.05+baseSalary);
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba7/Operator.java **********************
package laba7;

public class Operator implements EmployeePosition {
    private Company company;

    public Operator(Company company) {
        this.company = company;
    }
    @Override
    public String getJobTitle() {
        return "Оператор";
    }

    @Override
    public double calcSalary(double baseSalary, double pribl) {
        return baseSalary;
    }
}

```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba7/TopManager.java **********************
package laba7;

public class TopManager implements EmployeePosition {
    private Company company;

    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public String getJobTitle() {
        return "ТопМенеджер";
    }

    @Override
    public double calcSalary(double baseSalary, double pribl) {
        if(company.getIncome() <= 10_000_000)
            return baseSalary;
        else
            return baseSalary*2.5;
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba9/Company.java **********************
package laba9;

import java.util.ArrayList;

public class Company {

    private ArrayList<Employee> list;

    public Company() {
        list = new ArrayList<>();
    }

    public ArrayList<Employee> getList() {
        return list;
    }

    public void hire(Employee employee){
        list.add(employee);
    }

    public void hireAll(ArrayList<Employee> employees){
        list.addAll(employees);
    }

    public void fire(Employee employee){
        list.remove(employee);
    }

    public void Handle_Employs(EmployeeSelector selector,HandleEmp handler) {
        int counter = 0;
        for (Employee employee: list){
            if(selector.simple(employee)){
                handler.HandleEmployees(employee,counter);
                counter++;
            }
        }
        System.out.println("Количество:" +counter);
    }

    @Override
    public String toString() {
        return "Company{" +
                "list=" + list +
                '}';
    }
}

```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba9/Employee.java **********************
package laba9;

import java.time.LocalDate;
import java.util.*;

public class Employee {
    protected String surname;
    protected String name;
    protected LocalDate date;
    protected String address;
    protected String number;
    protected int income;
    int randyear= (int)(Math.random()*30+1970);
    int randmonth= (int)(Math.random()*10+1);
    int randday= (int)(Math.random()*27+1);

    public Employee(String surname, String name, String address, String number, int income) {
        this.surname = surname;
        this.name = name;
        this.date = LocalDate.of(randyear, randmonth,randday);
        this.address = address;
        this.number = number;
        this.income = income;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", income=" + income + '}';
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba9/EmployeeSelector.java **********************
package laba9;

public interface EmployeeSelector {
    boolean simple (Employee employee);
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba9/HandleEmp.java **********************
package laba9;

public interface HandleEmp {
    void HandleEmployees(Employee employee,int count);
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba9/Main.java **********************
package laba9;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();

        Employee employee1 = new Employee("Иванов", "Илья","Rostov", "89205476878", 60_000);
        Employee employee2 = new Employee("Петров", "Матвей","Moscow", "89995476872", 120_000);
        Employee employee3 = new Employee("Сидоров", "Владимир","Moscow", "89816471786", 115_000);
        Employee employee4 = new Employee("Митин", "Владимир","Moscow", "89565475311", 120_000);
        Employee employee5 = new Employee("Фёдоров", "Владимир","Novosibirsk", "89505466311", 180_000);
        Employee employee6 = new Employee("Беглов", "Степан","Novosibirsk", "89605466311", 380_000);

        company.hire(employee1);//наняли 4 сотудников в компанию
        company.hire(employee2);
        company.hire(employee3);
        company.hire(employee4);
        company.hire(employee5);
        company.hire(employee6);
        company.fire(employee4); //уволили одного сотрудника
        System.out.println(company.toString());//выведем список наших сотрудников

        System.out.println();
        System.out.println("Сотрудники из Новосибирска:");
        String city = "Novosibirsk"; //выедем всех сотрудников из Новосибирска
        company.Handle_Employs(new EmployeeSelector() {
                                   @Override
                                   public boolean simple(Employee employee) {
                                       return employee.getAddress() == city;
                                   }

                               },
                new HandleEmp() {
                    @Override
                    public void HandleEmployees(Employee employee, int counter) {
                        System.out.println(employee);
                    }
                }
        );

        System.out.println();
        System.out.println("Сотрудники с зп от 70к до 230к (Moscow):");
        company.Handle_Employs(new Selector(70_000,230_000),
                ((employee, count) -> System.out.println(employee))); //выедем всех сотрудников с зп от 70_000 до 230_000 из Москвы

    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/laba9/Selector.java **********************
package laba9;

public class Selector implements EmployeeSelector {
    private  int income1;
    private  int income2;

    public Selector(int income1, int income2) {
        this.income1 = income1;
        this.income2 = income2;
    }


    @Override
    public boolean simple(Employee employee) {
        return employee.getIncome()>income1&&employee.getIncome()<income2&&employee.getAddress()=="Moscow";
    }
}
```
******************* C:\Users\alexe\IdeaProjects\untitled7/src/Main.java **********************
import java.io.*;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
        Path filePath = Paths.get("").toAbsolutePath();
        try {
            printwriter = new PrintWriter("Myworks.md");
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
        reader(filePath.toString());
        printwriter.close();
    }

    static PrintWriter printwriter;
    static void reader(String path) {
        File file = new File(path);

        if(file.isDirectory()){
            String[] con = file.list();
            for (String s:con) {
                reader(path + "/" +s);
            }
        }
        if(file.isFile() ) {
            if (file.getName().endsWith(".java"))
            {
                try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                    printwriter.write("******************* " + path + " **********************"+"\n");
                    String line = reader.readLine();
                    while (line != null) {
                        printwriter.write(line + "\n");
                        line = reader.readLine();
                    }
                    printwriter.write("```\n");


                }
                catch (FileNotFoundException exception)
                {
                    exception.printStackTrace();
                }
                catch (IOException exception)
                {
                    exception.printStackTrace();
                }

            }
        }
    }




}
```
