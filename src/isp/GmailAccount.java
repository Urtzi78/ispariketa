package isp;

public class GmailAccount implements EmailReceiver {
	String name, emailAddress;
	
	public GmailAccount(String n, String ea) {
		name = n;
		emailAddress = ea;
	}

	public String getName() {
		return name;
	}

	@Override
	public String getEmail() {
		return emailAddress;
	}

	public void setName(String n) {
		name = n;
	}

	public void setEmailAddress(String ea) {
		emailAddress = ea;
	}
}
