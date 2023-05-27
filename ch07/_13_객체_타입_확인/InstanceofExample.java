package ch07._13_객체_타입_확인;

public class InstanceofExample {
    public static void personInfo(Person person) { //main 메소드에서 바로 호출하기 위해 정적 메소드를 선언한다.
        System.out.println("이름 : " + person.name);
        person.walk();

    if(person instanceof Student student){ //person이 참조하는 객체가 Student인 경우 student로 타입 변환이 이루어진다.
        System.out.println("학생 번호 : " + student.studentNo);
        student.study();
    }
}

    public static void main(String[] args){
        Person p1 = new Person("홍길동"); //person 객체를 매개로 제공한 뒤 personInfo 메소드를 호출한다.
        personInfo(p1);

        System.out.println();

        Person p2 = new Student("김길동", 10); //Student 객체를 매개로 제공한 뒤 personInfo 메소드를 호출한다.
        personInfo(p2);
    }
}
