package ch05._7_문자열의_길이;

import java.util.Scanner;

public class LengthExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String SocialNum = scanner.nextLine(); //SocialNum에 입력받은 값을 대입한다.

        int length = SocialNum.length();       //length메소드를 이용하여 SocialNum변수의 문자열 길이를 length라는 변수에 저장한다.

        if(length == 13){                      //자릿수가 맞다면 맞다는 메시지를 출력하고 아니면 틀렸다는 메세지를 출력한다.
            System.out.println("주민등록번호의 자릿수를 올바르게 입력하였습니다.");
        }

        else
            System.out.println("주민등록번호의 자릿수를 틀리게 입력하셨습니다.");



    }
}
