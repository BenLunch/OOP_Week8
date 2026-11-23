package ie.atu.oop.week1.demo;


public class Main {
    public static void main(String[] args) {


        Ticket standard = new Ticket("Summer Concert", "Alice", 80);
        StudentTicket student = new StudentTicket("Summer Concert","Bob",80,"G00403364");
        VIPTicket vip = new VIPTicket("Summer Concert", "Charlie", 80);
        EarlyBirdTicket early1 = new EarlyBirdTicket("Summer Concert","Mark",50);
        EarlyBirdTicket early2 = new EarlyBirdTicket("Summer Concert","Adrian",7);

        System.out.println("Event: " + standard.getEventName());
        System.out.println(standard);
        System.out.println(student);
        System.out.println(vip);
        System.out.println(early1);
        System.out.println(early2);
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Benefits: " + vip.getBenefits());



    }
}
