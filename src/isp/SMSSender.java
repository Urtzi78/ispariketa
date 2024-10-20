package isp;

public class SMSSender {
	public static void sendSMS(SMSReceiver sr, String message) {
		String tel = sr.getTelephone();
        System.out.println("SMSaren igorlea: " + tel + "\nMezua: " + message);
	}
}
