package ch06._5_필드_초기화;

public class Korean {
    String nation = "대한민국";
    String name;
    String ssn;

    public Korean(String name, String ssn){
        this.name = name; //변수의 이름이 다르면 구별하기 힘드므로 필드와 같은 이름을 쓰되 this를 붙여 현재 객체에서 생성된 데이터라는걸 의미한다.
        this.ssn = ssn;
    }
}

/*
한국인은 모두 대한민국이라는 국적을 가지고 있으므로 클래스를 생성할 때 국적은 대한민국으로 초기화해주는 것이 편할 것이다.
그리고 따로 생성자를 만들어서 이름과 주민번호를 받아준 뒤 그 값을 클래스의 이름과 주민번호 필드로 넘겨준다.
*/