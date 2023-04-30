package ch06._5_필드_초기화;

public class KoreanExample {
    public static void main(String[] args){
        Korean k1 = new Korean("홍길동", "111111-1111111");

        System.out.println("국적 : " + k1.nation);
        System.out.println("이름 : " + k1.name);
        System.out.println("주민번호 : " + k1.ssn);
    }
}
