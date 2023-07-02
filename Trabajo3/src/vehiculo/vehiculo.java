package vehiculo;

public class vehiculo { //Aquí creo la clase padre, para luego utilizarlos en la clase hija.
	private String tipoVehiculo;
	private String marca;
	private int anio;
	private String color;
	private int numeroPuertas;
	
	public vehiculo(String tipoVehiculo , String marca, int anio, String color, int numeroPuertas){
		this.tipoVehiculo = tipoVehiculo;
		this.marca = marca;
		this.anio = anio;
		this.color = color;
		this.numeroPuertas = numeroPuertas;
		
	
	}
		public String getTipoVehiculo() {
			return tipoVehiculo;
		}
		public void setTipoVehiculo(String tipoVehiculo) {
			this.tipoVehiculo = tipoVehiculo;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public int getAnio() {
			return anio;
		}
		public void setanio(int anio) {
			this.anio = anio;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getNumeroPuertas() {
			return numeroPuertas;
		}
		public void setNumeroPuertas(int numeroPuertas) {
			this.numeroPuertas = numeroPuertas;
		}
		
		
}
	
	//una vez que ya creamos la clase con su atributo y metodos, los usamos en la 
	//clase hija.
	
	
		
	

	
