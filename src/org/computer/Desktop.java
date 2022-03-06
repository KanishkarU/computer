package org.computer;
//single inheritance
public class Desktop  extends Computer   {
	//child class
	public void desktopSize() {
		// TODO Auto-generated method stub
		System.out.println("512GD SSD");
   computerModel();
	}
	public static void main(String[] args) {
		Desktop a = new Desktop();
		
		a.desktopSize();
		

	}

}
