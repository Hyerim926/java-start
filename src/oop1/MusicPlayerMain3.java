package oop1;

/*
 * 메서드를 추출한 절차 지향 프로그래밍
 * 한계: 데이터와 기능이 분리되어있다. 그래서 유지보수 관점에서 관리 포인트가 2곳으로 늘어난다
 * */
public class MusicPlayerMain3 {
    public static void main(String[] args) {
        // 객체 생성
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태
        showStatus(data);

        // 음악 플레이어 끄기
        off(data);
    }

    // 1. 메서드 추출 - 음악 플레이어 켜기
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    // 2. 메서드 추출 - 음악 플레이어 끄기
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    // 3. 메서드 추출 - 음악 볼륨 키우기
    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    // 4. 메서드 추출 - 음악 볼륨 낮추기
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    // 5. 메서드 추출 - 음악 플레이어 상태 확인하기
    static void showStatus(MusicPlayerData data) {
        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
