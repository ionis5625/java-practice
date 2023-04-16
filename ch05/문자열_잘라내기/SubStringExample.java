package ch05.문자열_잘라내기;

import java.util.Scanner;

public class SubStringExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String SocialNum = scanner.nextLine();

        String frontNumber = SocialNum.substring(0, 6); //substring(시작할 인덱스, 입력한 숫자 앞까지 잘라낼 인덱스(0~5번까지 저장됨))
        String backNumber = SocialNum.substring(6); //원하는 인덱스에서 시작하여 문자열의 끝까지 잘라냄

        System.out.println(SocialNum); //substring으로 배열을 잘라내더라도 원 배열은 그대로 유지된다.(원하는 부분만 복사하는 개념)
        System.out.println(frontNumber);
        System.out.println(backNumber);
    }
}
