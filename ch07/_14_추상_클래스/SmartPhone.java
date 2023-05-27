package ch07._14_추상_클래스;

public class SmartPhone extends Phone{
    SmartPhone(String owner){ //owner 변수를 매개로 받는 생성자를 만든다.
        super(owner); //부모인 Phone 클래스의 owner 필드를 받는 생성자를 호출한다.
    }

    void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }
}
