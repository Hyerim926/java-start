package construct;

/*
 * 생성자: 객체를 생성하는 시점에 어떤 작업을 하고 싶을 때 이용
 */
public class MemberInit {
    String name;
    int age;
    int grade;

    // 자바는 생성자를 자동으로 만들어준다
    MemberInit() {
        
    }

    // 객체 자기 자신의 멤버변수에 접근하기 위해서 this를 사용한다
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
