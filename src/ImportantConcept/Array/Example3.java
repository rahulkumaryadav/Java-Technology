package ImportantConcept.Array;

import java.util.Scanner;

public class Example3 {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int[] uerInput= takeInputFromUser(5);
        for (int i=0;i<uerInput.length;i++){
            System.out.println("values"+uerInput[i]);
        }
        System.out.println("the average is :"+getAverage(uerInput));
    }
    public static int[] takeInputFromUser(int number){
        System.out.println("enter "+number+" integer values");
        int[] value=new int[number];
        for(int i=0;i<number;i++){
            value[i]=scanner.nextInt();
        }
        return value;

    }
    public static double getAverage(int[] array){
        int sum=0;
        for(int i=0; i<array.length;i++){
            sum +=array[i];
        }
        return (double) sum/(double) array.length;
    }
}
