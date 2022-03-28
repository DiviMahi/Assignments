package Assignment6;

public class FileNotFoundException extends Exception {
	String msg;

	public FileNotFoundException(String msg) {
		super();
		this.msg = msg;
	}

	public String Msg() {
		return msg;

	}

}
