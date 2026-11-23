package ie.atu.oop.week1.demo;

public class StudentTicket extends Ticket
{
    private String studentId;

    public StudentTicket(String eventName, String holderName, double basePrice, String studentId) {
        super(eventName, holderName, basePrice);
        this.studentId = studentId;
    }

    public String getStudentId() {return studentId;}

    public void setStudentId(String studentId) {studentId = studentId;}

    @Override
    public double calculatePrice()
    {
        return getBasePrice() * 0.80;
    }

    @Override
    public String toString()
    {
        return String.format("Student Ticket - %s: €%.2f", getHolderName(), calculatePrice());
    }
}

