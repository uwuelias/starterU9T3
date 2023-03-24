public class Taxi extends Car {
  private double fareCollected;

  public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
    super(licensePlate, tollFee, passengers, isElectric); // super refers to the Car constructor
    this.fareCollected = fareCollected;
  }


  public boolean chargeAndDropOffRiders(double fees) {
    fareCollected += (getPassengers() - 1) * fees;
    setPassengers(1);
    return true;
  }

  public double getFareCollected() {
    return fareCollected;
  }
}