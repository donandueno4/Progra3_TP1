package anticalc;

import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.lang.Math;

public class Formula {
private String formula;
private Integer num,num2;
public ArrayList<String> arreglo = new ArrayList<String>();

public Formula(String label) {
	formula = label; 
	
}
//Convierte el String a valores separados dentro del arreglo

public void toArray() {
	String temp = "";
	for (int i = 0; i < formula.length(); i++) {
		if (esNumero(formula.charAt(i))) {
		temp = temp + formula.charAt(i);
		}
		else {
			arreglo.add(temp);
			temp = "";
			temp = temp + formula.charAt(i);
			arreglo.add(temp);
			temp = "";
		}
	}
	arreglo.add(temp);
	for (int i = 0; i < arreglo.size(); i++) {
		System.out.print("'" + arreglo.get(i) + "' ");
	}

}

public void colocarResultado(int valor, int pos) {
	arreglo.set(pos-1, ""+valor);
	arreglo.remove(pos);
	arreglo.remove(pos);
}
//  funciona!
public boolean esNumero(char numero) {
	return (numero >= 48 && numero <= 57); 
}
//public void reconocer_valores() {
//	Integer.getInteger(meter aca el numero del string)
//}

public int suma(int n1, int n2) {
	return n1 + n2;
}

public int resta(int n1, int n2) {
	return n1 - n2;
}
public int div(int n1, int n2) {
return n1 / n2;
}
public int mult(int n1, int n2) {
	return n1 * n2;
}
public int pot(int n1, int n2) {
	return n1 ^ n2;
}
//public int raiz(int n1, int n2) {
//	return sqrt()
//}
}
