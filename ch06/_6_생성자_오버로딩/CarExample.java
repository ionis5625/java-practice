package ch06._6_생성자_오버로딩;

public class CarExample {
    public static void main(String[] args) {
        Car Car1 = new Car();
        Car Car2 = new Car("그랜저");
        Car Car3 = new Car("아반떼", "검은색");
        Car Car4 = new Car("소나타", "회색", 220);
        //생성자를 여러개 만들어주어 각각의 방법으로 객체를 초기화한다.

        System.out.println("Car1의 제작사 : " + Car1.company);

        System.out.println();

        System.out.println("Car2의 제작사 : " + Car2.company);
        System.out.println("Car2의 모델명 : " + Car2.model);

        System.out.println();

        System.out.println("Car3의 제작사 : " + Car3.company);
        System.out.println("Car3의 모델명 : " + Car3.model);
        System.out.println("Car3의 색상 : " + Car3.color);

        System.out.println();

        System.out.println("Car4의 제작사 : " + Car4.company);
        System.out.println("Car4의 모델명 : " + Car4.model);
        System.out.println("Car4의 색상 : " + Car4.color);
        System.out.println("Car4의 최고속도 : " + Car4.maxSpeed);
    } //각각의 생성자에 대해 다른 출력 결과를 보인다.
}
