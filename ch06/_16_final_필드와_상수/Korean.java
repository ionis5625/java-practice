package ch06._16_final_필드와_상수;

public class Korean {
    final String nation = "대한민국"; //final 필드는 초기값이 저장되면 프로그램 실행 도중에 수정할 수 없게 된다.
    final String ssn;

    String name;

    public Korean(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    } //ssn과 name을 받는 생성자를 생성한다.
}
