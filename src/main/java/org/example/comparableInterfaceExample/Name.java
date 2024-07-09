package org.example.comparableInterfaceExample;

import java.util.LinkedList;
import java.util.List;

public class Name implements Comparable<Name>{
    private String name;
    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    @Override
    public int compareTo(Name obj) {
        if(name.length()== obj.name.length()){
            return 0;
        }else if(name.length()>obj.name.length()){
            return 1;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        List names = new LinkedList<>();
        names.add(new Name("harsha"));
        names.add(new Name("ziya"));
        names.add(new Name("venkat"));
        names.add(new Name("ganesh"));
        names.add(new Name("chinni"));
        names.add(new Name("harish"));

//        names.sort(null);
//        System.out.println(names);
       // names.get(0).compareTo("abc");
        System.out.println(names);
    }


}