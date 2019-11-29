package Opgave2;

public class Student extends Person{


    private int status;
    final static int freshman= 1;
    final static int sophomore = 2;
    final static int junior = 3;
    final static int senior = 4;


    public Student(String name, String address, String email, long phoneNumber, int status) {
        super(name, address, email, phoneNumber);
        this.status = status;
    }

    @Override
    public String toString(){
       return (getClass() + " " + getName());

    }
    public String getStatus() {
        switch (status){
            case 1 : return "Freshman";
            case 2 : return "Sophomore";
            case 3 : return "Junior";
            case 4 : return "Senior";
            default: return "Unknown";
        }
    }

    public void setStatus(int status) {
        this.status = status;
    }


}
