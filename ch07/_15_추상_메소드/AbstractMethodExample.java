package ch07._15_추상_메소드;

public class AbstractMethodExample {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();

        dog.sound();
        cat.sound();


        //각각 cat과 dog라는 객체를 만들고 추상 메소드를 호출한다.

        animalSound(new Dog());
        animalSound(new Cat());
    }

    //매개변수의 다형성을 알아보기 위해 Dog와 Cat 클래스를 참조하는 animalSound라는 메소드를 만들어본다.
    public static void animalSound(Animal animal){ //매개변수로 Animal 클래스를 참조하는데 타입 변환으로 인해 cat, dog를 넣어도 동작한다.
        animal.sound(); //재정의된 메소드를 호출한다.
    }
}
