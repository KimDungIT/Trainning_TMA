package design_pattern.adapter.music;

public class Test {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("vlc", "beyond the horizon.vlc");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("avi", "mind me.avi");
    }
}
