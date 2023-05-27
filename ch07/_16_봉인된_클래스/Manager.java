package ch07._16_봉인된_클래스;

public non-sealed class Manager extends Person{ //non-sealed 처리로 인해 Manager 클래스는 상속이 가능해진다.
    public void work(){
        System.out.println("생산 관리를 합니다.");
    }
}
