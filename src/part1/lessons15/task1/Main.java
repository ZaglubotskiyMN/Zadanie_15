package part1.lessons15.task1;

import java.awt.*;
import java.lang.*;
import java.util.*;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<person> Listperson = new ArrayList<person>();
        person one = new person("Ivan", 20);
        person two = new person("Petr", 25);
        person three = new person("Elena", 19);
        person four = new person("Ivan", 21);
        person five = new person("Olga", 19);
        person six = new person("Ivan", 40);
        person seven = new person("Alex", 33);


        Listperson.add(one);
        Listperson.add(two);
        Listperson.add(three);
        Listperson.add(four);
        Listperson.add(five);
        Listperson.add(six);
        Listperson.add(seven);



        System.out.println("Без сортировки");
        for (person p : Listperson)
            System.out.println(p);
        System.out.println("----------------");
        System.out.println("Сортировка по имени");
        Collections.sort(Listperson, new SortedByName());
        for (person p : Listperson)
            System.out.println(p.toString());
        System.out.println("----------------");
        System.out.println("Сортировка по возрасту");
        Collections.sort(Listperson, new SortedByAge());
        for (person p : Listperson)
            System.out.println(p.toString());


    }

    public static class person {
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


        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }


    }

    static class SortedByName implements Comparator<person> {
        @Override
        public int compare(person p1, person p2) {
            String str1 = p1.getName();
            String str2 = p2.getName();
            return str1.compareTo(str2);
        }
    }

    static class SortedByAge implements Comparator<person> {
        @Override
        public int compare(person p1, person p2) {
            int age1 = p1.getAge();
            int age2 = p2.getAge();
            if (age1 > age2) {
                return 1;
            } else if (age1 < age2) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
