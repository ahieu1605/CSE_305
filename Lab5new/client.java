package Lab5new;

import java.math.BigDecimal;
import java.util.Scanner;

public class client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        contract contract;

        while (true) {
            System.out.println("Please choose your Contract: [1] Permanent  [2] Long-term   [3] Short-term");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    contract = new permanent();
                    break;
                case 2:
                    contract = new longterm();
                    break;
                case 3:
                    contract = new shortterm();
                    break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }
            break;
        }

        System.out.println("Enter Contract ID: ");
        String contractId = sc.nextLine();
        System.out.println("Enter Rent Amount: ");
        BigDecimal rentAmount = sc.nextBigDecimal();
        sc.nextLine();
        System.out.println("Enter Tenant ID: ");
        String tenantId = sc.nextLine();
        System.out.println("Enter Property ID: ");
        String propertyId = sc.nextLine();

        contract.buildContractID(contractId)
                .buildRentAmount(rentAmount)
                .buildTenantID(tenantId)
                .buildPropertyID(propertyId)
                .signedContract();

        System.out.println("\nContract details: ");
        System.out.println(contract);
        sc.close();
    }
}
