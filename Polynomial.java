import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Polynomial {
    public double[] Coefficients;
    public int[] exponents;
    public int numCoefficient;

    //default constructor
    public Polynomial(){
        //array of size 1
        Coefficients = new double[1];
         //sets polynomial to zero
        Coefficients[0] = 0.0;
        exponents = new int[1];
        exponents[0] = 0;
    }

    //with argument constructor
    public Polynomial(double[] coeff, int[] exp){ 
         this.Coefficients = coeff.clone();
         this.exponents = exp.clone();
    }


    //simplify to needed exponents
    public int[] appendPolyExponents(int [] ex1 ,int [] ex2){
        int len = ex1.length + ex2.length;
        int index = 0;
        int [] temp = new int[len];
        for(int i = 0;i < ex1.length; i++){
            boolean isDuplicate = false;
            for(int k = 0;k < index; k++){
                if(temp[k] == ex1[i]){
                    isDuplicate =true;
                    break;
                }
            }
            if(!isDuplicate){
                temp[index++] = ex1[i];
            }
        }
        for(int j = 0;j < ex2.length; j++){
            boolean isDuplicate = false;
            for(int k = 0;k < index; k++){
                if(temp[k] == ex2[j]){
                    isDuplicate =true;
                    break;
                }
            }
            if(!isDuplicate){
                temp[index++] = ex2[j];
            }
        }

        numCoefficient = index;
        return removeAllZeros(temp);
    }

    //method to remove all zeros
    public int[] removeAllZeros(int [] temp){
        int [] newArray = new int[numCoefficient];
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = temp[i];
        }
        return newArray;
    }
    public double[] removeAllZeros(double [] temp){
        double [] newArray = new double[numCoefficient];
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = temp[i];
        }
        return newArray;
    }
    public void swapCoefficient(Polynomial polynomial, int index1, int index2){
        double temp = polynomial.Coefficients[index1];
        polynomial.Coefficients[index1] = polynomial.Coefficients[index2];
        polynomial.Coefficients[index2] = temp;
    }
    public void swapExponent(Polynomial polynomial, int index1, int index2){
        int temp = polynomial.exponents[index1];
        polynomial.exponents[index1] = polynomial.exponents[index2];
        polynomial.exponents[index2] = temp;
    }
    public void sortAscendingCoeffandExponents(Polynomial polynomial){
        for(int i = 0; i < polynomial.exponents.length; i++){
            for (int j = i + 1 ;j < polynomial.exponents.length; j++){
                if(polynomial.exponents[i] > polynomial.exponents[j]){
                    swapCoefficient(polynomial, i, j);
                    swapExponent(polynomial, i, j);
                }
            }
        }
    }
    
    public Polynomial add(Polynomial polynomial){
        if (polynomial == null) {
            return new Polynomial(this.Coefficients,this.exponents);
        }
        //Make both polynomials in ascending order
        polynomial.sortAscendingCoeffandExponents(polynomial);
        this.sortAscendingCoeffandExponents(this);

        //Combine the two exponents of arrays to remove duplicates
        int [] newExponents = appendPolyExponents(this.exponents, polynomial.exponents);
        double [] newCoefficient = new double [numCoefficient];

        //Add the coefficients together
        int i,j,index;
        i = j = index = 0;
        while (i < this.Coefficients.length && j < polynomial.Coefficients.length) {
            //Add the coefficients that match
            if (this.exponents[i] == polynomial.exponents[j]) {
                // Same exponent, add coefficients
                newCoefficient[index] = this.Coefficients[i] + polynomial.Coefficients[j];
                newExponents[index] = this.exponents[i];
                index++;
                i++;
                j++;
            //Add the coefficients that goes before it as it is lower
            } else if (this.exponents[i] < polynomial.exponents[j]) {
                // Current exponent of this polynomial is less, take from this
                newCoefficient[index] = this.Coefficients[i];
                newExponents[index] = this.exponents[i];
                index++;
                i++;
            } 
            else {
                newCoefficient[index] = polynomial.Coefficients[j];
                newExponents[index] = polynomial.exponents[j];
                index++;
                j++;
            }
        }
        //add the remaining coefficients
        while (i < this.Coefficients.length) {
            newCoefficient[index] = this.Coefficients[i];
            newExponents[index] = this.exponents[i];
            index++;
            i++;
        }
        while (j < polynomial.Coefficients.length) {
            newCoefficient[index] = polynomial.Coefficients[j];
            newExponents[index] = polynomial.exponents[j];
            index++;
            j++;
        }
        
        return new Polynomial(newCoefficient,newExponents);
    }

    public double evaluate(double value){
        if (value == 0){
            return Coefficients[0];
        }
        //Edge cases: In case of 1 being a root of 0
        if(Coefficients.length == 1 && exponents.length == 1){
            if(Coefficients[0] == 0 && exponents[0] == 0){
                return 0;
            }
        }
        //Other cases
        double total = 0.0;
        for(int i = 0; i < Coefficients.length ;i++){
            total += Coefficients[i] * Math.pow(value,exponents[i]);
        }
        return total;
    }

    //has root method
    public boolean hasRoot(double value){
        return evaluate(value) == 0;
    }

    public boolean multiplybyZero(Polynomial polynomial){
        int numofZeros = 0;
        for(int i = 0; i < polynomial.Coefficients.length; i++ ){
            if(polynomial.Coefficients[i] == 0){
                numofZeros++;
            }
            if(numofZeros == polynomial.Coefficients.length){
                return true;
            }
        }
        return false;
    }

    public Polynomial multiply(Polynomial polynomial){
        //Edge case: Multiply by 0 only
        if(multiplybyZero(polynomial)|| multiplybyZero(this)){
            return new Polynomial();
        }

        //Edge case: Multiply by 1
        if(polynomial.Coefficients.length == 1 && polynomial.exponents.length ==1 ){
            if(polynomial.Coefficients[0] == 1 && polynomial.exponents[0] == 0){
                return new Polynomial(this.Coefficients,this.exponents);
            }
        }
        
        int len1 = polynomial.Coefficients.length;
        int len2 = this.Coefficients.length;
        Polynomial result = new Polynomial();
        for(int i = 0;i < len1 ;i++){
            for(int j=0; j < len2; j++){
                double [] newCoeff = new double[1];
                int [] newExp = new int[1];
                newCoeff[0] = polynomial.Coefficients[i]*this.Coefficients[j];  
                newExp[0] = polynomial.exponents[i] + this.exponents[j];
                Polynomial value = new Polynomial(newCoeff,newExp);
                result = result.add(value);
            }
        }
      
        return result.simplifyPolynomial(result);
    }

    public Polynomial simplifyPolynomial(Polynomial polynomial){
        int len = polynomial.Coefficients.length;
        int i = 0;
        
        while(i < len){
            if(polynomial.Coefficients[i] == 0 && polynomial.exponents[i] == 0){
                int j = i + 1;
                while(j < len && polynomial.Coefficients[j] == 0 && polynomial.exponents[j] == 0){
                    j++;
                }
                if(j < len && (polynomial.Coefficients[j] != 0 || polynomial.exponents[j] != 0)){
                    swapCoefficient(polynomial, i, j);
                    swapExponent(polynomial, i, j);
                }
            }
            i++;
        }
        numCoefficient = 0;
        for (int j = 0; j < len; j++) {
            if (polynomial.Coefficients[j] != 0 || polynomial.exponents[j] != 0) {
                numCoefficient++;
            }
        }

        double[] newCoefficient = removeAllZeros(polynomial.Coefficients);
        int[] newExponent = removeAllZeros(polynomial.exponents);

        return new Polynomial(newCoefficient,newExponent);
    }
    private void simplifyPolynomial(){
        int len = this.Coefficients.length;
        int i = 0;
        
        while(i < len){
            if(this.Coefficients[i] == 0 && this.exponents[i] == 0){
                int j = i + 1;
                while(j < len && this.Coefficients[j] == 0 && this.exponents[j] == 0){
                    j++;
                }
                if(j < len && (this.Coefficients[j] != 0 || this.exponents[j] != 0)){
                    swapCoefficient(this, i, j);
                    swapExponent(this, i, j);
                }
            }
            i++;
        }
        numCoefficient = 0;
        for (int j = 0; j < len; j++) {
            if (this.Coefficients[j] != 0 || this.exponents[j] != 0) {
                numCoefficient++;
            }
        }

        double[] newCoefficient = removeAllZeros(this.Coefficients);
        int[] newExponent = removeAllZeros(this.exponents);

        this.Coefficients = newCoefficient;
        this.exponents = newExponent;
    }
    //construct type file
    public Polynomial(File file){
        String input = readInput(file);
        
        //First separate the components by the + and - sign
        String[] terms = input.split("(?=[+-])");
        
        int len = terms.length;
        double [] newCoefficients = new double[len];
        int [] newExponents = new int[len];
        
        int index = 0;
        
        for(String term : terms) {
            double coefficient;
            int exponent;

            if(term.contains("x")){
                String [] poly = term.split("x");
                
            	//Case that it contains a value coefficient
                if(!poly[0].isEmpty()){
                	try {
                		coefficient = Double.parseDouble(poly[0]);
                		
                	}
                	catch(NumberFormatException e) {
                		if (term.startsWith("-")) {
                            coefficient = -1.0;
                        } else {
                            coefficient = 1.0; // Handle "+x" or "x"
                        }
                	}
                }
                else {
                	coefficient = 1.0;
                }
                //case that it is 2x and sanity check
                if(poly.length > 1 && !poly[1].isEmpty()){
                	try {
                		exponent = Integer.parseInt(poly[1]);
                	}
                	catch(NumberFormatException e) {
                		exponent = 0;
                	}
                    
                }
                else {
                	exponent = 1;
                }
            }
            else{
                coefficient = Double.parseDouble(term);
                exponent = 0;
            }
            newCoefficients[index] = coefficient;
            newExponents[index] = exponent;
            index++;
        }
        this.Coefficients = newCoefficients.clone();
        this.exponents = newExponents.clone();
        this.simplifyPolynomial();
    }

    private String readInput(File file){
    	//Source: geeksforgeeks Method 3: Using File.readAllBytes() method
    		//Note: It was technical and had to rely on internet sources
    	String str = "";
    	//Extra: Sanity check
    	if(!file.exists()) {
    		System.out.println("File does not exist");
    		return str;
    	}
    	try {
    		str = Files.readAllLines(Paths.get(file.getPath())).get(0);
    	}
    	catch(IOException e) {
            System.err.println("Error of file" +e.getMessage());
    	}
    	return str;
    }

    public void saveToFile (String filename){
    	//Source: File Input/Output - Its Way Easier than you Think (Coding with John)
    		//Note: It was technical and had to watch youtube video for this
    	try {
    		BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
    		Polynomial simplifiedPoly = this.combineandRemoveDuplicates(this);
    		String polyString = simplifiedPoly.convertPolynomialtoString();
    		writer.write(polyString);
    		writer.close();
    	}
    	catch(IOException e) {
    		System.err.println("Error saving to file: " + e.getMessage());
        }
    }
    private boolean allZeroCoefficients(double[] Coefficients) {
    	int num = 0;
    	for(int i = 0;i < this.Coefficients.length; i++) {
    		if(Coefficients[i] == 0) {
    			num++;
    		}
    		if(num == Coefficients.length) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public Polynomial combineandRemoveDuplicates(Polynomial poly) {

        // make the exponents in ascending order 
        poly.sortAscendingCoeffandExponents(poly);

        // create a new array for exponents and coefficients respectively
        int[] newExponents = new int[poly.exponents.length];
        double[] newCoefficients = new double[poly.Coefficients.length];
 
        int index = 0;      

        // Go over all the polynomial coefficients
        for (int i = 0; i < poly.Coefficients.length; i++) {
            if (poly.Coefficients[i] == 0) {
                continue; 
            }

            // Add all the coefficients and exponents that are non-zero
            newCoefficients[index] = poly.Coefficients[i];
            newExponents[index] = poly.exponents[i];

            // Simplify the similar terms
            int j = i + 1;
            while (j < poly.Coefficients.length && poly.exponents[i] == poly.exponents[j]) {
                newCoefficients[index] += poly.Coefficients[j]; // Add coefficients
                j++;
            }

            // If not zero combined term, then store it
            if (newCoefficients[index] != 0) {
                index++; // Move to the next position in the new arrays
            }
            i = j - 1; 
        }
        if(index == 0) {
        	return new Polynomial();
        }

        // Resizing the arrays based on the needed size
        double[] finalCoefficients = new double[index];
        int[] finalExponents = new int[index];

        System.arraycopy(newCoefficients, 0, finalCoefficients, 0, index);
        System.arraycopy(newExponents, 0, finalExponents, 0, index);
        
        return new Polynomial(finalCoefficients, finalExponents);
    }
    
    public String convertPolynomialtoString() {
    	int len = this.Coefficients.length;
    	
    	StringBuilder result = new StringBuilder();
    	//Edge case: <Piazza> if all 0+0+0
    	if(allZeroCoefficients(this.Coefficients)) {
			return "0";
		
		}
    	//To provide the user with the simplified form of the string
    	this.combineandRemoveDuplicates(this);
    	
    	boolean isFirstTerm = true;
    	//Traverse through the polynomial's coefficient and exponent 
    	for(int i = 0;i < len; i++) {
    		//Edge case: <Piazza> if the middle term or first term is zero, skip
    		if(this.Coefficients[i] == 0) {
    			continue;
    		}
    		String coefficientStr;
    		//Edge case: <Piazza> check if it is a decimal or integer coefficient
    		if(this.Coefficients[i] == Math.floor(this.Coefficients[i])) {
    			coefficientStr = String.valueOf((int)this.Coefficients[i]);
    		}
    		else {
    			coefficientStr = String.valueOf(this.Coefficients[i]);
    		}
    		//when it is just constant term
    		if(this.exponents[i] == 0) {
    			if(!isFirstTerm && this.Coefficients[i] > 0) {
    				result.append("+");
    			}
    			result.append(coefficientStr);
    		}
    		//if x term. To solve the problem of having +1x and not x
    		else if(this.exponents[i] == 1) {
    			if(coefficientStr.equals("1")) {
    				if(!isFirstTerm && this.Coefficients[i] > 0) {
    					result.append("+");
    				}	
    				result.append("x");
    			}
    			else if(coefficientStr.equals("-1")){
    				result.append("-x");
    			}
    			else {
    				if(!isFirstTerm && this.Coefficients[i] > 0) {
    					result.append("+");
    				}
    				result.append(coefficientStr).append("x");
    				
    			}
    		}
    		//for x raised to higher power 
    		else {
    			if(coefficientStr.equals("1")){
    				if(!isFirstTerm && this.Coefficients[i] > 0) {
    					result.append("+");
    				}	
    				result.append("x").append(String.valueOf(this.exponents[i]));
    			}
    			else if(coefficientStr.equals("-1")){
    				result.append("-x").append(String.valueOf(this.exponents[i]));
    			}
    			else {
    				if(!isFirstTerm && this.Coefficients[i] > 0) {
    					result.append("+");
    				}
    				result.append(coefficientStr).append("x").append(String.valueOf(this.exponents[i]));
    			}
    		}
    		isFirstTerm = false;
    	}
    	return result.toString();
    }
}
