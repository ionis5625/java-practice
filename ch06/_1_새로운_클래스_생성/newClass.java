package ch06._1_새로운_클래스_생성;

public class newClass {
    public static void main(String[] args){
        Class c1 = new Class(); //클래스 객체를 참조하는 c1변수를 new를 통해 생성한다.
        System.out.println("c1 변수는 Class 객체를 참조합니다.");

        Class c2 = new Class();
        System.out.println("c2 변수도 마찬가지로 다른 Class 객체를 참조합니다.");
    }
}
