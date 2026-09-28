package org.example.subscriptionbillingmodel;

public class FlatRatePricing implements PricingStrategy{

    private final double fixedFee;

    public FlatRatePricing(double fixedFee) {
        this.fixedFee = fixedFee;
    }

    @Override
    public double monthlyCharge() {
        return fixedFee;
    }
}
