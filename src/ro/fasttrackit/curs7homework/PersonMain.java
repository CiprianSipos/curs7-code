package ro.fasttrackit.curs7homework;

public class PersonMain {
    public static void main(String[] args){

        Person person1 = new Person();
        person1.setAge(2);
        System.out.println(person1.getAge());
        person1.name="Ion";
        System.out.println(person1.name);

        person1.setName("Adrian");
        System.out.println(person1.getName());

        person1.setMarried(true);
        System.out.println(person1.isMarried());



        Person person2 =new Person();
        person2.setAge(19);
        System.out.println(person2.getAge());

        person2.setName("Cipri");
        System.out.println(person2.getName());
        person2.setMarried(true);
        System.out.println(person2.isMarried());

        System.out.println("______________");

        Person person3 = new Person();
        person3.setAge(25);
        System.out.println(person3.getAge());
        person3.setName("Alina");
        System.out.println(person3.getName());
        person3.setMarried(false);
        System.out.println(person3.isMarried());


    }
}
