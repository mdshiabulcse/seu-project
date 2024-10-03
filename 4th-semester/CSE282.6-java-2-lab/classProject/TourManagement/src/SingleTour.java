public class SingleTour extends Tour {

    public SingleTour(String location, int days, double chargePerPerson) {
        super(location, days, chargePerPerson);
    }

    @Override
    public double calculateTotalCharge() {
        return days * chargePerPerson;
    }
}