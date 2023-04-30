package ch05._16_다차원_배열;

public class MultidimensionalArray {
    public static void main(String[] args){
        int[][] scores = {{80, 90, 96}, {76, 88}}; //원하는 차원만큼 대괄호를 추가하고 들어갈 원소도 입력해준다.
                                                   //이 경우 대괄호가 2개이므로 int[0][]과 int[1][] 2가지로 생성되고
                                                   //각각 선언해준 원소가 차례로 대입될 것이다.
        System.out.println("1차원 배열의 길이(원소 집합의 개수) : " + scores.length);
        System.out.println("2차원 배열의 길이(int[0][]의 개수) : " + scores[0].length);
        System.out.println("2차원 배열의 길이(int[1][]의 개수) : " + scores[1].length);

        int class1Sum = 0;

        for(int i = 0 ; i < scores[0].length ; i++){
            class1Sum += scores[0][i];
        }

        System.out.println("첫번째 집합 원소의 합 : " + class1Sum);

        int class2Sum = 0;

        for(int i = 0 ; i < scores[1].length ; i++){
            class2Sum += scores[1][i];
        }

        System.out.println("첫번째 집합 원소의 합 : " + class2Sum);
        System.out.println();

        double avg;
        int sum = 0;
        int students = 0;

        for(int i = 0 ; i < scores.length ; i++){
            for(int j = 0 ; j < scores[i].length ; j++){
                sum += scores[i][j];
                students++;
            }
        }

        avg = (double)sum / students;
        System.out.println("전체 학생 점수의 평균 : " + avg);

    }
}
