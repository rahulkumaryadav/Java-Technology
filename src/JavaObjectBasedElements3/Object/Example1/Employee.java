package JavaObjectBasedElements3.Object.Example1;

public class Employee {
    private String name;

    public Employee(){
        System.out.println("Constructor is called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
