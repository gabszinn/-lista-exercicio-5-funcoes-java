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
        int temp = getNumero();

        while (temp >= 0) {
            int algarismo = temp % 10;
            temp /= 10;
            reverso = reverso * 10 + algarismo;

            if (temp == 0) {
                break;
            }
        }

        return reverso;
    }
}