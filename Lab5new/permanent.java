package Lab5new;

import java.math.BigDecimal;

public class permanent implements contract {

    private String contractId;
    private BigDecimal rentAmount;
    private String tenantId;
    private String propertyId;

    public permanent buildContractID(String contractId) {
        this.contractId = contractId;
        return this;
    }

    public permanent buildRentAmount(BigDecimal rentAmount) {
        this.rentAmount = rentAmount;
        return this;
    }

    public permanent buildTenantID(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    public permanent buildPropertyID(String propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    public permanent signedContract() {
        System.out.println("Permanent Contract Signed!");
        return this;
    }

    public String toString() {
        return "Permanent Contract [Contract ID: " + contractId
                + ", Rent Amount: $" + rentAmount
                + ", Tenant ID: " + tenantId
                + ", Property ID: " + propertyId + "]";
    }
}
