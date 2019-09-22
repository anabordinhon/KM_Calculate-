package calculo_km;

import javax.swing.JOptionPane;


public class calculo_km {

	public static void main(String[] args) {
		
		//Necessario criar uma variavel string para transforma-la em double
		float km,litros,total;
		String KM, LITROS;

		
		KM =JOptionPane.showInputDialog("Por gentileza, informe a quantidade de KM:");
		LITROS =JOptionPane.showInputDialog("Por gentileza, informe a quantidade de Litros:");

		km = Float.parseFloat(KM);
		litros = Float.parseFloat(LITROS);
		
		total = (km/litros);
		
		JOptionPane.showMessageDialog(null, "A media de KM rodados foi: " +total);
		

	}

}
