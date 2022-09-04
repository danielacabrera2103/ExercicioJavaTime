public class Time {
	private int hora;
	private int minuto;
	private int segundo;

	public Time(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public Time(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = 0;
	}

	public Time(int hora) {
		this.hora = hora;
		this.minuto = 0;
		this.segundo = 0;
	}

	public void setTime(int hora, int minuto, int segundo) {
		this.hora = ((hora >= 0 && hora < 24) ? hora : 0);
		this.minuto = ((minuto >= 0 && minuto < 60) ? minuto : 0);
		this.segundo = ((segundo >= 0 && segundo < 60) ? segundo : 0); 
	}

	public String retornaHoraUniversal() {
		return String.format("%02d:%02d:%02d", hora, minuto, segundo);
	}

	public String retornaDataPadrao() {
		return String.format("%d:%02d:%02d %s", ((hora == 0 || hora == 12) ? 12 : hora % 12), minuto, segundo,
				(hora < 12 ? "AM" : "PM"));
	}
}
