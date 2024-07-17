public class Student {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name; // "this" is used to differentiate the "name" attribute and the "name" that I am receiving in the parameter
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age>0 && age<130){
            this.age = age;
            System.out.println("Registered age");
        } else {
            System.out.println("Error! Invalid age");
        }

    }
}
