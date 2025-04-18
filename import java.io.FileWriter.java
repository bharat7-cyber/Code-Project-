import java.io.FileWriter;
import java.io.IOException;

public class Feedback {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("feedback.txt");
            fw.write("Feedback: Very good product, delivered on time.");
            fw.close();
            System.out.println("Feedback saved!");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
