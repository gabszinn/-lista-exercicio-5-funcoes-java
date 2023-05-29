class Metodo {
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public char verificarNumero() {
        if (getNumero() > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }
}