package ch07._16_봉인된_클래스;

public class SealedExample {
    public static void main(String[] args){
        Person p = new Person();
        Employee e = new Employee();
        Manager m = new Manager();
        Director d = new Director();

        /*
        Person과 그 클래스로부터 상속받은 클래스들 안에 들어있는 work 메소드를 호출한다.
        여기서 Person과 Employee는 각각 sealed, final로 인해 더 이상 상속이 불가능해지고
        Manager는 non-sealed로 인해 상속이 가능하다.
        Director는 sealed를 안 풀어줬으므로 상속이 불가능하다.
        */

        p.work();
        e.work();
        m.work();
        d.work();
    }
}
