package bankSystem.system;

import bankSystem.system.AtmMachine;
import bankSystem.system.BankSystem;

public class AtmMachineFacade {

    private AtmMachine atmMachine;
    private BankSystem bankSystem;

    public AtmMachineFacade() {
        this.atmMachine = new AtmMachine();
        this.bankSystem = new BankSystem();
    }

    public void withDrawMoney() {
        atmMachine.enterPin();
        if (bankSystem.validatePin() && bankSystem.validateTransaction()) {
            bankSystem.transferMoney();
        }
    }


}
