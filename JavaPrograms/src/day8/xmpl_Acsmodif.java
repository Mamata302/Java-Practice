package day8;

import day9.Accsmodif1;

public class xmpl_Acsmodif extends Accsmodif1 {

	public static void main(String[] args) {
		
		Accsmodif1 y = new Accsmodif1();
		
		y.pubmethod();
	 // y.primethod();  not accessible
	 // y.protecmethod(); through inheritance only..
	 // y.defmethod();
		
		xmpl_Acsmodif x = new xmpl_Acsmodif();
		
		x.pubmethod();
		x.protecmethod();

	}

}
