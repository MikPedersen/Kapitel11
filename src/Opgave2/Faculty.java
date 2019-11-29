package Opgave2;

public class Faculty extends Employee{


    private int officeHours, rank;

    public Faculty(String name, String address, String email, long phoneNumber, int office,
                   double salary, int officeHours, int rank) {
        super(name, address, email, phoneNumber, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return (getClass() + " " + getName());
    }
    public int getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
