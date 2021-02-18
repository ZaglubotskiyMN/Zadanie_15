package part1.lessons15.task1;

import java.awt.*;
import java.lang.*;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args)  {
        List<person> person = new ArrayList<>();
        person one = new person("Ivan", 20);
        person two = new person("Petr", 25);
        person three = new person("Elena", 19);
        person four = new person("Ivan", 21);
        person five = new person("Olga", 19);
        person six = new person("Ivan", 40);
        person seven = new person("Ivan", 40);

        person.add(one);
        person.add(two);
        person.add(three);
        person.add(four);
        person.add(five);
        person.add(six);
        person.add(seven);

        Collections.sort(person);
        for (person p : person)
            System.out.println(p);



    }

    public static class person implements Comparable<person> {
        private String name;
        private int age;
        String temp = "name=%s,age=%d";

        person(String name, int age) {
            this.setName(name);
            this.setAge(age);
        }

        @Override
        public String toString() {
            return String.format(temp, name, age);
        }

        public String getName() {
            return name;
        }
        @Override
        public int compareTo(person p) {
           // return getName().compareTo(p.getName());
            if (getName()==p.getName())
           return 1;
           else return -1;


        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }





       /* @Override
        public int compareTo(Object obj) {

            person good = (person)obj;

            int res=name.compareTo(good.name);
            if(res!=0)
                return res;

            res = age-good.age;
            if(res!=0)
                return res;
            return 0;
        }*/



}

}