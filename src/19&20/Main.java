import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Mychat new_chat = new Mychat();

        Thread thread = new Thread(()->new_chat.Client());
        thread.start();

        thread = new Thread(()-> {
            try {
                new_chat.Server();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread.start();
    }


}
