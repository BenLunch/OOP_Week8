package ie.atu.oop.week1.demo;


public class Main {
    public static void main(String[] args) {


        Ticket standard = new Ticket("Summer Concert", "Alice", 50.00);
        StudentTicket student = new StudentTicket("Summer Concert","Bob",50.00,"G00403364");
        VIPTicket vip = new VIPTicket("Summer Concert", "Charlie", 50.00);

        System.out.println("Event: " + standard.getEventName());
        System.out.println(standard);
        System.out.println(student);
        System.out.println(vip);
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Benefits: " + vip.getBenefits());
    }
}
