package model;

public class BankDetailsRequest {
	
	private String  bankName;
	private String NameOfAccount;
	private String AccNo;
	private String sortCode;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getNameOfAccount() {
		return NameOfAccount;
	}
	public void setNameOfAccount(String nameOfAccount) {
		NameOfAccount = nameOfAccount;
	}
	public String getAccNo() {
		return AccNo;
	}
	public void setAccNo(String accNo) {
		AccNo = accNo;
	}
	public String getSortCode() {
		return sortCode;
	}
	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}
	

}
