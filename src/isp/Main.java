package isp;

public class Main {
	public static void main(String[] args) {
		
		GmailAccount gmailAcc = new GmailAccount("Jon Iturrioz", "jon.iturrioz@gmail.com");
		String mezua = "Kaixo! Ariketaren nota 10/10 da.";
		EmailSender.sendEmail(gmailAcc, mezua);
	}
}