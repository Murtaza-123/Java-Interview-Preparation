import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int[] myArray = new int[5];
        Main.getInput(myArray);
        System.out.println(myArray);
        
    }
    public static void getInput(int[] array){
        Scanner arr = new Scanner(System.in);
        for(int i = 0;i < array.length;i++){
            System.out.println("Enter the number: ");
            array[i] = arr.nextInt();
        }
    }
}