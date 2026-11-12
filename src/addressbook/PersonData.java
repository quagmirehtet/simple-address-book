package addressbook;

public class PersonData {

	private String name;
	private String phone;
	private String email;

	PersonData(String name, String phone, String email) {

		this.name = name;
		this.phone = phone;
		this.email = email;

	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public  void showPersonalData() {

		System.out.println("Name : " + name + "|" + "Phone :" + phone + "|" + "Email :" + email);

	}

}
