package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account= new Account();
	    assertThat(account.balance, is(0));
	    
    }
	@Test
	public void depositingAmountsIncreaseBalanceByTheSameAmount(){
		Account account= new Account();
		account.deposit(100);
		assertThat(account.balance, is (10));
	}
	
	@Test
	public void depositingMultipleAmounts(){
		Account account = new Account();
		account.deposit(100);
		account.deposit(400);
		assertThat(account.balance, isEqualTo(500);
	}
	
	@Test
	public void WithdrawalAmount(){
		Account account = new Account();
		account.Withdraw(100);
		account.Withdraw(600);
		assertThat(account.balance, is (10));
			   }
	
}
