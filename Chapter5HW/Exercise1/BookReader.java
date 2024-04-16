package Chapter5HW.Exercise1;
import java.io.*;
/**Class: Intermediate Programming
 * @author Daniel Santoyo
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: 4/15, 2024
 * BookReader - read a text file containing 10 numbers and write a new file containing results
 * of a variety of different computations.
 */

public class BookReader {
    public static void main(String[] args ){
        numListWriter(numListReader("src/Chapter5HW/Exercise1/Book1.csv"));
    }

    //numListReader() - reads file parameter
    public static String numListReader (String fileName){
        int sum = 0;
        int lowest = 0;
        int highest = 0;
        int count = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            if((line = br.readLine()) != null){
                String[] numList = line.split(" ");
                for(String number: numList){
                    int num = Integer.parseInt(number.trim());
                    sum += num;
                    count++;
                    if(num < lowest){
                        lowest = num;
                    }
                    if(num > highest){
                        highest = num;
                    }
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        double average = (double) sum / count;
        return "The sum of the numbers is: " + sum +
                "\n The lowest number is: " + lowest +
                "\n The highest number is: " + highest +
                "\n The average of the numbers is: " + average;
    }

    //numListWriter() - prints the returning value of numListReader()
    public static void numListWriter(String data){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("stats.txt"))){
            bw.write(data);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
