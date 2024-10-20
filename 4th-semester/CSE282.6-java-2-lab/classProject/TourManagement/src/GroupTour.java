import java.util.ArrayList;
import java.util.List;

public class GroupTour extends Tour {
    private List<GroupMember> groupMembers;

    public GroupTour(String location, int days, double pricePerDayPerPerson) {
        super(location, days, pricePerDayPerPerson);
        this.groupMembers = new ArrayList<>();
    }

    public void addGroupMember(GroupMember member) {
        groupMembers.add(member);
    }

    @Override
    public void showTourDetails() {
        System.out.println("Group Tour Details:");
        System.out.println("Location: " + location);
        System.out.println("Duration: " + days + " days");
        System.out.println("Price per day per person: $" + pricePerDayPerPerson);
        System.out.println("Total Charge: $" + calculateTotalCharge());
        System.out.println("Group Members:");
        for (GroupMember member : groupMembers) {
            System.out.println(member.getName());
        }
    }
}
