package lv.jg.lesson4.homework1;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetector light = new LightColorDetector();
        String color = light.detect(90);
        System.out.println(color);
    }
}
