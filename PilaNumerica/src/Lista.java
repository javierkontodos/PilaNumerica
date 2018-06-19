
public class Lista {
	private Informacion primero;
	
	public Lista() {
		this.primero = null;
	}
	
	/**
	 * Funcion de añadir elementos
	 * @param elemento
	 */
	public void añadir(Informacion info) {
		if (info.getElemento()>=this.primero.getElemento()) {
			if (this.primero.getSiguiente() != null) this.añadir();
			else setSiguiente(new Informacion(elemento));
		}else {
			Informacion aux = new Informacion(this.elemento, this.siguiente);
			this.setElemento(elemento);
			this.setSiguiente(aux);
		}
	}
}
