package study.ch14;

import java.util.Objects;

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class HashCode {
    public static void main(String[] args) {
        Dog dog = new Dog("콩이", 10);
        Dog dog2 = new Dog("콩이", 10);
        System.out.println(dog.hashCode()); //가상의 메모리 JVM
        System.out.println(dog2.hashCode());
        Dog[] dogs = {
                new Dog("콩이이", 11),
                new Dog("콩삼", 12),
                new Dog("콩이", 10),
                new Dog("콩이", 11),
        };
        int hashCode = Objects.hash("콩이", 11);
        Dog foundDog = null;
        for (Dog d : dogs) {
            if (d.hashCode() == hashCode) {
                foundDog = d;
                System.out.println(d);
                break;
            }
        }
    }
}