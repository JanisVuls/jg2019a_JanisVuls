package lv.jg.lesson4.homework1;

public class LightColorDetector {

    private int wavelength;

    public String detect(int wavelength) {
        this.wavelength = wavelength;
        if (wavelength >= 380 && wavelength < 450) {
            return "Gaisma ir violeta";
        } else if ((wavelength >= 450) && (wavelength < 495)) {
            return "Gaisma ir zila";
        } else if ((wavelength >= 495) && (wavelength < 570)) {
            return "Gaisma ir zaļa";
        } else if ((wavelength >= 570) && (wavelength < 590)) {
            return "Gaisma ir dzeltena";
        } else if ((wavelength >= 590) && (wavelength < 620)) {
            return "Gaisma ir oranža";
        } else if ((wavelength >= 620) && (wavelength < 750)) {
            return "Gaisma ir sarkana";
        } else {
            return "Gaisma nav redzama";
        }
    }
}
