package org.example.encapsulationexample;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public void setAge(int age) {
        if(age>=0  && age<=150){
            this.age = age;

        }else{
            throw new IllegalArgumentException("age cannot be less then zero");
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
