package ch07._9_타입_변환;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child(); //child 객체를 생성한다.
        Parent parent = child;
        /*
        클래스의 타입 변환이 일어나는 부분이다.
        객체는 부모 클래스의 타입으로 변환된다.
        이 때 자식 클래스에서 오버라이딩된 메소드는 자식 클래스의 것을 따르지만
        타입 변환이 일어난 경우 부모 클래스에 선언된 필드와 메소드에만 접근 가능하다.
        */

        parent.method1();
        parent.method2();
        //parent.method3(); method3는 Parent 클래스 내에 존재하지 않기 때문에 호출이 불가능하다.
    }
}
