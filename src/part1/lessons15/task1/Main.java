package part1.lessons15.task1;

import java.awt.*;
import java.lang.*;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<PersonSuperComparator.person> person = new ArrayList<>();
        PersonSuperComparator.person one = new PersonSuperComparator.person("Ivan", 20);
        PersonSuperComparator.person two = new PersonSuperComparator.person("Petr", 25);
        PersonSuperComparator.person three = new PersonSuperComparator.person("Elena", 19);
        PersonSuperComparator.person four = new PersonSuperComparator.person("Ivan", 21);
        PersonSuperComparator.person five = new PersonSuperComparator.person("Olga", 19);
        PersonSuperComparator.person six = new PersonSuperComparator.person("Ivan", 40);
        PersonSuperComparator.person seven = new PersonSuperComparator.person("Ivan", 40);

        person.add(one);
        person.add(two);
        person.add(three);
        person.add(four);
        person.add(five);
        person.add(six);
        person.add(seven);


        for (PersonSuperComparator.person p : person)
            System.out.println(p);


    }
}

class PersonSuperComparator {
    public static void Comparator() {

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
            return name.compareTo(p.getName());

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