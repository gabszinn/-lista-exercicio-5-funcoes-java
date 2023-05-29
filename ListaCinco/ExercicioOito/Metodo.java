class Metodo {
    private float custo;
    private float taxaImposto;

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public float getCusto() {
        return custo;
    }

    public void setTaxaImposto(float taxaImposto) {
        this.taxaImposto = taxaImposto;
    }

    public float getTaxaImposto() {
        return taxaImposto;
    }

    public float somaImposto() {
        return ((getTaxaImposto() / 100) + 1) * getCusto();
    }
}