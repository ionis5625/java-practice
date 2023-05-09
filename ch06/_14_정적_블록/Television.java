package ch06._14_정적_블록;

public class Television {
    static String company = "Company";
    static String model = "LCD";
    static String info;

    static{
        info = company + "-" + model;
    }

    //정적 멤버는 선언 전 초기값을 주는 것이 일반적이다. 하지만 초기값을 주는게 단순히 대입 연산자를 쓰는 것으로 끝나지 않을 때는 정적 블록을
    //사용하는데 위의 static 블록이 바로 정적 블록이다.
}
