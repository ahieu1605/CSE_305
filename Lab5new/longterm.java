package Lab5new;

import java.math.BigDecimal;

public class longterm implements contract {

    private String contractId;
    private BigDecimal rentAmount;
    private String tenantId;
    private String propertyId;

    public longterm buildContractID(String contractId) {
        this.contractId = contractId;
        return this;
    }

    public longterm buildRentAmount(BigDecimal rentAmount) {
        this.rentAmount = rentAmount;
        return this;
    }

    public longterm buildTenantID(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    public longterm buildPropertyID(String propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    public longterm signedContract() {
        System.out.println("Long-term Contract Signed!");
        return this;
    }

    public String toString() {
        return " Long-term Contract [Contract ID: " + contractId
                + ", Rent Amount: $" + rentAmount
                + ", Tenant ID: " + tenantId
                + ", Property ID: " + propertyId + "]";
    }
}
