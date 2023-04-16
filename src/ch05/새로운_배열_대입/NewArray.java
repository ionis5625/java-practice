package ch05.새로운_배열_대입;

public class NewArray {
    public static void main(String[] args) {
        int[] scores; //scores라는 배열을 선언한다.

        scores = new int[]{83, 90, 87}; //이미 선언된 배열에 새로운 배열을 대입하고 싶다면 new를 사용해야한다.

        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합 : " + sum1);

        printItem(new int[]{83, 88, 81}); //배열을 매개값으로 하는 printItem이라는 메소드를 호출한다.
    }                                     //C언어의 함수와 같은 개념이라고 볼 수 있다.

        public static void printItem(int[] scores){ //호출한 printItem이라는 메소드를 선언해준다.
            for(int i = 0 ; i < 3 ; i++){           //이 때 new int라는 배열을 넘겨주고 그것이 int[] scores라고 메소드상에서 정의했으므로
                                                    //int[] scores는 새로운 값으로 덮어씌워진다.
                System.out.println("score[" + i + "] = " + scores[i]); //대괄호를 출력하기 위해 각각을 큰따옴표로 묶어준다.
            }
        }
    }

