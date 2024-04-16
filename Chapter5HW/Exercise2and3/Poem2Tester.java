package Chapter5HW.Exercise2and3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**Class: Intermediate Programming
 * @author Daniel Santoyo
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: 4/15, 2024
 * Poem2Tester.java -  Creates Poem objects out of a text file and displays their information to the console
 */
public class Poem2Tester {
    public static void main(String[] args){
        poemReader("src/Chapter5HW/Exercise2and3/Poem2.txt");
    }

    public static void poemReader(String fileName){
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            ArrayList<String> poem = new ArrayList<String>();
            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                poem.add(line);
                line = br.readLine();
            }
            Poem poem1 = new Poem();
            poem1.setName(poem.get(0));
            poem1.setPoet(poem.get(1));

            Poem poem2 = new Poem();
            poem2.setName(poem.get(2));
            poem2.setPoet(poem.get(3));

            Poem poem3 = new Poem();
            poem3.setName(poem.get(4));
            poem3.setPoet(poem.get(5));

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
