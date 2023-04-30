package ch05.원하는_문자열_찾기;

import java.util.Scanner;

public class IndexOfSample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String subject = scanner.nextLine();

        int location = subject.indexOf("프로그래밍"); //프로그래밍이라는 문자열이 가지는 가장 앞의 인덱스를 location에 저장한다.
        System.out.println(location);               //예를 들어 "자바 프로그래밍"이라면 location은 3이 될 것이다.
        String substring = subject.substring(location); //그리고 프로그래밍이라는 문자열이 시작하는 인덱스에서 끝까지 문자열을 잘라내어 저장한다.
        System.out.println(substring);              //"프로그래밍"이라는 문자열이 출력될 것이다.

        location = subject.indexOf("자바"); //자바라는 문자열의 위치를 저장한다.

        if(location != -1) //이 때 문자열에서 자바라는 과목명이 없다면 indexOf 메소드는 -1을 반환하는데 이를 이용하여
                           //자바라는 문자열이 과목명에 포함되어있는지를 체크한다. (indexOf가 -1이 아님 = 자바라는 문자열이 존재함)
            System.out.println("자바라는 과목명이 포함되어있습니다.");

        else
            System.out.println("자바와 관련이 없는 과목명입니다");

    }
}
