package org.example.treemap;

public class HashcodeExamples {
    public static void main(String[] args) {
        String x1 = "harsha";
        x1 += "erukala";
        String x2 = "harshaerukala";
//        System.out.println(x1.hashCode());
//        System.out.println(x2.hashCode());
//        System.out.println(x2 == x2);

        Code code1 = new Code("01","01");
        Code code2 = new Code("01","01");
        System.out.println(code1.equals(code2));
        System.out.println(code1.hashCode());
        System.out.println(code2.hashCode());



    }


}
