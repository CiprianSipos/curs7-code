package ro.fasttrackit.curs7homework;

public class Person {
    private int age;
    public boolean married;
    public String name;


    public Person() {
        this.married = false;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if(age<0 || age>120){
            System.out.println("Set another value for age ");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarried(boolean married){
        this.married=married;
    }
    public boolean isMarried() {

        return married;

    }
}
