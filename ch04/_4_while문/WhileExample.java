package ch04._4_while문;

import java.util.Scanner; //Scanner를 사용하기 위해 다른 패키지 안의 클래스를 호출

public class WhileExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //입력값을 받기 위한 Scanner 생성

        boolean run = true; //프로그램 작동 조건을 위한 수 선언
        int speed = 0;

        while(run){ //while()이 1이면 계속 작동하고 0이면 정지함
            System.out.println("-------------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 정지");
            System.out.println("-------------------------------");
            System.out.println("선택 : ");

            String strNum = scanner.nextLine(); //strNum 변수에 Enter가 들어가기전까지의 값을 저장함

            if(strNum.equals("1")){
                speed++;
                System.out.println("현재 속도 : " + speed);
            }

            else if (strNum.equals("2")){
                speed--;
                System.out.println("현재 속도 : " + speed);
            }

            else if (strNum.equals("3"))
                run = false; //run 변수의 값이 0이 되어 while문이 종료됨

        }

        System.out.println("시스템이 종료되었습니다.");
    }
}
