package javaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Person> list = new Person().historicalPerson();

        list.stream().forEach(person -> System.out.println(person.toString()));

        System.out.println("***** apenas fem *****");

        list.stream()
                .filter(person -> person.getGender().equals("Feminino"))
                .forEach(p -> System.out.println(p.getName()));

    }


    public List<String> filterFemGender() {
        List<Person> list = new Person().historicalPerson();

        List<String> femNames = list.stream()
                .filter(person -> "Feminino".equals(person.getGender()))
                .map(Person::getName)
                .collect(Collectors.toList());

        return femNames;
    }
}
