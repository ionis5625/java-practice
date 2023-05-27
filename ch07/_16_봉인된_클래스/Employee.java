package ch07._16_봉인된_클래스;

public final class Employee extends Person{ //Person으로부터 상속받고 final 선언을 했으므로 이 클래스는 더 이상 상속이 불가능해진다.
    public void work(){
        System.out.println("제품을 생산합니다.");
    }
}
