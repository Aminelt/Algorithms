import java.util.ArrayList;

public class Sommet {
    private int distanceDeLaSource = Integer.MAX_VALUE;
    private boolean visite =false;

    private ArrayList<Arc> arcs = new ArrayList<Arc>(); //Maitenant

public int getDistanceDeLaSource() {
    return distanceDeLaSource;
        }

public void setDistanceDeLaSource(int distanceDeLaSource) {
    this.distanceDeLaSource = distanceDeLaSource;
}



public boolean estVisite() {

    return visite;
}

public void setVisite(boolean visite){

        this.visite = visite;
    }

public ArrayList<Arc> getArcs(){

        return arcs;

        }

public void setArcs (ArrayList<Arc> arcs) {
    this.arcs =arcs;

        }}