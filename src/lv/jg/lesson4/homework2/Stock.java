package lv.jg.lesson4.homework2;

//Uzdevums nav saprasts - es paskaidrošu nodarbībā. Atgādini lūdzu par šo
public class Stock {

    //klases laukiem ir jābut "private"
    String company;
    double currentValue;
    double max;
    double min;

    public Stock(String company, double currentValue) {
        this.company = company;
        this.currentValue = currentValue;

        this.max = getMax(150.37,149.82,150.12);
        this.min = getMin(150.37,149.82,150.12);
    }

//    public double getCurrentValue() {
//        return this.currentValue;
//    }

    public String getCompany() {
        return this.company;
    }


    public double updatePrice(double newValue, double newValue2, double newValue3) {
        if ((newValue == 0) && (newValue2 == 0) && (newValue3 == 0)) {
            return currentValue;
        } else if ((newValue != 0) && (newValue2 == 0) && (newValue3 == 0)) {
            return newValue;
        } else if ((newValue != 0) && (newValue2 != 0) && (newValue3 == 0)) {
            return newValue2;
        } else {
            return newValue3;
        }

    }
    public double getMax(double newValue, double newValue2, double newValue3) {
        if ((currentValue > newValue) && (currentValue > newValue2) && (currentValue > newValue3)) {
            return currentValue;
        } else if ((currentValue < newValue) && (newValue > newValue2) && (newValue > newValue3)) {
            return newValue;
        } else if ((currentValue < newValue2) && (newValue < newValue2) && (newValue2 > newValue3)) {
            return newValue2;
        } else {
            return newValue3;
        }
    }
    public double getMin(double newValue, double newValue2, double newValue3) {
        if ((currentValue < newValue) && (currentValue < newValue2) && (currentValue < newValue3)) {
            return currentValue;
        } else if ((currentValue > newValue) && (newValue < newValue2) && (newValue < newValue3)) {
            return newValue;
        } else if ((currentValue > newValue2) && (newValue > newValue2) && (newValue2 < newValue3)) {
            return newValue2;
        } else {
            return newValue3;
        }
    }

    public String printInformation() {
        return getCompany() + " stock:";
    }
}


