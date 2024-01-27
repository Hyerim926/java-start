package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자 추가(오버로딩)
    MemberConstruct(String name, int age) {
        this(name, age, 50); // 자기 자신의 생성자 호출, 생성자 안에서만 사용할 수 있다 && 생성자 코드의 첫줄에만 작성할 수 있다
    }

    // 생성자 - 이름은 클래스이름과 동일하게 해야함
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
