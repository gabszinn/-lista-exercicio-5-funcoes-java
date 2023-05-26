
    public class Medias {
        private double valor1;
        private double valor2;
        private double valor3;
    
        public void setValor1(double valor1) {
            this.valor1 = valor1;
        }
    
        public void setValor2(double valor2) {
            this.valor2 = valor2;
        }
    
        public void setValor3(double valor3) {
            this.valor3 = valor3;
        }
    
        public double getValor1() {
            return valor1;
        }
    
        public double getValor2() {
            return valor2;
        }
    
        public double getValor3() {
            return valor3;
        }
    
        public void setValores(double valor1, double valor2, double valor3) {
            setValor1(valor1);
            setValor2(valor2);
            setValor3(valor3);
        }
    
        public double calcularMediaAritmetica() {
            return (getValor1() + getValor2() + getValor3()) / 3;
        }
    
        public double calcularMediaHarmonica() {
            return 3 / ((1 / getValor1()) + (1 / getValor2()) + (1 / getValor3()));
        }
    
        public double calcularMediaGeometrica() {
            return Math.pow((getValor1() * getValor2() * getValor3()), 1.0 / 3.0);
        }
    }
    


