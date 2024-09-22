public class Polynomial{
    //field representing coefficients
    double[] coefficients;
        
    //no argument constructor
    public Polynomial(){
       //array of size 1
       coefficients = new double[1];
        //sets polynomial to zero
       coefficients[0] = 0;
    }
    //with argument constructor
    public Polynomial(double[] coefficients){ // reference = C pointer type
        this.coefficients = new double[coefficients.length];

        for (int i = 0; i < coefficients.length; i++) {
            this.coefficients[i] = coefficients[i];
        }
    }
    
    
    public Polynomial add(Polynomial polynomial) {
        if (polynomial == null) {
            return new Polynomial(this.coefficients);
        }

        double[] coefficients = this.coefficients;
        double[] shorterCoefficients = polynomial.coefficients;
        if(this.coefficients.length < polynomial.coefficients.length){
            coefficients = polynomial.coefficients;
            shorterCoefficients = this.coefficients;
        }
        
        double[] newCoefficient = new double[coefficients.length];
        int i = 0;
        for(; i < shorterCoefficients.length; i++){
           newCoefficient[i] = shorterCoefficients[i] + coefficients[i];
        }
        for( ;i < coefficients.length; i++){
            newCoefficient[i] = coefficients[i];
        }
        
        return new Polynomial(newCoefficient);
    }

    public double evaluate(double value){
        if (value == 0){
            return coefficients[0];
        }
        
        double total = 0;
        for(int i = 0; i < coefficients.length;i++){
            total += coefficients[i] * Math.pow(value,i);
        }
        return total;
    }
    public boolean hasRoot(double value){
        if(evaluate(value) == 0){
            return true;
        }
        return false;
    }
}
