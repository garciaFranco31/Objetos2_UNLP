public class TopografiaMixta extends Topografia{
    List<Topografia> components;

    public TopografiaMixta(){
        this.components = new ArrayList<Topografia>();
    }

    public void addComponent(Topografia component){
        this.components.add(component);
    }

    public void removeComponent(Topografia component){
        this.components.remove(component);
    }

    public double getProporcionAgua(){
        int totalAgua = this.components.stream()
        .mapToDouble(component -> component.getProporcionAgua())
        .sum();

        return totalAgua / this.components.size(); 
    }

    public boolean isEqual(Agua agua){
        return false;
    }

    public boolean isEqual(Tierra tierra){
        return false;
    }

    public boolean isEqual(TopografiaMixta topografiaMixta){
        Topografia component1;
        Topografia component2;

        for(int i=0; i < this.components.size(); i++){
            component1 = this.components(i);
            component2 = topografiaMixta.components(i);
            if (!component1.isEqual(component2)){
                return false;
            }
        }
        return true;
    }


}