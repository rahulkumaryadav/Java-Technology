package ImportantConcept.Array;
/*
@Author Rahul Yadav
 */

public class Example2 {
    /*
    Passing the value of array to the method
     */
    public static void main(String[] args) {
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i * 10;
        }
        printArray(array1);

    }
        public static void printArray(int[] arrayPrint){
            for(int i=0;i<arrayPrint.length;i++){
                System.out.println(arrayPrint[i]);
            }

    }

}
