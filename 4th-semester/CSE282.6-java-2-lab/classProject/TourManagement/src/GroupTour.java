class GroupTour extends Tour {
    private int groupSize;

    public GroupTour(String location, int days, double chargePerPerson, int groupSize) {
        super(location, days, chargePerPerson);
        this.groupSize = groupSize;
    }

    @Override
    public double calculateTotalCharge() {
        return days * chargePerPerson * groupSize;
    }

    @Override
    public void showTourDetails() {
        super.showTourDetails();
        System.out.println("Group Size: " + groupSize);
    }
}
