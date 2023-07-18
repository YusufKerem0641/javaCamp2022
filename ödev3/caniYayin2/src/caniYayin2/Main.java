package caniYayin2;

import java.io.Console;

public class Main {

	public static void main(String[] args) {
		CunstructorDeneme cunstructorDeneme = new DenemeC();
		cunstructorDeneme.setFirstName("naber");
		DenemeC f = (DenemeC)cunstructorDeneme;
		f.setCar("ferrari");
		System.out.println(f.getCar());
		System.out.println(cunstructorDeneme.getFirstName());
		
		InterfaceDeneme interfaceDeneme = new DenemeI();
		interfaceDeneme.isiYazdir();
	}

}


