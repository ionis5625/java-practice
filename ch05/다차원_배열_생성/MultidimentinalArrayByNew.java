package ch05.다차원_배열_생성;

import java.util.Scanner;

public class MultidimentinalArrayByNew {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[][] mathScores = new int[2][3];

        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        int sum = 0;
        int students = 0;

        for(int i = 0 ; i < mathScores.length ; i++){
            for(int j = 0 ; j < mathScores[i].length ; j++){
                sum += mathScores[i][j];
                students++;
            }
        }

        double avg = (double)sum / students;

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + avg);


    }
}
