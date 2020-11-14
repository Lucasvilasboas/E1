package mobile;

public interface IHorario {

	boolean ehUltimoSegundo();

	byte getHora();

	void setHora(int hora);

	byte getMinuto();

	void setMinuto(int minuto);

	byte getSegundo();

	void setSegundo(int segundo);

	void incrementaSegundo();

	void incrementaMinuto();

	void incrementaHora();

}