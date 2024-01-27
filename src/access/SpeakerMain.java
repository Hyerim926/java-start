package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        System.out.println("volume 필드에 직접 접근 수정");
//        speaker.volume = 200;
        speaker.showVolume(); // 스피커 고장 -> 필드에 직접 접근이 가능해서 volumeUp()에서 100 조건을 넣었음에도 원하는대로 동작 x
    }
}
