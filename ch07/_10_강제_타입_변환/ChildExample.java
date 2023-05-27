package ch07._10_강제_타입_변환;

public class ChildExample {
    public static void main(String[] args){
        Parent parent = new Child(); //자동 타입 변환이 이루어진다

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        /*
        parent.field2 = "data2";
        parent.method3();

        자동 타입 변환이 이루어졌으므로 자식 객체의 필드와 메소드는 사용이 불가능하다.

        */

        Child child = (Child) parent;
        /*
        여기서는 강제 타입 변환이 이루어진다.
        자동 타입 변환이 자식이 부모 타입이 되는거라면 여기선 부모가 자식 타입이 된다.
        따라서 자식 클래스에 있던 메소드와 필드에 접근이 가능해진다.
        */
        child.field2 = "data2";
        child.method3();
    }
}
