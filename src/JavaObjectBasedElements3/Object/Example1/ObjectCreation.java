package JavaObjectBasedElements3.Object.Example1;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreation {
    public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        // By using new keyword
        Employee emp1=new Employee();//constructor  will be called when object is created.
        emp1.setName("rahul");


        // By using Class class's newInstance() method
        Employee emp2 = Employee.class.newInstance();//constructor  will be called when object is created.
        //or
        //Employee emp2 = (Employee) Class.forName("org.programming.mitra.exercises.Employee").newInstance();
        emp2.setName("pintu");

        // By using Constructor class's newInstance() method
        Constructor<Employee> constructor=Employee.class.getConstructor();
        Employee emp3=constructor.newInstance();
        emp3.setName("rohit");

        // By using clone() method
       // Employee emp4= (Employee) emp3.clone(); //not working
        //emp4.setName("bhavik");

        // By using Deserialization
        // Serialization
        //ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
        //out.writeObject(emp4);
       // out.close();
        //Deserialization
       // ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
       // Employee emp5 = (Employee) in.readObject();
        //in.close();
        //emp5.setName("Akash");
        //System.out.println(emp5 + ", hashcode : " + emp5.hashCode());




    }
}
