package ch05._21_열거Enum_타입;

import java.util.Calendar; //Calandar를 쓰기 위해서 java.util 패키지 안의 Calandar 메소드를 가져온다.

public class EnumExample {
    public static void main(String[] args){
        Week today = null; //먼저 만들어준 Week타입을 가지는 today라는 변수를 null로 선언한다.

        Calendar cal = Calendar.getInstance(); //Calendar 객체를 얻고 그 주소를 cal에 입력한다.

        int week = cal.get(Calendar.DAY_OF_WEEK); //컴퓨터상의 요일을 기준으로 일~토 요일을 1~7까지의 숫자로 얻고 week에 대입한다.

        switch(week){ //Week.java에 선언해준 요일 자료를 가져와서 비교한다.
            case 1 -> today = Week.SUNDAY;
            case 2 -> today = Week.MONDAY;
            case 3 -> today = Week.TUESDAY;
            case 4 -> today = Week.WEDNESDAY;
            case 5 -> today = Week.THURSDAY;
            case 6 -> today = Week.FRIDAY;
            case 7 -> today = Week.SATURDAY;
        }

        if(today == Week.SUNDAY){ //오늘이 일요일인 경우
            System.out.println("일요일에는 쉽니다.");
        }

        else                      //오늘이 일요일이 아닌 경우
            System.out.println("공부를 합니다.");
    }
}
