import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Mychat {

    public void Client () {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите пожалуйста ваше имя : ");
        String name=in.nextLine();
        String message;
        while (true) {
            message = in.nextLine();
            try {
                this.sendMessage(name+" "+ message, "200.200.200.200", 13200);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




    public void sendMessage(String message, String address, int port) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] data = message.getBytes();
        DatagramPacket packet = new DatagramPacket(
                data, 0, data.length, InetAddress.getByName(address), port);
        socket.send(packet);

    }




    public void Server() throws IOException {
        DatagramSocket socket = new DatagramSocket(13200);
        byte[] buffer = new byte[2048];
        FileWriter writer = new FileWriter("talk.txt",true);
        try {
            writer.write( "Диалог 13200\n" );
        } catch (IOException e) {
            System.out.println("Возникли проблемы с записью в файл");
        } finally {
            writer.close();
        }
        DatagramPacket packet = new DatagramPacket(
                buffer, 0,
                buffer.length);
        while (true) {
            socket.receive(packet);
            String date = new SimpleDateFormat("день/месяц/год час:минута:секунда").format(new Date());
            String message = new String(buffer, 0, packet.getLength());
            System.out.println(date + " " + message);
            writer = new FileWriter("talk.txt",true);
            try {
                writer.write(date + " " + message + "\n");
            } catch (IOException e) {
                System.out.println("Возникли проблемы с записью в файл");
            } finally {
                writer.close();
            }
        }
    }
}
