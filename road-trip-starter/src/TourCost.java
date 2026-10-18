public class TourCost
{
    private int fuelCostPerGallonCents;

    public TourCost(int inputFuelCostPerGallonCents) {
        fuelCostPerGallonCents = inputFuelCostPerGallonCents;
    }

    public int getFuelCostCents(double gallons) {
        double fuelCost = fuelCostPerGallonCents * gallons;
        return (int) Math.round(fuelCost);
    }

    public int getShareCents(int totalCents, int people) {
        return totalCents / people;
    }

    public int getRemainderCents(int totalCents, int people) {
        return totalCents % people;
    }

    public int convertFuelCostToDollars(int cents) {
        return getFuelCostCents(cents) / 100;
    }

    public int convertFuelCostToCents(int cents) {
        return getFuelCostCents(cents) % 100;
    }
}
