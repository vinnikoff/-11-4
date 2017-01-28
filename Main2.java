
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by VINNI on 27.01.17.
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        String word = "do";

        System.out.println(checkWord(word));}

    private static int checkWord(String word) throws IOException{
        String s;
        int vol_word = 0;
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader("test2.txt"));
        try  {

            while ((s = br.readLine()) != null) {
                sb.append(s+"\n");
            }

            String new_str=sb.toString();
            vol_word=(new_str + "\0").split(word).length - 1;
        }
        catch (IOException e) {
            System.out.println("read failed");
        }
        finally {
            try {
                if (br != null)
                    br.close();

            } catch (IOException e) {
                System.out.println("can't close reade");
            }
        }

            return vol_word;
    }

}