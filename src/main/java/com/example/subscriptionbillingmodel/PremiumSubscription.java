package com.example.subscriptionbillingmodel;

public class PremiumSubscription extends Subscription {

    public PremiumSubscription(String subscriberName, PricingStrategy pricingStrategy) {
        super(subscriberName, pricingStrategy);
    }

    @Override
    public String tierName() {
        return "Premium";
    }
}
