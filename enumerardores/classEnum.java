package enumerardores;

public enum classEnum {
	AMERICA(33, "el continente"),
	EUROPA(44, "ejemplo de nombre"),
	AFRICA(55, "otro ejemplo");

	private final int paises;
	private final String nombre;

	classEnum(int paises, String nombre) {
		this.nombre = nombre;
		this.paises = paises;
	}

	public int getPaises() {
		return this.paises;
	}

	public String getNombre() {
		return this.nombre;
	}

}