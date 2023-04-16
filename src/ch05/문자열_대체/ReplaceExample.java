package ch05.문자열_대체;

public class ReplaceExample {
    public static void main(String[] args){
        String origin = "자바 문자열은 바꿀 수 없습니다. 자바의 문자열은 String이라고 합니다."; //바꾸려고 하는 원래 문자열
        String replace = origin.replace("자바", "java"); //replace 메소드는 원래 문자열에서 자바라는 단어를 java로 변경한다.
                                                                         //이 때 replace는 origin에서 단어를 바꾼 전체 문자열을 저장한다.

        System.out.println(origin);  //원래 문자열
        System.out.println(replace); //원래 문자열에서 replace로 자바를 java로 바꾼 전체 문자열을 출력한다.
    }
}
