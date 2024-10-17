abstract class Tour {
    protected String location;
    protected int days;
    protected double chargePerPerson;

    public Tour(String location, int days, double chargePerPerson) {
        this.location = location;
        this.days = days;
        this.chargePerPerson = chargePerPerson;
    }

    public abstract double calculateTotalCharge();

    public void showTourDetails() {
        System.out.println("\nTour Location: " + location);
        System.out.println("Tour Days: " + days);
        System.out.println("Charge per Person: BDT " + chargePerPerson);
        System.out.println("Total Charge: BDT " + calculateTotalCharge());
    }
}
