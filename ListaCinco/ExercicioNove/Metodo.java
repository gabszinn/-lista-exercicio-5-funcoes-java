class Metodo {
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public int calcularReverso() {
        int reverso = 0;
        int numero = getNumero();

        while (numero >= 0) {
            int algoritmo = numero % 10;
            numero /= 10;
            reverso = reverso * 10 + algoritmo;

            if (numero == 0) {
                break;
            }
        }

        return reverso;
    }
}