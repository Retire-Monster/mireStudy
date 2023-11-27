package project_a.main;

public class Calculator_Main {
	public static void main(String[] args) {

		UserInterfaceVO uif = new UserInterfaceVO();

		uif.bar();
		uif.start();
		uif.bar();
		uif.inputWait();

		uif.userStartOrder();
		uif.userReStartOrder();

	}

}
