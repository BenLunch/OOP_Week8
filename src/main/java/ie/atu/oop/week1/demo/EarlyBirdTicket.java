package ie.atu.oop.week1.demo;

public class EarlyBirdTicket extends Ticket {

    public EarlyBirdTicket(String eventName, String holderName, double basePrice)
    {
        super(eventName, holderName, basePrice);
    }

    @Override
    public double calculatePrice()
    {
        double discountLimit = getBasePrice() - 10;
        if(discountLimit < 0)
        {
            return 0;
        }
        return discountLimit;
    }

    @Override
    public String toString()
    {
        return String.format("Early Bird Ticket - %s: €%.2f", getHolderName(), calculatePrice());
    }
}
