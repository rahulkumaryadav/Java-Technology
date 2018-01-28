package ImportantConcept.Array;

/*
@Author Rahul Yadav
Basic example of the array
 */

public class Example1 {
    public static void main(String[] args) {
        //example 1
       int[] intArray;
       intArray=new int[20];
       intArray[0]=50;
        System.out.println(intArray[0]);

        //example 2
        int[] intArray1={0,1,2,3,4,5,6,7,8,9};
        System.out.println(intArray1[0]);

        //example 3
        int[] intArray2=new int[10];
        for(int i=0 ;i<10;i++){
            intArray2[i]=i*10;
            System.out.println("at the index -->"+i+" having value : "+intArray2[i]);
        }
        //example 4
        int[] intArray3=new int[10];
        for(int i=0;i<intArray3.length;i++){
            intArray3[i]=i*20;
            System.out.println("at the index -->"+i+"value is :"+intArray3[i]);
        }




    }
}
