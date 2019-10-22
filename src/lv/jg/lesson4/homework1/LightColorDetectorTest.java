package lv.jg.lesson4.homework1;

public class LightColorDetectorTest {
	public static void main(String[] args) {
        LightColorDetector light = new LightColorDetector();
        String color = light.detect(90);
        String color1 = light.detect(385);
        String color2 = light.detect(460);
        String color3 = light.detect(500);
        String color4 = light.detect(580);
        String color5 = light.detect(600);
        String color6 = light.detect(650);
        String color7 = light.detect(850);

        System.out.println(color);
        System.out.println(color1);
        System.out.println(color2);
        System.out.println(color3);
        System.out.println(color4);
        System.out.println(color5);
        System.out.println(color6);
        System.out.println(color7);
    }
}
