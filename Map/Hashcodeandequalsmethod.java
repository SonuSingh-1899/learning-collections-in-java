package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Hashcodeandequalsmethod {

    // when you use object in hashmap 
    public static void main(String[] args) {
        HashMap<person, String > map = new HashMap<>();
        person p1 = new person("sonu", 1);
        person p2 = new person("monu", 2);
        person p3 = new person("sonu", 1);
        map.put(p1, "engeenear");//hashcode --> index
        map.put(p2, "designer");//hashcode --> index
        map.put(p3, "manager");//hashcode --> index
        // System.out.println(map);
        // System.out.println("hashmap size :" + map.size());
        // System.out.println("vaue for p1 :" + map.get(p1));
        // System.out.println("vaue for p3 :" + map.get(p3));
        System.out.println(p1);
        
        
        System.out.println(map);

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("shubham", 90);
        map1.put("neha", 92);
        map1.put("shubham", 99);
        // System.out.println(map1);
    }
}

class person {
    String name;
    int id;
    public person(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;     
           }

           if (obj == null) {
            return false;

           }
           if (getClass() != obj.getClass()) {
            return false;

           }
           person other = (person) obj;
           return id == other.getId() && Objects.equals(name, other.getName());
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public String toString() {
        return "id :" + id + ", name : "+ name;
    }
}