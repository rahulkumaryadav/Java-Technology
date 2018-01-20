package ImportantConcept.TypesOfVariablesInJava.Example1;

public class LocalVariables {
    void m1(){
        int i=15;
        System.out.println(i);
    }

    public static void main(String[] args) {
        LocalVariables variables=new LocalVariables();
        variables.m1();
    }

}
