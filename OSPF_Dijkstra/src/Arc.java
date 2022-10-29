public class Arc {

    private int deIndexDuSommet;
    private int versIndexDuSommet;

    private int valuation;

    public Arc (int deIndexDuSommet, int versIndexDuSommet, int valuation) { this.deIndexDuSommet =deIndexDuSommet;

        this.versIndexDuSommet =versIndexDuSommet;

        this.valuation = valuation;

    }

    public int getDeIndexDuSommet() {

            return deIndexDuSommet;

}

    public int getVersIndexDuSommet() {

        return versIndexDuSommet;

    }

    public int getValuation() {

        return valuation;

    }

    /* determine le sommet successeur du sommet supplémentaire, en se basant sur les deux noeuds connectes par cet arc*/
    public int getIndexSuccesseur (int indexSommet) {

        if (this.deIndexDuSommet ==indexSommet) {
            return this.versIndexDuSommet;

        } else {

            return this.deIndexDuSommet;

        }}}