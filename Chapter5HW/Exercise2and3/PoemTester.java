package Chapter5HW.Exercise2and3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**Class: Intermediate Programming
 * @author Daniel Santoyo
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: 4/15, 2024
 * PoemTester.java - reads Poem objects and creates a new file to display their information
 */
public class PoemTester {
    public static void main(String[] args){
        Poem p1 = new Poem();
        p1.setName("Flowers");
        p1. setPoet("Ashley");

        Poem p2 = new Poem();
        p2.setName("Waves");
        p2. setPoet("Jacob");

        Poem p3 = new Poem();
        p3.setName("Trees");
        p3. setPoet("Alex");

        String[] lines = {p1.getName(), p1.getPoet(), p2.getName(), p2.getPoet(), p3.getName(), p3.getPoet()};
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("poems.txt"))){
            for(String line: lines){
                bw.write(line);
                bw.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
