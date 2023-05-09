package ch06._16_final_필드와_상수;

public class KoreanExample {
    public static void main(String[] args){
        Korean k1 = new Korean("000101-111111", "홍길동"); //Korean이라는 클래스를 참조하는 k1 객체 생성

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        //final 필드는 값을 변경할 수 없으므로 k1.nation = "USA", k1.ssn = "010101-222222"와 같은 문장은 불가능하다.
        //단 여기서 name은 final 처리를 해주지 않았으므로 변경 가능하다.
    }
}
