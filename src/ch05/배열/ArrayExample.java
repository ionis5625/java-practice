package ch05.배열;

public class ArrayExample {
    public static void main(String[] args){
        String[] season = {"Spring", "Summer", "Fall", "Winter"}; //season이라는 배열에 각 계절의 이름을 저장한다.

        System.out.println("season[0] : " + season[0]);
        System.out.println("season[1] : " + season[1]);
        System.out.println("season[2] : " + season[2]);
        System.out.println("season[3] : " + season[3]); //0~3번까지 저장된 계절의 이름을 출력한다.

        System.out.println();

        season[1] = "여름";
        System.out.println("season[1] : " + season[1]);
        System.out.println(); //각 인덱스에 따로 접근해서 값을 바꾸는 것도 가능하다.

        int[] score = {23, 48, 96};

        int sum = 0;
        for(int i = 0 ; i < 3 ; i++)
            sum += score[i]; //배열을 이용하여 각 점수의 합을 구해준다.

        System.out.println("점수의 총합 = " + sum);

        double avg = (double)sum / 3; //점수의 평균을 구한다.
                                      // 이 때 sum은 int형이므로 소수점까지 계산하기 위해 sum에 일시적으로 double 형변환을 한다.

        System.out.println("점수의 평균 = " + avg);
    }
}
