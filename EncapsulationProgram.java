package basicProgramofJava;

//Assignment 140
class Amazon_properties {
	private String un = "piyasimondal29@gmail.com";
	private int otp = 1234;

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}
}

public class EncapsulationProgram {

	public static void main(String[] args) {
		Amazon_properties a = new Amazon_properties();
		a.setUn("Piya.mon@gmail.com");
		System.out.println(a.getUn());
		a.setOtp(1010);
		System.out.println(a.getOtp());
	}
}
