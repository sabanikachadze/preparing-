package com.example.subscriptionbillingmodel;

public class UsageBasedPricing implements PricingStrategy {

    private final double rate;
    private int totalUnitsRecorded = 0;

    public UsageBasedPricing(double rate) {
        this.rate = rate;
    }

    @Override
    public double monthlyCharge() {
        return rate * totalUnitsRecorded;
    }

    public void recordUsage(int units){
        totalUnitsRecorded += units;
    }
}
