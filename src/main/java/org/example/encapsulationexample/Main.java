package org.example.encapsulationexample;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("harsha",23,"female");
        //we can mark private or protected varibales based on scenarios
        //person.age = -5;

        //if i want to set name use setter
        person.setName("chitti");

        //restrict age
        person.setAge(200);
        System.out.println(person);



    }

}
