public class PlusCourtChemin {
    public static void main(String[] args) {

        Arc[] arcs = {

                new Arc(0, 2, 1),

                new Arc(0, 3, 4),
                new Arc(0, 4, 2),

                new Arc(0, 1, 3),
                new Arc(1, 3, 2),

                new Arc(1, 4, 3),

                new Arc(1, 5, 1),
                new Arc(2, 4, 1),

                new Arc(3, 5, 4),
                new Arc(4, 5, 2),
                new Arc(4, 6, 7),
                new Arc(4, 7, 2),
                new Arc(5, 6, 4),
                new Arc(6, 7, 5)

        };

                Graphe g = new Graphe (arcs);
                g.calculerPlusCourtChemin();

                 g.afficherResultat();



            }

    }

