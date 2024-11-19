package Lab5new;

import java.math.BigDecimal;

public class shortterm implements contract {

    private String contractId;
    private BigDecimal rentAmount;
    private String tenantId;
    private String propertyId;

    public shortterm buildContractID(String contractId) {
        this.contractId = contractId;
        return this;
    }

    public shortterm buildRentAmount(BigDecimal rentAmount) {
        this.rentAmount = rentAmount;
        return this;
    }

    public shortterm buildTenantID(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    public shortterm buildPropertyID(String propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    public shortterm signedContract() {
        System.out.println("Short-term Contract Signed!");
        return this;
    }

    public String toString() {
        return "Short-term Contract [Contract ID: " + contractId
                + ", Rent Amount: $" + rentAmount
                + ", Tenant ID: " + tenantId
                + ", Property ID: " + propertyId + "]";
    }
}
