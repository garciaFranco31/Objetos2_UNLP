package ar.edu.info.unlp.ejercicio1;

public class Tijera implements Jugada{
	 @Override
	    public String jugarContra(Jugada otraJugada) {
	        return otraJugada.jugarContraTijera();
	    }

	    @Override
	    public String jugarContraPiedra() {
	        return "Piedra wins";
	    }

	    @Override
	    public String jugarContraPapel() {
	       return "Papel wins";
	    }

	    @Override
	    public String jugarContraTijera() {
	        return "Draw";
	    }

	    @Override
	    public String jugarContraLagarto() {
	        return "Tijera wins";
	    }

	    @Override
	    public String jugarContraSpock() {
	        return "Spock wins";
	    }
}
