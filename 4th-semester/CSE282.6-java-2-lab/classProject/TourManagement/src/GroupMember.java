public class GroupMember {
    private String name;
    private String email;
    private String phone;
    private int age;

    public GroupMember(String name, String email, String phone, int age) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", E-Mail: " + email + ", Phone: " + phone + ", Age: " + age;
    }
}
