package study.ch11;

class Animal {

    private String name;

    //기본 생성자(NoArgumentsConstructor)
    public Animal() {

    }

    //전체 생성자(AllArgumentsConstructor)
    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + "(이)가 밥을 먹는다");
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println("이름: " + name);
    }

}

class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(super.getName() + "(이)가 멍멍한다.");
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("품종: " + breed);
    }

}

class Cat extends Animal {
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public void grooming() {
        System.out.println(super.getName() + "(이)가 그루밍을 한다.");    //super 생략 가능
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void showInfo() {
        super.showInfo();                //override 재정의
        System.out.println("색상: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();          //public Animal로 열어두면 됨.
        Dog dog = new Dog("바둑이", "진돗개");
        Cat cat = new Cat("야옹이", "검은색");

        dog.eat();
        cat.eat();
        dog.bark();
        cat.grooming();
        dog.showInfo();
        cat.showInfo();

        Animal[] animals = new Animal[6];

        animals[0] = new Animal("그냥 동물");
        animals[1] = new Cat("휴", "블랙");
        animals[2] = new Dog("콩이", "말티즈");
        animals[3] = new Dog("두부", "말티즈");
        animals[4] = new Cat("크롱", "화이트");
        animals[5] = new Animal("그냥 동물");

//        double d = 10;
//        Animal a = new Dog("a", "b");

        for (Animal a : animals) {
            a.showInfo();
            if (a instanceof Dog) {
                ((Dog) a).bark();
            } else if (a instanceof Cat) {
                ((Cat) a).grooming();
            } else  {
                System.out.println("추가 기능 없음");
            }
        }
    }
}
