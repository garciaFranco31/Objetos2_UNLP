package ar.edu.info.unlp.ejercicio1;

public class Spock implements Jugada{
	 @Override
	    public String jugarContra(Jugada otraJugada) {
	        return otraJugada.jugarContraSpock();
	    }

	    @Override
	    public String jugarContraPiedra() {
	        return "Spock wins";
	    }

	    @Override
	    public String jugarContraPapel() {
	       return "Papel wins";
	    }

	    @Override
	    public String jugarContraTijera() {
	        return "Spock wins";
	    }

	    @Override
	    public String jugarContraLagarto() {
	        return "Lagarto wins";
	    }

	    @Override
	    public String jugarContraSpock() {
	        return "Draw";
	    }
}
