/*
 * @autor: Abel Jornet
 * Fecha modificación: 07/02/2021
 */
package objetos;

import javax.swing.JOptionPane;

public class Calculos {

	int signoSeleccionado;
	
	public void signo() {
		signoSeleccionado = Integer.parseInt(JOptionPane.showInputDialog(
				"¿Que deseas realizar? \n1-Suma \n2-Resta \n3-Multiplicacion \n4-Potencia \n5-Raiz cuadrada \n6-Raiz cubica \n7-Division \n8-Salir"));
	} 

	public void realizaCalculos() {
		if (signoSeleccionado == 8) {
			System.exit(signoSeleccionado);
		} else {
			double valorA = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor A"));
			double valorB = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor B"));
			switch (signoSeleccionado) {
			case 1:
				JOptionPane.showMessageDialog(null, "resultado de A + B es = " + (valorA + valorB));
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "El resultado de A - B es = " + (valorA - valorB));
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "El resultado de A * B es = " + (valorA * valorB));
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "El resultado de A ^ B es = " + (Math.pow(valorA, valorB)));
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "La raiz cuadrada de A es = " + Math.sqrt(valorA));
				JOptionPane.showMessageDialog(null, "La raiz cuadrada de B es = " + Math.sqrt(valorB));
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "La raiz cubica de A es = " + Math.cbrt(valorA));
				JOptionPane.showMessageDialog(null, "La raiz cubica de B es = " + Math.cbrt(valorB));
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "El resultado de A / B es = " + (valorA / valorB));
				break;
			}
		}
	}
}
