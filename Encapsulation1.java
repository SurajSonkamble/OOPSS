package javaoops;


class Account{
	public String name;
	protected String email;
	private String password;
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String pass) {
		this.password=pass;
	}
}

public class Encapsulation1 {

	public static void main(String[] args) {
		Account account = new Account();
		account.name="suraj";
		account.email ="surajsonkamble@ltce.in";
		account.setPassword("surya");
		System.out.println(account.getPassword());
		

	}

}
