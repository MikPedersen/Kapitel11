package Opgave2;

public class Staff extends Employee{
    private String title;

    public Staff(String name, String address, String email, long phoneNumber, int office, double salary, String title) {
        super(name, address, email, phoneNumber, office, salary);
        this.title = title;
    }

    @Override
    public String toString() {
        return (getClass() + " " + getName());
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
