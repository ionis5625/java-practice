package ch08._6_private_메소드;

public class ServiceExample {
    public static void main(String[] args){
        Service service = new ServiceImplements();

        service.defaultMethod1();
        System.out.println();
        service.defaultMethod2();
        System.out.println();

        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
        System.out.println();
    }
}

/*
private 메소드를 사용하는 경우 종속 코드 A, B 부분을 따로 추가로 작성하지 않은 채 default, static 메소드 안에 넣어주어
코드가 중복되는 것을 방지할 수 있다.

static 메소드의 경우 따로 객체를 생성하지 않아도 되므로 바로 인터페이스를 호출하여 사용할 수도 있다.
 */
