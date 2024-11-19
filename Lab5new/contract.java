package Lab5new;

import java.math.BigDecimal;

public interface contract {

    contract buildContractID(String contractId);

    contract buildRentAmount(BigDecimal rentAmount);

    contract buildTenantID(String tenantId);

    contract buildPropertyID(String propertyId);

    contract signedContract();
}
