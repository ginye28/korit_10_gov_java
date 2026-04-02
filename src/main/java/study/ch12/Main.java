package study.ch12;

class AA {

}
class BB extends AA {

}
class CC extends AA {

}
class MM {
    public static void main(String[] args) {
//        AA a = new AA();     //추상 클래스라서 생성 불가능
        BB b = new BB();
        AA b2 = new BB();
        AA c = new AA(); {
            
        };
        AA cc = new CC();
        AA ccc = new BB(); {

        }
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Cat cat = new Cat();

        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Animal() {  //override로 부모를 재정의함.
            @Override
            public void eat() {

            }
        };   //애니멀의 끝이라서 세미콜론이 붙음
    }
}
