package bankSystem;

import bankSystem.system.AtmMachineFacade;

public class Main {
    public static void main(String[] args) {

        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();

        atmMachineFacade.withDrawMoney();
    }
}
