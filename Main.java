
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by VINNI on 27.01.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String word = "do";

        System.out.println(checkWord(word));}

    private static int checkWord(String word) {
            String s;
            int vol_word = 0;
            StringBuilder sb = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

                while ((s = br.readLine()) != null) {
                    sb.append(s+"\n");
                }

                String new_str=sb.toString();
                vol_word=(new_str + "\0").split(word).length - 1;
            }

            catch (IOException e) {
                System.out.println("read failed");
            }

        return vol_word;
        }

}