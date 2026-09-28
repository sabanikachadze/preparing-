package org.example.subscriptionbillingmodel;

public abstract class Subscription {

    private final String subscriberName;
    private final PricingStrategy pricingStrategy;

    protected Subscription(String subscriberName, PricingStrategy pricingStrategy) {
        this.subscriberName = subscriberName;
        this.pricingStrategy = pricingStrategy;
    }

    abstract String tierName();


    public double amountDue() {
        return pricingStrategy.monthlyCharge();
    }

    public String summary() {
        return String.format("%s's %s plan owes %.2f",
                subscriberName, tierName(), amountDue());
    }
}
