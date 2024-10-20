package isp;

public class EmailSender {
	public static void sendEmail(EmailReceiver er, String message) {
		String email = er.getEmail();
        System.out.println("Emailaren igorlea: " + email + "\nMezua: " + message);
	}
}
