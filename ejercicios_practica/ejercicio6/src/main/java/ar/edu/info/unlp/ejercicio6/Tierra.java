public class Tierra extends Topografia{

    public Tierra(){

    }

    public double getProporcionAgua(){
        return 0;
    }

    public boolean isEqual(Tierra tierra){
        return true;
    }

    public boolean isEqual(Agua agua){
        return false;
    }

    public boolean isEqual(Topografia otraTopografia){
        return otraTopografia.isEqual(true);
    }

}