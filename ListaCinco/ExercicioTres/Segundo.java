public class Segundo {
    private double grausF;

    public double getGrausF(){
    return grausF;
    }
    public void setGrausF(double grausF){
        this.grausF = grausF;
    }
    public double calcular(double num1){
    double calculo = (num1-32) / 1.8;
    return calculo;

    }
    
}
