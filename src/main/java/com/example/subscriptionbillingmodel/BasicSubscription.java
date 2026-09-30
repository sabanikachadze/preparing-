package com.example.subscriptionbillingmodel;

public class BasicSubscription extends Subscription{

    public BasicSubscription(String subscriberName, PricingStrategy pricingStrategy) {
        super(subscriberName, pricingStrategy);
    }

    @Override
    public String tierName() {
        return "Basic";
    }
}
