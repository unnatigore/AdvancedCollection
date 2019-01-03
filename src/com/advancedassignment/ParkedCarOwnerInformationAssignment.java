
package com.advancedassignment;

public class ParkedCarOwnerInformationAssignment {
	private String carOwnerName;
	private String carModel;
	private int carNumber;
	private int carOwnerMobileNumber;
	private String carOwnerAddress;
	
	public ParkedCarOwnerInformationAssignment(String carOwnerName,
			String carModel, int carNumber, int carOwnerMobileNumber,
			String carOwnerAddress) {
		super();
		this.carOwnerName = carOwnerName;
		this.carModel = carModel;
		this.carNumber = carNumber;
		this.carOwnerMobileNumber = carOwnerMobileNumber;
		this.carOwnerAddress = carOwnerAddress;
	}

	public String getCarOwnerName() {
		return carOwnerName;
	}

	public void setCarOwnerName(String carOwnerName) {
		this.carOwnerName = carOwnerName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public int getCarOwnerMobileNumber() {
		return carOwnerMobileNumber;
	}

	public void setCarOwnerMobileNumber(int carOwnerMobileNumber) {
		this.carOwnerMobileNumber = carOwnerMobileNumber;
	}

	public String getCarOwnerAddress() {
		return carOwnerAddress;
	}

	public void setCarOwnerAddress(String carOwnerAddress) {
		this.carOwnerAddress = carOwnerAddress;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((carModel == null) ? 0 : carModel.hashCode());
		result = prime * result + carNumber;
		result = prime * result
				+ ((carOwnerAddress == null) ? 0 : carOwnerAddress.hashCode());
		result = prime * result + carOwnerMobileNumber;
		result = prime * result
				+ ((carOwnerName == null) ? 0 : carOwnerName.hashCode());
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
		ParkedCarOwnerInformationAssignment other = (ParkedCarOwnerInformationAssignment) obj;
		if (carModel == null) {
			if (other.carModel != null)
				return false;
		} else if (!carModel.equals(other.carModel))
			return false;
		if (carNumber != other.carNumber)
			return false;
		if (carOwnerAddress == null) {
			if (other.carOwnerAddress != null)
				return false;
		} else if (!carOwnerAddress.equals(other.carOwnerAddress))
			return false;
		if (carOwnerMobileNumber != other.carOwnerMobileNumber)
			return false;
		if (carOwnerName == null) {
			if (other.carOwnerName != null)
				return false;
		} else if (!carOwnerName.equals(other.carOwnerName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ParkedCarOwnerInformationAssignment [carOwnerName="
				+ carOwnerName + ", carModel=" + carModel + ", carNumber="
				+ carNumber + ", carOwnerMobileNumber=" + carOwnerMobileNumber
				+ ", carOwnerAddress=" + carOwnerAddress + "]";
	}
}
