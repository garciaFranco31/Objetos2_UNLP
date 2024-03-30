package ar.edu.info.unlp.ejercicio1;

public class Lagarto implements Jugada{
	@Override
    public String jugarContra(Jugada otraJugada) {
        return otraJugada.jugarContraLagarto();
    }

    @Override
    public String jugarContraPiedra() {
        return "Piedra wins";
    }

    @Override
    public String jugarContraPapel() {
       return "Lagarto wins";
    }

    @Override
    public String jugarContraTijera() {
        return "Tijera wins";
    }

    @Override
    public String jugarContraLagarto() {
        return "Draw";
    }

    @Override
    public String jugarContraSpock() {
        return "Lagarto wins";
    }
}
