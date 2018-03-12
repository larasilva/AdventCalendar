import java.io.*;
import java.net.URL;


public class Advent {


    public static void main(String[] args) throws Exception {

        final String INPUT = "D://Downloads/input.txt";
        final Character UP = new Character('(');
        final Character DOWN = new Character(')');
        BufferedReader br = new BufferedReader(new FileReader(INPUT));
        int floor = 0;
        String line = null;
        while ((line = br.readLine())!=null){
            for (int i=0; i<line.length(); i++){
                Character c = line.charAt(i);
                if (c.equals(UP)) floor++;
                if (c.equals(DOWN)) floor--;
            }
        }
        
        System.out.println("resultado: " + floor);
    }
    
}