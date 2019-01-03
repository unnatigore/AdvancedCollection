package com.advancedassignment;

public class MoneyMoneyBankSavingsAccount {

	private int accountId;
	private String accountHolderName;
	private double accountBalance;
	private boolean isSalaryAccount;
	
	public MoneyMoneyBankSavingsAccount(int accountId,
			String accountHolderName, double accountBalance,
			boolean isSalaryAccount) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.isSalaryAccount = isSalaryAccount;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accountBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime
				* result
				+ ((accountHolderName == null) ? 0 : accountHolderName
						.hashCode());
		result = prime * result + accountId;
		result = prime * result + (isSalaryAccount ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MoneyMoneyBankSavingsAccount other = (MoneyMoneyBankSavingsAccount) obj;
		if (Double.doubleToLongBits(accountBalance) != Double
				.doubleToLongBits(other.accountBalance))
			return false;
		if (accountHolderName == null) {
			if (other.accountHolderName != null)
				return false;
		} else if (!accountHolderName.equals(other.accountHolderName))
			return false;
		if (accountId != other.accountId)
			return false;
		if (isSalaryAccount != other.isSalaryAccount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MoneyMoneyBankSavingsAccount [accountId=" + accountId
				+ ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + ", isSalaryAccount="
				+ isSalaryAccount + "]";
	}
	
	

}
