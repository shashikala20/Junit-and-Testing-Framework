import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
 

public class BankAccountTest {
	 
	BankAccount bankObj ; 
	
	@BeforeAll
    public static void init(){
        System.out.println("@BeforeAll executed");
    }

	@BeforeEach
	public void startup(){ 
        System.out.println("@BeforeEach executed");
    }



	@Test
	public void testWithdraw() {
        bankObj = new BankAccount();
        //balance is 21000
        assertThrows(BankAccount.InsufficientFundsException.class,()-> bankObj.withdraw(70000));
        assertThrows(BankAccount.InsufficientFundsException.class,()-> bankObj.withdraw(40000));
        assertThrows(BankAccount.InsufficientFundsException.class,()-> bankObj.withdraw(35000));
        System.out.println("@Test executed");  
	} 

    @AfterEach
    public void cleanup(){
        System.out.println("@AfterEach executed");
    }

    @AfterAll
     static void ClenUpMethod(){
        System.out.println("@AfterAll executed");
    }


}
