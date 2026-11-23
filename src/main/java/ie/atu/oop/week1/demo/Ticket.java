package ie.atu.oop.week1.demo;

public class Ticket {
    private String eventName;
    private String holderName;
    private double basePrice;

    public Ticket(String eventName, String holderName, double basePrice)
    {
        this.eventName = eventName;
        this.holderName = holderName;
        this.basePrice = basePrice;
    }

    public String getEventName() {return eventName;}
    public String getHolderName() {return holderName;}
    public double getBasePrice() {return basePrice;}

    public void setEventName(String eventName) {this.eventName = eventName;}
    public void setHolderName(String holderName) {this.holderName = holderName;}
    public void setBasePrice(double basePrice) {this.basePrice = basePrice;}

    public double calculatePrice(){
        return basePrice;
    }

    @Override
    public String toString() {
        return String.format("Standard Ticket - %s: €%.2f", getHolderName(), calculatePrice());
    }
}
