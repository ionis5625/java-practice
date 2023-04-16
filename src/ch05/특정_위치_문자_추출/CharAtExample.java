package ch05.특정_위치_문자_추출;

import java.util.Scanner;

public class CharAtExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Scanner 사용을 위해 새로운 Scanner 변수 선언

        String SocialNum = scanner.nextLine(); //입력한 주민번호를 SocialNum에 저장한다.

        char sex = SocialNum.charAt(6); //주민번호 7번째 자리를 따로 sex 변수에 저장한다.
        switch (sex){                   //이를 Switch문을 통해 남자와 여자를 판별한다.
            case '1', '3' -> System.out.println("남자입니다.");
            case '2', '4' -> System.out.println("여자입니다.");
        }
    }
}
