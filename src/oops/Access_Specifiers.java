package oops;

public class Access_Specifiers {

	/**
	 * Public Access
	 * Default Access / No Access Specifier
	 * Private Access
	 * Protected Access
	 */
	
	public int a = 100;
	int b = 200; //default	
	private int c = 300;
	
	
	public void doThisPublic() {
		System.out.println("Public Method");
	}
	
	private void doThisPrivate() {
		System.out.println("Private Method");
	}
	
	void doThisDefault() {
		System.out.println("Default Method");
	}
	
	
}
