package lv.jg.lesson4.homework1;

//Ok
public class LightColorDetector {

    private int wavelength; //šis mainīgais nav nepieciešams, jo netiek izmantots

    public String detect(int wavelength) {
        this.wavelength = wavelength; //ši darbība ir lieka, jo klases mainīgais "wavelength" tālāķ netiek izmantots
        if ((wavelength >= 380) && (wavelength < 450)) {
            return "Gaisma ir violēta";
        } else if ((wavelength >= 450) && (wavelength < 495)){  //ipapildus iekavas labak neizmantot šeit
            return "Gaisma ir zila";
        } else if ((wavelength >= 495) && (wavelength < 570)){  //ipapildus iekavas labak neizmantot šeit
            return "Gaisma ir zaļa";
        } else if ((wavelength >= 570) && (wavelength < 590)){  //ipapildus iekavas labak neizmantot šeit
            return "Gaisma ir dzeltene";
        } else if ((wavelength >= 590) && (wavelength < 620)){  //ipapildus iekavas labak neizmantot šeit
            return "Gaisma ir orandža";
        } else if ((wavelength >= 620) && (wavelength < 750)){  //ipapildus iekavas labak neizmantot šeit
            return "Gaisma ir sarkana";
        } else {
            return "Gaisma nav redzama";
        }
    }
}
