package ar.edu.info.unlp.ejercicio6;

public class Agua extends Topografia{

    public Agua(){

    }

    public double getProporcionAgua(){
        return 1;
    }

    public boolean isEqual(Agua agua){
        return true;
    }

    public boolean isEqual(Tierra tierra){
        return false;
    }

    public boolean isEqual(Topografia otraTopografia){
        return otraTopografia.isEqual(this);
    }

    @Override
    public boolean isEqual(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEqual'");
    }

    @Override
    public boolean isEqual(TopografiaMixta mixta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEqual'");
    }
}