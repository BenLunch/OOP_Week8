package ie.atu.oop.week1.demo;

public class StudentTicket extends Ticket
{
    private String StudentId;

    public StudentTicket(String eventName, String holderName, double basePrice, String studentId) {
        super(eventName, holderName, basePrice);
        StudentId = studentId;
    }

    public String getStudentId() {return StudentId;}

    public void setStudentId(String studentId) {StudentId = studentId;}

    public void StudentTicketPrice()
    {
        super.getBasePrice();

    }

}

