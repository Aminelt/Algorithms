/* Maitenant on doit creer un objet 5 Graphe and et implementer l'algorithme de Dijkstra*/

import java.util.ArrayList;

public class Graphe {

    private Sommet[] sommets;

    private int nbSommets;
    private Arc[] arcs;

    private int nbArcs;

    public Graphe(Arc[] arcs) {
        this.arcs = arcs;

// creer tous les sommets prets a etre mis-à jour par les arcs

        this.nbSommets = calculerNbSommet(arcs);
        this.sommets = new Sommet[this.nbSommets];

        for (int n = 0; n < this.nbSommets; n++) {
            this.sommets[n] = new Sommet();

        }

/*ajouter tous les arcs aux sommets, chaque arc va etre ajouter a deux sommets

(de && vers)

                */
        this.nbArcs = arcs.length;

        for (int arcAAjouter = 0; arcAAjouter < this.nbArcs; arcAAjouter++) {
            this.sommets[arcs[arcAAjouter].getDeIndexDuSommet()].getArcs().add(arcs[arcAAjouter]);
            this.sommets[arcs[arcAAjouter].getVersIndexDuSommet()].getArcs().add(arcs[arcAAjouter]);

        }
    }

    private int calculerNbSommet(Arc[] arcs) {

        int nbSommet = 0;

        for (Arc e : arcs) {

            if (e.getVersIndexDuSommet() > nbSommet)
                nbSommet = e.getVersIndexDuSommet();
            if (e.getDeIndexDuSommet() > nbSommet)
                nbSommet = e.getVersIndexDuSommet();

        }

        nbSommet++;

        return nbSommet;

    }

    public void calculerPlusCourtChemin() {
        // sommet 0 comme source

        //this.sommets[0].setDistanceDeLaSource(0);
        this.sommets[0].setDistanceDeLaSource(0);
        int nextSommet = 0;

// visiter tous les sommets
        for (int i = 0; i < this.sommets.length; i++) {

// boucle autour les arcs du sommet courant

            ArrayList<Arc> arcsDuSommetCourant = this.sommets[nextSommet].getArcs();
            for (int arcAffecte = 0; arcAffecte < arcsDuSommetCourant.size(); arcAffecte++) {

                int indexSuccesseur = arcsDuSommetCourant.get(arcAffecte).getIndexSuccesseur(nextSommet);

// !!Seulement s'il n'est pas visité

                if (!this.sommets[indexSuccesseur].estVisite()) {
                    int tentative = this.sommets[nextSommet].getDistanceDeLaSource() + arcsDuSommetCourant.get(arcAffecte).getValuation();

                    if (tentative < sommets[indexSuccesseur].getDistanceDeLaSource()) {
                        sommets[indexSuccesseur].setDistanceDeLaSource(tentative);

                    }

                }

            }

// tous les successeurs sont verifiés alors le sommet est visite
            sommets[nextSommet].setVisite(true);

// le sommet suivant doit avoir la plus courte distance

            nextSommet = getPluscourtcheminDuSommet();

        }
    }

// Maintenant o va implementer la methode PluscourtcheminDuSommet ()

    private int getPluscourtcheminDuSommet() {
        int indexSommetStocke = 0;

        int DistanceStockee = Integer.MAX_VALUE;

        for (int i = 0; i < this.sommets.length; i++) {
            int currentDist = this.sommets[i].getDistanceDeLaSource();

            if (!this.sommets[i].estVisite() && currentDist < DistanceStockee) {
                DistanceStockee = currentDist;

                indexSommetStocke = i;

            }


        }
        return indexSommetStocke;
    }

    // Affichage de resultats

    public void afficherResultat() {

        String sortie = "le nombre de Sommets ="+ this.nbSommets;
        sortie += "\n le nombre des arcs = " + this.nbArcs;

        for (int i = 0; i < this.sommets.length; i++) {

            sortie += ("\nLe plus court chemin du sommet 0 vers le sommet " + i + " est " + sommets[i].getDistanceDeLaSource());
        }
            System.out.println(sortie);



        }

        public Sommet [] getSommet() { return sommets; }

        public int getnbSommets() { return nbSommets; }

        public Arc[] getArcs() { return arcs;

        }

        public int getNbArcs() { return nbArcs;

        }
}