public class Vehicle
{
    private double tankSize;
    private double milesPerGallon;

    public Vehicle(double inputTankSize, double inputMilesPerGallon)
    {
        tankSize = inputTankSize;
        milesPerGallon = inputMilesPerGallon;
    }

    public double getRangeMiles() {
        return tankSize * milesPerGallon;
    }

    public double getGallonsNeeded(double miles) {
        return miles / milesPerGallon;
    }

    public int getFillUps(double miles) {
        double fillUps = Math.ceil(miles / getRangeMiles());
        return (int) fillUps;
    }
}
