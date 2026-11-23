package ie.atu.oop.week1.demo;

public class VIPTicket extends Ticket {
    public VIPTicket(String eventName, String holderName, double basePrice)
    {
        super(eventName, holderName, basePrice);
    }

    @Override
    public double calculatePrice()
    {
        return getBasePrice() + 25.0;
    }

    public String getBenefits()
    {
        return "Priority entry and reserved seating";
    }

    @Override
    public String toString()
    {
        return String.format("VIP Ticket - %s: €%.2f", getHolderName(), calculatePrice());
    }

}
