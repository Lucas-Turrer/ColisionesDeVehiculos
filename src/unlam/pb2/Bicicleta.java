package unlam.pb2;

public class Bicicleta extends Vehiculo {
	private Double latitud;
	private Double longitud;

	public Bicicleta(Double latitud, Double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
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
