package ch05._15_배열의_길이;

public class ArrayLength {
    public static void main(String[] args){
        int[] scores = {84, 90, 96};

        int sum = 0;
        for(int i = 0 ; i < scores.length ; i++){ //scores가 가지고 있는 원소의 개수만큼만 for문을 반복하게 한다.
            sum += scores[i];
        }
        System.out.println("총합 = " + sum);

        double avg = (double)sum / scores.length; //마찬가지로 scores가 가지고 있는 원소의 개수로 나누어주면 평균을 구할 수 있다.
        System.out.println("평균 = " + avg);
    }
}
