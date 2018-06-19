
public class Informacion {
	private int elemento;
	private Informacion siguiente;
		
	/**
	 * @param elemento
	 * @param siguiente
	 */
	public Informacion(int elemento) {
		setElemento(elemento);;
		setSiguiente(null);
	}
	public Informacion(int elemento, Informacion siguiente) {
		setElemento(elemento);;
		setSiguiente(siguiente);
	}
	/**
	 * @return the elemento
	 */
	public int getElemento() {
		return elemento;
	}
	/**
	 * @param elemento the elemento to set
	 */
	public void setElemento(int elemento) {
		this.elemento = elemento;
	}
	/**
	 * @return the siguiente
	 */
	public Informacion getSiguiente() {
		return siguiente;
	}
	/**
	 * @param siguiente the siguiente to set
	 */
	public void setSiguiente(Informacion siguiente) {
		this.siguiente = siguiente;
	}
	
	
	
	public void borrar(int elemento) {
		if (this.siguiente != null) {
			if (elemento==this.elemento) {
				if (this.siguiente.getElemento() == elemento) {
					if (this.siguiente.getSiguiente() != null) {
						this.setSiguiente(null);
					}
					this.siguiente.añadir(elemento);
				}
				else setSiguiente(new Informacion(elemento));
			}else this.siguiente.borrar(elemento);
		}
	}
	
	/**
	 * toString
	 */
	public String toString() {
		String p = new String();
		if (this.siguiente != null) p += this.elemento + "  " + this.siguiente.toString();
		else p += this.elemento;
					
		return p;
	}
	
}
