package ch06._9_가변길이_매개변수;

public class Computer {
    int sum(int ... values){ //길이가 따로 정해지지 않은 가변길이 매개변수를 가지는 메소드이다.
        int sum = 0;

        for(int i = 0 ; i < values.length ; i++) //values의 개수만큼 for문을 반복한다.
             sum += values[i]; //가변길이 매개변수는 배열의 형태이기 때문에 인덱스 0번부터 sum에 차례로 더하기 시작한다.

        return sum; //더해진 sum 값을 반환한다.
    }
}
