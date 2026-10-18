public class Odometer
{
    private int reading;

    public Odometer(int inputReading) {
        reading = inputReading;
    }

    public int getReading() {
        return reading;
    }

    public int getReadingAfter(int milesDriven) {
        int actualReading = reading + milesDriven;
        reading = actualReading % 999999;
        return reading;
    }

    public int getDigitSum() {
        int hundredThousands = (reading / 100000) % 10;
        int tenThousands = (reading / 10000) % 10;
        int thousands = (reading / 1000) % 10;
        int hundreds  = (reading / 100) % 10;
        int tens = (reading / 10) % 10;
        int ones =  reading % 10;

        return hundredThousands + tenThousands + thousands + hundreds + tens + ones;
    }
}
