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
}