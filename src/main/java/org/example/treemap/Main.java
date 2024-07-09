package org.example.treemap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

class Code implements Comparable<Code>{

    private String sectionNo;
    private String lectureNo;

    public String getSectionNo() {
        return sectionNo;
    }

    public String getLectureNo() {
        return lectureNo;
    }

    public Code(String sectionNo, String lectureNo) {
        this.sectionNo = sectionNo;
        this.lectureNo = lectureNo;
    }

    @Override
    public String toString() {
        return "Code{" +
                "sectionNo='" + sectionNo + '\'' +
                ", lectureNo='" + lectureNo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Code o) {
        String code1 = sectionNo.concat(lectureNo);
        String code2 = o.getSectionNo().concat(o.getLectureNo());
        return code1.compareTo(code2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Code code = (Code) o;
        return Objects.equals(sectionNo, code.sectionNo) && Objects.equals(lectureNo, code.lectureNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sectionNo, lectureNo);
    }
}

public class Main {
    public static void main(String[] args) {
        //sequence mismatch
        Map<Code, String> map = new HashMap<>();
        map.put(new Code("s11","10"),"harsha");
        map.put(new Code("s11","11"),"pooja");
        map.put(new Code("s11","12"),"sweety");//latest entry
        map.put(new Code("s11","13"),"malli");
        map.put(new Code("s11","14"),"lavnaya");
        map.put(new Code("s11","15"),"keshav");
        map.put(new Code("s11","16"),"chinni");
        System.out.println(map);

//        for(String key : map.keySet()){
//            System.out.println("key: " +key + "Value: "+map.get(key));
//        }

//        for(Map.Entry<String, String> entry: map.entrySet()){
//            System.out.println("key: "+entry.getKey() +"value: "+entry.getValue());
//        }

//        Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();
//        while(entryIterator.hasNext()){
//            Map.Entry<String, String> temp = entryIterator.next();
//            System.out.println("key: "+temp.getKey() +"value: "+temp.getValue());
//        }

    }

}
