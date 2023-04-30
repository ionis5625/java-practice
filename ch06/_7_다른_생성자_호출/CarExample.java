package ch06._7_다른_생성자_호출;

public class CarExample {
    public static void main(String[] args){
        Car Car1 = new Car("그랜저");
        Car Car2 = new Car("소나타", "회색");
        Car Car3 = new Car("아반떼", "파란색", 250);

        System.out.println();

        System.out.println("Car1의 모델명 : " + Car1.model);

        System.out.println();

        System.out.println("Car2의 모델명 : " + Car2.model);
        System.out.println("Car2의 색상 : " + Car2.color);

        System.out.println();

        System.out.println("Car3의 모델명 : " + Car3.model);
        System.out.println("Car3의 색상 : " + Car3.color);
        System.out.println("Car3의 최고속도 : " + Car3.maxSpeed);
    }
}
