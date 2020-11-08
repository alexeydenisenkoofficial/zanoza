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
