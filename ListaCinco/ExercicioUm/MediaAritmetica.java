public class MediaAritmetica {

    private double numeroUm;
    private double numeroDois;
    
    public void setNumeroUm(double numeroUm){
        this.numeroUm = numeroUm;
    }
        
    public void setNumeroDois(double numeroDois){
            this.numeroDois = numeroDois;
    }
    public double getNumeroUm(){
           return numeroUm;
    }
    public double getNumeroDois(){
        return numeroDois;
    }
    
    public double mediaAritmetica(double a, double b){
        double media = ( a + b ) / 2;
        return media;

    }
    
}
