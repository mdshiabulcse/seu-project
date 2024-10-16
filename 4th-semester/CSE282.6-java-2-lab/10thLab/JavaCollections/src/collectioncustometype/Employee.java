package collectioncustometype;

public class Employee {
    private String name;
    private String designation;
    private int salary;
    private String[] skills;

    public Employee(String name, String designation, int salary, String[] skills) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getSalary() {
        return salary;
    }
    public String getSkills() {
        return skills;
    }

}