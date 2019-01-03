package com.advancedassignment;

public class SavingsAccountAssignment {
	private double accountBalance;
	private int accountNumber;
	private String accountHolderName;
	private boolean isSalaryAccount;

	public SavingsAccountAssignment(double accountBalance, int accountNumber,
			String accountHolderName, boolean isSalaryAccount) {
		super();
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;

	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
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
		result = prime * result + accountNumber;
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
		SavingsAccountAssignment other = (SavingsAccountAssignment) obj;
		if (Double.doubleToLongBits(accountBalance) != Double
				.doubleToLongBits(other.accountBalance))
			return false;
		if (accountHolderName == null) {
			if (other.accountHolderName != null)
				return false;
		} else if (!accountHolderName.equals(other.accountHolderName))
			return false;
		if (accountNumber != other.accountNumber)
			return false;
		if (isSalaryAccount != other.isSalaryAccount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SavingsAccountAssignment [accountBalance=" + accountBalance
				+ ", accountNumber=" + accountNumber + ", accountHolderName="
				+ accountHolderName + ", isSalaryAccount=" + isSalaryAccount
				+ "]";
	}

}
