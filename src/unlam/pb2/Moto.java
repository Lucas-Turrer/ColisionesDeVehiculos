package unlam.pb2;

public class Moto extends Vehiculo{
	private String patente;
	private Integer CAPACIDA_MAXIMA_DE_PASAJEROS = 2;
	private Integer velocidadMaxima;
	private Double latitud;
	private Double longitud;

	public Moto(String patente, Integer velocidadMaxima, Double latitud, Double longitud) {
		this.patente = patente;
		this.velocidadMaxima = velocidadMaxima;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getCAPACIDA_MAXIMA_DE_PASAJEROS() {
		return CAPACIDA_MAXIMA_DE_PASAJEROS;
	}

	public void setCAPACIDA_MAXIMA_DE_PASAJEROS(Integer cAPACIDA_MAXIMA_DE_PASAJEROS) {
		CAPACIDA_MAXIMA_DE_PASAJEROS = cAPACIDA_MAXIMA_DE_PASAJEROS;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	@Override
	public void actualizarCoordenadas(Double longitudNueva, Double latitudNueva) {
		longitud = longitudNueva;
		latitud = latitudNueva;
	}

	@Override
	public Double latitudActual() {
		return latitud;
	}

	@Override
	public Double longitudActual() {
		return longitud;
	}

}
