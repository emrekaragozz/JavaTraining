package employee;
import commerce.*;

public class Teller {
    public void processAccount(int depositSlip, int withdrawalSlip) {
        new Bank().withdrawal(withdrawalSlip); // an instance of Bank is created
        new Bank().deposit(depositSlip); } // an instance of Bank is created
}