/*
 * @autor: Abel Jornet
 * Fecha modificación: 07/02/2021
 */
package excepciones;

@SuppressWarnings("serial")
public class Excepcion extends Exception {

	private int codigoExcepcion;

	public Excepcion(int codigoError) {
		super();
		this.codigoExcepcion = codigoError;
	}

	public Excepcion() {
		super();
	}

	@Override
	public String getMessage() {

		String mensaje = "";

		switch (codigoExcepcion) {
		case 1:
			mensaje = "Ha ocurrido un error: El operador seleccionado no es valido, selecciona una opcion valida del 1-7";
			break;
		}
		return mensaje;
	}

}
