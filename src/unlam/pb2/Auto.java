package unlam.pb2;

import java.util.Objects;

public class Auto extends Vehiculo{
	private String patente;
	private Integer cantidadMaximaDePasajeros;
	private Integer velocidadMaxima;
	private Double latitud;
	private Double longitud;

	public Auto(String patente, Integer cantidadMaximaDePasajeros, Integer velocidadMaxima, Double latitud, Double longitud) {
		this.patente = patente;
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
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

	public Integer getCantidadMaximaDePasajeros() {
		return cantidadMaximaDePasajeros;
	}

	public void setCantidadMaximaDePasajeros(Integer cantidadMaximaDePasajeros) {
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
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
	public int hashCode() {
		return Objects.hash(patente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		return Objects.equals(patente, other.patente);
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
