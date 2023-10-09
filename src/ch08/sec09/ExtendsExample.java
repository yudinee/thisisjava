package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {

		InterfaceCImple impl = new InterfaceCImple();
		
		InterfaceA ia = impl;
		ia.methodA();
		//ia.methodB();
		System.out.println();
		
		InterfaceB ib = impl;
		//ib.methodA();
		ib.methodB();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
