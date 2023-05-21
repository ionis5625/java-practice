package ch02._10_스캐너_값입력;

import java.util.Scanner; //java.util 내의 Scanner 패키지를 사용한다는 의미

public class scannerExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Scanner형을 가지는 scanner 변수를 선언하고 new를 통해 생성한 객체를 scanner 변수에 대입한다.
        //이로 인해 scanner.nextLine()을 사용하면 Enter가 입력되기 전까지 입력된 문장을 문자열로 읽고 String 자료형 변수에 대입한다.

        System.out.print("Enter the value of x : ");
        String strX = scanner.nextLine(); //Enter가 입력되기 전까지의 모든 입력을 문자열 strX에 저장한다.
        int x = Integer.parseInt(strX); //그렇게 받은 문자열을 int형으로 변환하여 x에 저장한다.

        System.out.print("Enter the value of y : ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y = " + result);
        System.out.println();

        while(true){ //while(0이 아닌 값) 형식으로 무한반복문을 의미한다.
            System.out.print("Enter the string : ");
            String data = scanner.nextLine();
            if(data.equals("q")){ //문자열이 아닌 다른 자료형의 경우 x == 1 식으로 입력해주면 되지만 문자열의 경우 equals(를 사용한다)
                break;            //따라서 data에 입력된 문자열이 q와 동일해지는 경우 반복문이 종료된다.
            }

            System.out.println("String output : " + data);
            System.out.println();
        }

            System.out.println("Program Ended.");

    }
}
