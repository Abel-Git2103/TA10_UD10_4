/*
 * @autor: Abel Jornet
 * Fecha modificación: 07/02/2021
 */
package objetos;

import javax.swing.JOptionPane;

import excepciones.Excepcion;

public class CompruebaExcepcion {

	public static void EjecucionCorrecta() {
		int signoSeleccionado = 0;

		do {
			try {
				Calculos c1 = new Calculos();
				c1.signo();
				
				if (c1.signoSeleccionado > 8 || c1.signoSeleccionado < 1) {
					throw new Excepcion(1);
				}
				
				c1.realizaCalculos();
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Ha ocurrido un error: no has introducido un valor correcto");

			} catch (Excepcion e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		} while (signoSeleccionado != 8);
	}
}
