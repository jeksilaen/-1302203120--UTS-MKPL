package lib;

public class Personal {
    private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
	private boolean isForeigner;
	public enum Gender {
		PRIA,
		WANITA
	}
	private Gender gender;

    public Personal(String employeeId, String firstName, String lastName, String idNumber, String address, boolean isForeigner, Gender gender) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
		this.isForeigner = isForeigner;
		this.gender = gender;
		
	}
}
