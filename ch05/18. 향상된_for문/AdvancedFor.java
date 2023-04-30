package ch05.향상된_for문;

public class AdvancedFor {
    public static void main(String[] args){
        int[] scores = {95, 71, 84, 93, 87};
        int sum = 0;

        for(int score : scores){ //java의 신 버전에서 제공되는 for문으로 배열에 대해 반복해야하는 경우 사용할 수 있다.
            sum += score;        //for라는 scope 안에서 사용될 score라는 int변수를 생성한 뒤 자동으로 scores배열의 처음부터 끝까지
                                 //score에 하나씩 대입한 후 for문을 실행한다.
                                 //원래의 for문대로 표현하면 아래의 식과 같을 것이다.
                                 /*
                                 for(int score = 0 ; score < scores.length ; score++)
                                 {
                                     sum += score;
                                 }
                                 */
        }

        System.out.println("점수의 총합 : " + sum);
        double avg = (double)sum / scores.length;
        System.out.println("점수의 평균 : " + avg);
    }
}
