package com.letscode.santander.coders.poo2.material.aluno.generics;

public class MetodoGenerics {
    public static void main(String[] args) {
        Person victor = new Person("Victor", 3000);
        Person alfredo = new Person("Alfredo", 4000);
        Person karen = new Person("Karen", 5000);
        Person joao = new Person("Joao", 10000);
        Person tuca = new Person("Tuca", 50000);

        Person[] people = {victor, karen, joao, tuca};

        int result = countGreaterThan(people, victor);

        System.out.println(result);
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] anArr, T e) {
        int count = 0;
        for (T an : anArr) {
            if (an.compareTo(e) > 0) {
                count++;
            }
        }
        return count;
    }
}

class Person implements Comparable<Person> {
    private final String name;
    private final Integer salary;

    public Person(String name, int salary) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(salary, o.salary);
    }
}