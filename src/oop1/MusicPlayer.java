package oop1;

/*
* 사용하는 데이터와 메서드를 묶어놓은 것을 캡슐화라고 칭함
* */
public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    // 파라미터에는 들어갈 값이 없다. 자기 객체에서 접근하는 것이기 때문에
    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void showStatus() {
        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
