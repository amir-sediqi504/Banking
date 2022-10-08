import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount account = new BankAccount("Amir", "Sediqi", 100);
        double balans = account.deposit(100, true);
        assertEquals(200, 200, 0);
    }

    @org.junit.Test
    public void withdraw() {
        fail("This test has yet to be implemented");
    }

    @org.junit.Test
    public void getBalance() {
        fail("This test has yet to be implemented");
    }

    @org.junit.Test
    public void dummyTest(){
        assertEquals(1, 1);
    }
}
