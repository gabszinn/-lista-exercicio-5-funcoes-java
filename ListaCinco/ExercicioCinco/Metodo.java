class Metodo {
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void imprimirPadrao() {
        for (int i = 1; i <= getNumero(); i++) {
            imprimirLinha(i);
            System.out.println();
        }
    }

    private void imprimirLinha(int valor) {
        for (int i = 1; i <= valor; i++) {
            System.out.print(valor + " ");
        }
    }
}