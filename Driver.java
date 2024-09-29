import java.io.File;
public class Driver {
    public static void testDefaultConstructor(){
        Polynomial p1 = new Polynomial();
        System.out.println("Default Constructor Test");
        if(p1.evaluate(3) == 0 && p1.Coefficients[0] == 0 && p1.exponents[0] == 0){
            System.out.println("    Passed testDefaultConstructor");
        }
        else{
            System.out.println("    Failed testDefault Constructor");
        }
    }
    public static void testArgumentConstructor1(){
        double [] coefficient = {3,2,1,4};
        int [] exponent = {1,3,0,5};
        Polynomial p1 = new Polynomial(coefficient, exponent);
        System.out.println("Argument Constructor Test#1");
        if(p1.evaluate(3) == 1036){
            System.out.println("    Passed testArgumentConstructor1");
        }
        else{
            System.out.println("    Failed testDefault Constructor1");
        }
    }
    public static void testArgumentConstructor2(){
        double [] coefficient = {3,2,3,4};
        int [] exponent = {2,3,4,5};
        Polynomial p1 = new Polynomial(coefficient, exponent);
        System.out.println("Argument Constructor Test#2");
        if(p1.evaluate(3) == 1296){
            System.out.println("    Passed testArgumentConstructor2");
        }
        else{
            System.out.println("    Failed testDefault Constructor2");
        }
    }
    public static void testArgumentConstructor3(){
        double [] coefficient = {3,2,1,4};
        int [] exponent = {1,3,0,5};
        Polynomial p1 = new Polynomial(coefficient, exponent);
        System.out.println("Argument Constructor Test #3");
        if(p1.evaluate(3) == 1036){
            System.out.println("    Passed testArgumentConstructor3");
        }
        else{
            System.out.println("    Failed testDefault Constructor3");
        }
    }
    public static void testArgumentConstructor4(){
        double [] coefficient = {0, 0, 0};
        int [] exponent = {1, 2, 3};
        Polynomial p1 = new Polynomial(coefficient, exponent);
        System.out.println("Argument Constructor Test #4 - All Coefficients Zero");
        if(p1.evaluate(3) == 0){
            System.out.println("    Passed testArgumentConstructor4");
        }
        else{
            System.out.println("    Failed testArgumentConstructor4");
        }
    }
    public static void testArgumentConstructor5(){
        double [] coefficient = {2, 3, 4};
        int [] exponent = {2, 2, 2};  // Same exponent for all terms
        Polynomial p1 = new Polynomial(coefficient, exponent);
        System.out.println("Argument Constructor Test #5 - Same Exponent");
        if(p1.evaluate(3) == (2 + 3 + 4) * Math.pow(3, 2)){
            System.out.println("    Passed testArgumentConstructor5");
        }
        else{
            System.out.println("    Failed testArgumentConstructor5");
        }
    }
    public static void testArgumentConstructor6(){
        double [] coefficient = {1, 2, 3};
        int [] exponent = {-1, 0, 1};  // Negative exponent included
        Polynomial p1 = new Polynomial(coefficient, exponent);
        System.out.println("Argument Constructor Test #6 - Negative Exponents");
        if(p1.evaluate(2) == (1/2.0 + 2 + 3*2)){
            System.out.println("    Passed testArgumentConstructor6");
        }
        else{
            System.out.println("    Failed testArgumentConstructor6");
        }
    }
    public static void testArgumentConstructor7(){
        double [] coefficient = {1, 2, 3};
        int [] exponent = {0, 1, 2};  // One term has a zero exponent
        Polynomial p1 = new Polynomial(coefficient, exponent);
        System.out.println("Argument Constructor Test #7 - Zero Exponent");
        if(p1.evaluate(3) == (1 + 2*3 + 3*Math.pow(3, 2))){
            System.out.println("    Passed testArgumentConstructor7");
        }
        else{
            System.out.println("    Failed testArgumentConstructor7");
        }
    }
    public static void testArgumentConstructor8(){
        double [] coefficient = {2, 1};
        int [] exponent = {10, 15};  // Large exponents
        Polynomial p1 = new Polynomial(coefficient, exponent);
        System.out.println("Argument Constructor Test#8 - Large Exponents");
        if(p1.evaluate(2) == (2 * Math.pow(2, 10) + Math.pow(2, 15))){
            System.out.println("    Passed testArgumentConstructor8");
        }
        else{
            System.out.println("    Failed testArgumentConstructor8");
        }
    }
    public static void testArgumentConstructor9() {
        double[] coefficient = {1, 2};
        int[] exponent = {0, 1};  // Simple polynomial x + 2
        Polynomial p1 = new Polynomial(coefficient, exponent);
        System.out.println("Argument Constructor Test#9 - Simple Polynomial");
        if (p1.evaluate(3) == (1 * Math.pow(3, 0) + 2 * Math.pow(3, 1))) {
            System.out.println("    Passed testArgumentConstructor9");
        } else {
            System.out.println("    Failed testArgumentConstructor9");
        }
    }
    
    public static void testArgumentConstructor10() {
        double[] coefficient = {4, -3};
        int[] exponent = {3, 1};  // Polynomial 4x^3 - 3x
        Polynomial p2 = new Polynomial(coefficient, exponent);
        System.out.println("Argument Constructor Test#10 - Cubic Polynomial");
        if (p2.evaluate(2) == (4 * Math.pow(2, 3) - 3 * Math.pow(2, 1))) {
            System.out.println("    Passed testArgumentConstructor10");
        } else {
            System.out.println("    Failed testArgumentConstructor10");
        }
    }
    
    public static void testArgumentConstructor11() {
        double[] coefficient = {0, 0, 5};  // x^2 polynomial
        int[] exponent = {2, 1, 0};  // 5
        Polynomial p3 = new Polynomial(coefficient, exponent);
        System.out.println("Argument Constructor Test#11 - Quadratic Polynomial");
        if (p3.evaluate(1) == (0 * Math.pow(1, 2) + 0 * Math.pow(1, 1) + 5)) {
            System.out.println("    Passed testArgumentConstructor11");
        } else {
            System.out.println("    Failed testArgumentConstructor11");
        }
    }
    
    public static void testArgumentConstructor12() {
        double[] coefficient = {1, -1, 2};  // x^2 - x + 2
        int[] exponent = {2, 1, 0};
        Polynomial p4 = new Polynomial(coefficient, exponent);
        System.out.println("Argument Constructor Test#12 - Mixed Coefficients");
        if (p4.evaluate(2) == (1 * Math.pow(2, 2) - 1 * Math.pow(2, 1) + 2)) {
            System.out.println("    Passed testArgumentConstructor12");
        } else {
            System.out.println("    Failed testArgumentConstructor12");
        }
    }
    public static void testArgumentConstructor13() {
        double[] coefficient = {1};  // Constant term
        int[] exponent = {0};  // 1
        Polynomial p5 = new Polynomial(coefficient, exponent);
        System.out.println("Argument Constructor Test#13 - Constant Polynomial");
        if (p5.evaluate(5) == 1) {
            System.out.println("    Passed testArgumentConstructor13");
        } else {
            System.out.println("    Failed testArgumentConstructor13");
        }
    }
    
    public static void testArgumentConstructor14() {
        double[] coefficient = {0};  // Zero polynomial
        int[] exponent = {0};  // 0
        Polynomial p6 = new Polynomial(coefficient, exponent);
        System.out.println("Argument Constructor Test#14 - Zero Polynomial");
        if (p6.evaluate(10) == 0) {
            System.out.println("    Passed testArgumentConstructor14");
        } else {
            System.out.println("    Failed testArgumentConstructor14" + p6.evaluate(10));
        }
    }
    
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.println("    At i = " + i +  "the value is " + arr[i]);
        }
    }
    public static void printArray(double[] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.println("    At i = " + i +  "the value is " + arr[i]);
        }
    }
    
    
    public static void testappendExponents1(){
        Polynomial p  = new Polynomial();
        int [] ex1 = {1,3,5};
        int [] ex2 = {2,4,6};
        int [] result1 = p.appendPolyExponents(ex1, ex2);
        System.out.println("AppendPolyExponents Test #1 - No Duplicates");
        System.out.println("    Expected Result is {1,3,5,2,4,6}");
        printArray(result1);
    }
    public static void testappendExponents2(){
        Polynomial p  = new Polynomial();
        int[] ex1_case2 = {1, 3, 5};
        int[] ex2_case2 = {3, 5, 7};
        int[] result2 = p.appendPolyExponents(ex1_case2, ex2_case2);
        System.out.println("AppendPolyExponents Test Case 2 - Some Duplicates");
        System.out.println("    Expected Result is {1, 3, 5, 7}");
        printArray(result2);
    }
    public static void testappendExponents3(){
        Polynomial p = new Polynomial();
        int[] ex1_case3 = {};
        int[] ex2_case3 = {2, 4, 6};
        int[] result3 = p.appendPolyExponents(ex1_case3, ex2_case3);
        System.out.println("AppendPolyExponents Test Case 3 - One Empty Array");
        System.out.println("    Expected Result is {2, 4, 6}");
        printArray(result3);
        
    }
    public static void testappendExponents4(){
        Polynomial p = new Polynomial();
        int[] ex1_case4 = {};
        int[] ex2_case4 = {};
        int[] result4 = p.appendPolyExponents(ex1_case4, ex2_case4);
        System.out.println("AppendPolyExponents Test Case 4 - Both Empty");
        System.out.println("    Expected Result is {}");
        printArray(result4);
    }
    public static void testappendExponents5(){
        Polynomial p = new Polynomial();
        int[] ex1_case5 = {1, 2, 3};
        int[] ex2_case5 = {1, 2, 3};
        int[] result5 = p.appendPolyExponents(ex1_case5, ex2_case5);
        System.out.println("AppendPolyExponents Test Case 5 - All Duplicates");
        System.out.println("    Expected Result is {1, 2, 3}");
        printArray(result5);
    }
    public static void testappendExponents6() {
        Polynomial p = new Polynomial();
        int[] ex1_case6 = {1, 2, 3};
        int[] ex2_case6 = {4, 5, 6};
        int[] result6 = p.appendPolyExponents(ex1_case6, ex2_case6);
        System.out.println("AppendPolyExponents Test Case 6 - Distinct Exponents");
        System.out.println("    Expected Result is {1, 2, 3, 4, 5, 6}");
        printArray(result6);
    }
    
    public static void testappendExponents7() {
        Polynomial p = new Polynomial();
        int[] ex1_case7 = {1, 2, 3};
        int[] ex2_case7 = {2, 3, 4};
        int[] result7 = p.appendPolyExponents(ex1_case7, ex2_case7);
        System.out.println("AppendPolyExponents Test Case 7 - Some Duplicates");
        System.out.println("    Expected Result is {1, 2, 3, 4}");
        printArray(result7);
    }
    
    public static void testappendExponents8() {
        Polynomial p = new Polynomial();
        int[] ex1_case8 = {};
        int[] ex2_case8 = {1, 2, 3};
        int[] result8 = p.appendPolyExponents(ex1_case8, ex2_case8);
        System.out.println("AppendPolyExponents Test Case 8 - First Array Empty");
        System.out.println("    Expected Result is {1, 2, 3}");
        printArray(result8);
    }
    
    public static void testappendExponents9() {
        Polynomial p = new Polynomial();
        int[] ex1_case9 = {1, 2, 3};
        int[] ex2_case9 = {};
        int[] result9 = p.appendPolyExponents(ex1_case9, ex2_case9);
        System.out.println("AppendPolyExponents Test Case 9 - Second Array Empty");
        System.out.println("    Expected Result is {1, 2, 3}");
        printArray(result9);
    }
    
    public static void testappendExponents10() {
        Polynomial p = new Polynomial();
        int[] ex1_case10 = {1, 2, 3, 4};
        int[] ex2_case10 = {3, 4, 5, 6};
        int[] result10 = p.appendPolyExponents(ex1_case10, ex2_case10);
        System.out.println("AppendPolyExponents Test Case 10 - Full Overlap");
        System.out.println("    Expected Result is {1, 2, 3, 4, 5, 6}");
        printArray(result10);
    }
    
    // Edge Case 1: Both arrays are empty
    public static void testappendExponents11() {
        Polynomial p = new Polynomial();
        int[] ex1_case11 = {};
        int[] ex2_case11 = {};
        int[] result11 = p.appendPolyExponents(ex1_case11, ex2_case11);
        System.out.println("AppendPolyExponents Test Case 11 - Both Arrays Empty");
        System.out.println("    Expected Result is {}");
        printArray(result11);
    }
    
    // Edge Case 2: Both arrays contain the same duplicate value
    public static void testappendExponents12() {
        Polynomial p = new Polynomial();
        int[] ex1_case12 = {1, 1, 1};
        int[] ex2_case12 = {1, 1, 1};
        int[] result12 = p.appendPolyExponents(ex1_case12, ex2_case12);
        System.out.println("AppendPolyExponents Test Case 12 - Both Arrays Same Duplicates");
        System.out.println("    Expected Result is {1}");
        printArray(result12);
    }
    
    // Edge Case 3: One array contains duplicates while the other is unique
    public static void testappendExponents13() {
        Polynomial p = new Polynomial();
        int[] ex1_case13 = {1, 1, 2};
        int[] ex2_case13 = {3, 3, 4};
        int[] result13 = p.appendPolyExponents(ex1_case13, ex2_case13);
        System.out.println("AppendPolyExponents Test Case 13 - One Array Duplicates, One Unique");
        System.out.println("    Expected Result is {1, 2, 3, 4}");
        printArray(result13);
    }

    public static void testAscendingCoefficientAndExponent1() {
        double[] coefficient1 = {3, 2, 1, 4};
        int[] exponent1 = {1, 2, 3, 4};
        Polynomial poly = new Polynomial(coefficient1, exponent1);
        
        // Call the method on the polynomial instance
        poly.sortAscendingCoeffandExponents(poly);
        
        System.out.println("AscendingCoefficientAndExponent Test Case 1");
        System.out.println("    Expected result is 3,2,1,4");
        printArray(poly.Coefficients);
        System.out.println("    Expected result is 1,2,3,4");
        printArray(poly.exponents);
    }
    public static void testAscendingCoefficientAndExponent2() {
        double[] coefficient2 = {5, 3, 8, 1};
        int[] exponent2 = {2, 4, 3, 1};
        Polynomial poly = new Polynomial(coefficient2, exponent2);
        
        // Call the method on the polynomial instance
        poly.sortAscendingCoeffandExponents(poly);
        
        System.out.println("AscendingCoefficientAndExponent Test Case 2");
        System.out.println("    Expected result is 1, 5, 8, 3");
        printArray(poly.Coefficients);
        System.out.println("Expected result is 1, 2, 3, 4");
        printArray(poly.exponents);
    }
    
    public static void testAscendingCoefficientAndExponent3() {
        double[] coefficient3 = {4, 2, 0, 6};
        int[] exponent3 = {5, 2, 1, 3};
        Polynomial poly = new Polynomial(coefficient3, exponent3);
        
        // Call the method on the polynomial instance
        poly.sortAscendingCoeffandExponents(poly);
        
        System.out.println("AscendingCoefficientAndExponent Test Case 3");
        System.out.println("    Expected result is 0, 2, 6, 4");
        printArray(poly.Coefficients);
        System.out.println("    Expected result is 1, 2, 3, 5");
        printArray(poly.exponents);
    }
    
    public static void testAscendingCoefficientAndExponent4() {
        double[] coefficient4 = {7, 3, 5, 1};
        int[] exponent4 = {3, 1, 4, 0};
        Polynomial poly = new Polynomial(coefficient4, exponent4);
        
        // Call the method on the polynomial instance
        poly.sortAscendingCoeffandExponents(poly);
        
        System.out.println("AscendingCoefficientAndExponent Test Case 4");
        System.out.println("    Expected result is 1, 3, 7, 5");
        printArray(poly.Coefficients);
        System.out.println("    Expected result is 0, 1, 3, 4");
        printArray(poly.exponents);
    }
    
    public static void testAscendingCoefficientAndExponent5() {
        double[] coefficient5 = {10, -1, 5, 0};
        int[] exponent5 = {2, 3, 4, 1};
        Polynomial poly = new Polynomial(coefficient5, exponent5);
        
        // Call the method on the polynomial instance
        poly.sortAscendingCoeffandExponents(poly);
        
        System.out.println("AscendingCoefficientAndExponent Test Case 5");
        System.out.println("    Expected result is 0, 10, -1, 5");
        printArray(poly.Coefficients);
        System.out.println("    Expected result is 1, 2, 3, 4");
        printArray(poly.exponents);
    }
    
    public static void testAscendingCoefficientAndExponent6() {
        double[] coefficient6 = {3, 3, 2, 1};
        int[] exponent6 = {4, 2, 4, 1};
        Polynomial poly = new Polynomial(coefficient6, exponent6);
        
        // Call the method on the polynomial instance
        poly.sortAscendingCoeffandExponents(poly);
        
        System.out.println("AscendingCoefficientAndExponent Test Case 6");
        System.out.println("    Expected result is 1, 3, 2, 3");
        printArray(poly.Coefficients);
        System.out.println("    Expected result is 1, 2, 4, 4");
        printArray(poly.exponents);
    }
    public static void testAscendingCoefficientAndExponent7() {
        double[] coefficient7 = {1, 1, 1}; // All coefficients are the same
        int[] exponent7 = {3, 2, 1}; // Different exponents
        Polynomial poly = new Polynomial(coefficient7, exponent7);
        
        poly.sortAscendingCoeffandExponents(poly);
        
        System.out.println("AscendingCoefficientAndExponent Test Case 7");
        System.out.println("    Expected Coefficients: 1, 1, 1");
        printArray(poly.Coefficients);
        System.out.println("    Expected Exponents: 1, 2, 3");
        printArray(poly.exponents);
    }
    
    public static void testAscendingCoefficientAndExponent8() {
        double[] coefficient8 = {5, 3, 1, 2};
        int[] exponent8 = {2, 3, 1, 2}; // Mixed coefficients with some repeated exponents
        Polynomial poly = new Polynomial(coefficient8, exponent8);
        
        poly.sortAscendingCoeffandExponents(poly);
        
        System.out.println("AscendingCoefficientAndExponent Test Case 8");
        System.out.println("    Expected Coefficients: 1, 5, 2, 3");
        printArray(poly.Coefficients);
        System.out.println("    Expected Exponents: 1, 2, 2, 3");
        printArray(poly.exponents);
    }
    
    public static void testAscendingCoefficientAndExponent9() {
        double[] coefficient9 = {0, 1, 2, 0}; // Including zeros
        int[] exponent9 = {4, 1, 3, 2};
        Polynomial poly = new Polynomial(coefficient9, exponent9);
        
        poly.sortAscendingCoeffandExponents(poly);
        
        System.out.println("AscendingCoefficientAndExponent Test Case 9");
        System.out.println("    Expected Coefficients: 1, 0, 2, 0");
        printArray(poly.Coefficients);
        System.out.println("    Expected Exponents: 1, 2, 3, 4");
        printArray(poly.exponents);
    }
    
    public static void testAscendingCoefficientAndExponent10() {
        double[] coefficient10 = {3, 2, 1}; // Descending order
        int[] exponent10 = {1, 2, 3}; // Ascending order
        Polynomial poly = new Polynomial(coefficient10, exponent10);
        
        poly.sortAscendingCoeffandExponents(poly);
        
        System.out.println("AscendingCoefficientAndExponent Test Case 10");
        System.out.println("    Expected Coefficients: 3, 2, 1");
        printArray(poly.Coefficients);
        System.out.println("    Expected Exponents: 1, 2, 3");
        printArray(poly.exponents);
    }
    
    public static void testAscendingCoefficientAndExponent11() {
        double[] coefficient11 = {0}; // Single zero coefficient
        int[] exponent11 = {0}; // Single exponent
        Polynomial poly = new Polynomial(coefficient11, exponent11);
        
        poly.sortAscendingCoeffandExponents(poly);
        
        System.out.println("AscendingCoefficientAndExponent Test Case 11");
        System.out.println("    Expected Coefficients: 0");
        printArray(poly.Coefficients);
        System.out.println("    Expected Exponents: 0");
        printArray(poly.exponents);
    }
    
    public static void testAscendingCoefficientAndExponent12() {
        double[] coefficient12 = {}; // Empty input
        int[] exponent12 = {}; // Empty input
        Polynomial poly = new Polynomial(coefficient12, exponent12);
        
        poly.sortAscendingCoeffandExponents(poly);
        
        System.out.println("AscendingCoefficientAndExponent Test Case 12");
        System.out.println("    Expected Coefficients: []");
        printArray(poly.Coefficients);
        System.out.println("    Expected Exponents: []");
        printArray(poly.exponents);
    }

    public static void testAddCase1() {
        double[] coefficient1 = {1, 3, 2}; // 1x^1 + 3x^2 + 2x^3
        int[] exponent1 = {1, 2, 3};
        Polynomial polynomial1 = new Polynomial(coefficient1, exponent1);
    
        double[] coefficient2 = {5, 3, 2}; // 5x^2 + 3x^4 + 2x^1
        int[] exponent2 = {2, 4, 1};
        Polynomial polynomial2 = new Polynomial(coefficient2, exponent2);
    
        Polynomial result = polynomial1.add(polynomial2);
        System.out.println("Add Test Case 1");
        System.out.println("    Expected coefficients: {3, 8, 2, 3}");
        printArray(result.Coefficients);
        System.out.println("    Expected exponents: {1, 2, 3, 4}");
        printArray(result.exponents);
    }
    public static void testAddCase2() {
        double[] coefficient1 = {2}; // 2x^0
        int[] exponent1 = {0};
        Polynomial polynomial1 = new Polynomial(coefficient1, exponent1);
    
        double[] coefficient2 = {5, 1}; // 5x^1 + 1x^2
        int[] exponent2 = {1, 2};
        Polynomial polynomial2 = new Polynomial(coefficient2, exponent2);
    
        Polynomial result = polynomial1.add(polynomial2);
        System.out.println("Add Test Case 2");
        System.out.println("    Expected coefficients: {2, 5, 1}");
        printArray(result.Coefficients);
        System.out.println("    Expected exponents: {0, 1, 2}");
        printArray(result.exponents);
    }
    
    public static void testAddCase3() {
        double[] coefficient1 = {1, 1}; // 1x^1 + 1x^2
        int[] exponent1 = {1, 2};
        Polynomial polynomial1 = new Polynomial(coefficient1, exponent1);
    
        double[] coefficient2 = {1, 1}; // 1x^1 + 1x^2
        int[] exponent2 = {1, 2};
        Polynomial polynomial2 = new Polynomial(coefficient2, exponent2);
    
        Polynomial result = polynomial1.add(polynomial2);
        System.out.println("Add Test Case 3");
        System.out.println("    Expected coefficients: {2, 2}");
        printArray(result.Coefficients);
        System.out.println("    Expected exponents: {1, 2}");
        printArray(result.exponents);
    }
    
    public static void testAddCase4() {
        double[] coefficient1 = {3, 2}; // 3x^0 + 2x^2
        int[] exponent1 = {0, 2};
        Polynomial polynomial1 = new Polynomial(coefficient1, exponent1);
    
        double[] coefficient2 = {1, 5}; // 1x^1 + 5x^3
        int[] exponent2 = {1, 3};
        Polynomial polynomial2 = new Polynomial(coefficient2, exponent2);
    
        Polynomial result = polynomial1.add(polynomial2);
        System.out.println("Add Test Case 4");
        System.out.println("    Expected coefficients: {3, 1, 2, 5}");
        printArray(result.Coefficients);
        System.out.println("    Expected exponents: {0, 1, 2, 3}");
        printArray(result.exponents);
    }
    
    public static void testAddCase5() {
        double[] coefficient1 = {1, 0, 2}; //1x^0+0x^1+2x^2
        int[] exponent1 = {0, 1, 2};
        Polynomial polynomial1 = new Polynomial(coefficient1, exponent1);
    
        double[] coefficient2 = {0, 1}; // 0x^0 + 1x^1
        int[] exponent2 = {0, 1};
        Polynomial polynomial2 = new Polynomial(coefficient2, exponent2);
    
        Polynomial result = polynomial1.add(polynomial2);
        System.out.println("Add Test Case 5");
        System.out.println("    Expected coefficients: {1, 1, 2}");
        printArray(result.Coefficients);
        System.out.println("    Expected exponents: {0, 1, 2}");
        printArray(result.exponents);
    }
    public static void hasRootCase1() {
        double[] coefficient1 = {1, -9}; 
        int[] exponent1 = {2, 0}; //x^2-9
        Polynomial polynomial1 = new Polynomial(coefficient1, exponent1);
        System.out.println("has Root Case 1");
        if (polynomial1.hasRoot(3)) {
            System.out.println("    Passed testRootCase1");
        } else {
            System.out.println("    Failed testRootCase1");
        }
    }
    
    public static void hasRootCase2() {
        double[] coefficient2 = {1, -9}; 
        int[] exponent2 = {2, 0}; //x^2-9
        Polynomial polynomial2 = new Polynomial(coefficient2, exponent2);
        System.out.println("has Root Case 2");
        if (!polynomial2.hasRoot(2)) {
            System.out.println("    Passed testRootCase2");
        } else {
            System.out.println("    Failed testRootCase2");
        }
    }
    
    public static void hasRootCase3() {
        double[] coefficient3 = {1, -4, 4}; // (x - 2)^2
        int[] exponent3 = {2, 1, 0};
        Polynomial polynomial3 = new Polynomial(coefficient3, exponent3);
        System.out.println("has Root Case 3");
        if (polynomial3.hasRoot(2)) {
            System.out.println("    Passed testRootCase3");
        } else {
            System.out.println("    Failed testRootCase3");
        }
    }
    
    public static void hasRootCase4() {
        double[] coefficient4 = {1, 3, 2}; // x^2 + 3x + 2 = (x + 1)(x + 2)
        int[] exponent4 = {2, 1, 0};
        Polynomial polynomial4 = new Polynomial(coefficient4, exponent4);
        System.out.println("has Root Case 4");
        if (polynomial4.hasRoot(-1)) {
            System.out.println("    Passed testRootCase4");
        } else {
            System.out.println("    Failed testRootCase4");
        }
    }
    
    public static void hasRootCase5() {
        double[] coefficient5 = {0}; // Zero polynomial
        int[] exponent5 = {0};
        Polynomial polynomial5 = new Polynomial(coefficient5, exponent5);
        System.out.println("has Root Case 5");
        if (polynomial5.hasRoot(1)) {
            System.out.println("    Passed testRootCase5");
        } else {
            System.out.println("    Failed testRootCase5");
        }
    }

    public static void testSimplifyPolynomialCase1(){
        double[] coefficients = {0, 0, 2, 3};
        int[] exponents = {0, 0, 2, 3};
        Polynomial polynomial = new Polynomial(coefficients, exponents);
        
        polynomial = polynomial.simplifyPolynomial(polynomial);
        
        System.out.println("SimplifyPolynomial Test Case 1");
        System.out.println("Expected Coefficients: 2, 3");
        printArray(polynomial.Coefficients);  // Should output: [2, 3, 0, 0]
        System.out.println("Expected Exponents: 2, 3");
        printArray(polynomial.exponents);     // Should output: [2, 3, 0, 0]
    }
    public static void testSimplifyPolynomialCase2(){
        double[] coefficients = {5, 3, 2};
        int[] exponents = {4, 2, 1};
        Polynomial polynomial = new Polynomial(coefficients, exponents);
        
        polynomial = polynomial.simplifyPolynomial(polynomial);
        
        System.out.println("SimplifyPolynomial Test Case 2");
        System.out.println("Expected Coefficients: 5, 3, 2");
        printArray(polynomial.Coefficients);  // Should output: [5, 3, 2]
        System.out.println("Expected Exponents: 4, 2, 1");
        printArray(polynomial.exponents);     // Should output: [4, 2, 1]
    }
    public static void testSimplifyPolynomialCase3(){
        double[] coefficients = {4, 0, 3, 0, 5};
        int[] exponents = {5, 0, 3, 0, 1};
        Polynomial polynomial = new Polynomial(coefficients, exponents);
        
        polynomial = polynomial.simplifyPolynomial(polynomial);
        
        System.out.println("SimplifyPolynomial Test Case 3");
        System.out.println("Expected Coefficients: 4, 3, 5");
        printArray(polynomial.Coefficients);  // Should output: [4, 3, 5, 0, 0]
        System.out.println("Expected Exponents: 5, 3, 1");
        printArray(polynomial.exponents);     // Should output: [5, 3, 1, 0, 0]
    }
    public static void testSimplifyPolynomialCase4(){
        double[] coefficients = {0, 0, 0};
        int[] exponents = {0, 0, 0};
        Polynomial polynomial = new Polynomial(coefficients, exponents);
        
        polynomial = polynomial.simplifyPolynomial(polynomial);
        
        System.out.println("SimplifyPolynomial Test Case 4");
        System.out.println("    Expected Coefficients: 0, 0, 0");
        printArray(polynomial.Coefficients);  // Should output: [0, 0, 0]
        System.out.println("    Expected Exponents: 0, 0, 0");
        printArray(polynomial.exponents);     // Should output: [0, 0, 0]
    }
    public static void testSimplifyPolynomialCase5(){
        double[] coefficients = {7, 0, 2, 0, 0, 1};
        int[] exponents = {6, 0, 4, 0, 0, 0};
        Polynomial polynomial = new Polynomial(coefficients, exponents);
        
        polynomial = polynomial.simplifyPolynomial(polynomial);
        
        System.out.println("SimplifyPolynomial Test Case 5");
        System.out.println("    Expected Coefficients: 7, 2, 1");
        printArray(polynomial.Coefficients);  // Should output: [7, 2, 1, 0, 0, 0]
        System.out.println("    Expected Exponents: 6, 4, 0");
        printArray(polynomial.exponents);     // Should output: [6, 4, 0, 0, 0, 0]
    }
    public static void testSimplifyPolynomialCase6() {
        double[] coefficients = {0, 0, 0};
        int[] exponents = {0, 0, 0}; // Polynomial: 0 + 0 + 0
        Polynomial polynomial = new Polynomial(coefficients, exponents);
        
        Polynomial result = polynomial.simplifyPolynomial(polynomial);
        System.out.println("SimplifyPolynomial Test Case 6");
        System.out.println("    Expected Coefficients and Exponents:empty");
        printArray(result.Coefficients);
        printArray(result.exponents);

    }
    
    public static void testSimplifyPolynomialCase7() {
        double[] coefficients = {0, 0, 0, 0};
        int[] exponents = {2, 1, 0, 0}; // Polynomial: 0 + 0 + 0 + 0
        Polynomial polynomial = new Polynomial(coefficients, exponents);
        
        Polynomial result = polynomial.simplifyPolynomial(polynomial);
        System.out.println("SimplifyPolynomial Test Case 7");
        System.out.println("    Expected Coefficients 0,0");
        printArray(result.Coefficients);
        System.out.println("    Expected Exponents 2,1");
        printArray(result.exponents);
    }
    
    public static void testSimplifyPolynomialCase8() {
        double[] coefficients = {2, 3, 0, 0};
        int[] exponents = {2, 1, 0, 0}; // Polynomial: 2x^2 + 3x + 0 + 0
        Polynomial polynomial = new Polynomial(coefficients, exponents);
        
        Polynomial result = polynomial.simplifyPolynomial(polynomial);
        System.out.println("SimplifyPolynomial Test Case 8");
        System.out.println("    Expected Coefficients 2,3");
        printArray(result.Coefficients);
        System.out.println("    Expected Exponents 2,1");
        printArray(result.exponents);
    }
    
    public static void testSimplifyPolynomialCase9() {
        double[] coefficients = {0, 1, 0};
        int[] exponents = {0, 1, 0}; // Polynomial: 0 + 1x + 0
        Polynomial polynomial = new Polynomial(coefficients, exponents);
        
        Polynomial result = polynomial.simplifyPolynomial(polynomial);
        System.out.println("SimplifyPolynomial Test Case 9");
        System.out.println("    Expected Coefficients 1");
        printArray(result.Coefficients);
        System.out.println("    Expected Exponents 1");
        printArray(result.exponents);
        // Expected result: Polynomial should simplify to 1x or just x
    }
    
    public static void testSimplifyPolynomialCase10() {
        double[] coefficients = {0, 0, 0, 1};
        int[] exponents = {3, 2, 1, 0}; // Polynomial: 0 + 0 + 0 + 1
        Polynomial polynomial = new Polynomial(coefficients, exponents);
        
        Polynomial result = polynomial.simplifyPolynomial(polynomial);
        System.out.println("SimplifyPolynomial Test Case 10");
        System.out.println("    Expected Coefficients: 0, 0, 0, 1");
        printArray(result.Coefficients);
        System.out.println("    Expected Exponents: 3, 2, 1, 0");
        printArray(result.exponents);
        
    }
    
    public static void testSimplifyPolynomialCase11() {
        double[] coefficients = {0, 1, 2, 3};
        int[] exponents = {4, 3, 2, 0}; // Polynomial: 0 + x^3 + 2x^2 + 3
        Polynomial polynomial = new Polynomial(coefficients, exponents);
        
        Polynomial result = polynomial.simplifyPolynomial(polynomial);
        System.out.println("SimplifyPolynomial Test Case 11");
        System.out.println("Expected Coefficients 0, 1, 2, 3");
        printArray(result.Coefficients);
        System.out.println("    Expected Exponents: 4, 3, 2, 0");
        printArray(result.exponents);
    }
    

    public static void testMultiplyCase1() {
        // Expected result: {3, 10, 8} for coefficients, {2, 1, 0} for exponents
        double[] coeff1 = {1, 2}; // Represents 1x^1 + 2x^0
        int[] exp1 = {1, 0};
        Polynomial poly1 = new Polynomial(coeff1, exp1);
    
        double[] coeff2 = {3, 4}; // Represents 3x^1 + 4x^0
        int[] exp2 = {1, 0};
        Polynomial poly2 = new Polynomial(coeff2, exp2);
    
        Polynomial result = poly1.multiply(poly2);
        System.out.println("Test Multiply Case 1: (1x^1 + 2) * (3x^1 + 4)");
        System.out.println("Expected coefficients: {3, 10, 8}");
        printArray(result.Coefficients); // Print actual coefficients
        System.out.println("Expected exponents: {2, 1, 0}");
        printArray(result.exponents);     // Print actual exponents
    }
    
    public static void testMultiplyCase2() {
        // Expected result: {10, 6} for coefficients, {1, 0} for exponents
        double[] coeff1 = {2}; // Represents 2x^0
        int[] exp1 = {0};
        Polynomial poly1 = new Polynomial(coeff1, exp1);
    
        double[] coeff2 = {5, 3}; // Represents 5x^1 + 3x^0
        int[] exp2 = {1, 0};
        Polynomial poly2 = new Polynomial(coeff2, exp2);
    
        Polynomial result = poly1.multiply(poly2);
        System.out.println("Test Multiply Case 2: (2) * (5x^1 + 3)");
        System.out.println("Expected coefficients: {10, 6}");
        printArray(result.Coefficients); // Print actual coefficients
        System.out.println("Expected exponents: {1, 0}");
        printArray(result.exponents);     // Print actual exponents
    }
    
    public static void testMultiplyCase3() {
        // Expected result: {1, 2, 1} for coefficients, {2, 1, 0} for exponents
        double[] coeff1 = {1, 1}; // Represents x^1 + x^0
        int[] exp1 = {1, 0};
        Polynomial poly1 = new Polynomial(coeff1, exp1);
    
        double[] coeff2 = {1, 1}; // Represents x^1 + x^0
        int[] exp2 = {1, 0};
        Polynomial poly2 = new Polynomial(coeff2, exp2);
    
        Polynomial result = poly1.multiply(poly2);
        System.out.println("Test Multiply Case 3: (x + 1) * (x + 1)");
        System.out.println("Expected coefficients: {1, 2, 1}");
        printArray(result.Coefficients); // Print actual coefficients
        System.out.println("Expected exponents: {2, 1, 0}");
        printArray(result.exponents);     // Print actual exponents
    }
    
    public static void testMultiplyCase4() {
        // Expected result: {3, 6} for coefficients, {1, 0} for exponents
        double[] coeff1 = {1, 2}; // Represents 1x^1 + 2x^0
        int[] exp1 = {1, 0};
        Polynomial poly1 = new Polynomial(coeff1, exp1);
    
        double[] coeff2 = {3}; // Represents 3x^0
        int[] exp2 = {0};
        Polynomial poly2 = new Polynomial(coeff2, exp2);
    
        Polynomial result = poly1.multiply(poly2);
        System.out.println("Test Multiply Case 4: (1x^1 + 2) * (3)");
        System.out.println("Expected coefficients: {3, 6}");
        printArray(result.Coefficients); // Print actual coefficients
        System.out.println("Expected exponents: {1, 0}");
        printArray(result.exponents);     // Print actual exponents
    }
    public static void testMultiplyCase5() {
        // Expected result: {1, 4, 4} for coefficients, {3, 2, 0} for exponents
        double[] coeff1 = {1, 0, 2}; // Represents x^2 + 2
        int[] exp1 = {2, 0, 0};
        Polynomial poly1 = new Polynomial(coeff1, exp1);
        
        double[] coeff2 = {1, 2}; // Represents 1x + 2
        int[] exp2 = {1, 0};
        Polynomial poly2 = new Polynomial(coeff2, exp2);
        
        Polynomial result = poly1.multiply(poly2);
        System.out.println("Test Multiply Case 5: (x^2 + 2) * (x + 2)");
        System.out.println("Expected coefficients: {4, 2, 2, 1}");
        printArray(result.Coefficients); // Print actual coefficients
        System.out.println("Expected exponents: {0, 1, 2, 3}");
        printArray(result.exponents);     // Print actual exponents
    }
    
    public static void testMultiplyCase6() {
        double[] coeff1 = {1, -1}; 
        int[] exp1 = {3, 1}; // Polynomial: x^3 - x
        double[] coeff2 = {2, 3}; 
        int[] exp2 = {2, 0}; // Polynomial: 2x^2 + 3
        Polynomial p1 = new Polynomial(coeff1, exp1);
        Polynomial p2 = new Polynomial(coeff2, exp2);
        
        Polynomial result = p1.multiply(p2);
         System.out.println("Test Multiply Case 6: (x^3 - x) * (2x^2 + 3)");
         System.out.println("Expected coefficients: {-3, 1, 2}");
         printArray(result.Coefficients); // Print actual coefficients
         System.out.println("Expected exponents: {1, 3, 5}");
         printArray(result.exponents);     // Print actual exponents
    }
    
    public static void testMultiplyCase7() {
        double[] coeff1 = {5}; 
        int[] exp1 = {0}; // Polynomial: 5
        double[] coeff2 = {1, 2}; 
        int[] exp2 = {2, 1}; // Polynomial: x^2 + 2x
        Polynomial p1 = new Polynomial(coeff1, exp1);
        Polynomial p2 = new Polynomial(coeff2, exp2);
        
        Polynomial result = p1.multiply(p2);
        System.out.println("Test Multiply Case 7: 5 * (x^2 + 2x)");
        System.out.println("Expected coefficients: {10, 5}");
        printArray(result.Coefficients); // Print actual coefficients
        System.out.println("Expected exponents: {1, 2}");
        printArray(result.exponents);     // Print actual exponents
    }
    
    public static void testMultiplyCase8() {
        double[] coeff1 = {1, 2, 3}; 
        int[] exp1 = {2, 1, 0}; // Polynomial: x^2 + 2x + 3
        double[] coeff2 = {4, 5}; 
        int[] exp2 = {1, 0}; // Polynomial: 4x + 5
        Polynomial p1 = new Polynomial(coeff1, exp1);
        Polynomial p2 = new Polynomial(coeff2, exp2);
        
        Polynomial result = p1.multiply(p2);
        System.out.println("Test Multiply Case 8: (x^2 + 2x + 3) * (4x + 5)");
        System.out.println("Expected coefficients: {15, 22, 13, 4}");
        printArray(result.Coefficients); // Print actual coefficients
        System.out.println("Expected exponents: {0, 1, 2, 3}");
        printArray(result.exponents);     // Print actual exponents
    }
    public static void testMultiplyCase9() {
        double[] coeff1 = {0}; 
        int[] exp1 = {0}; // Polynomial: 0
        double[] coeff2 = {1, 2}; 
        int[] exp2 = {2, 1}; // Polynomial: x^2 + 2x
        Polynomial p1 = new Polynomial(coeff1, exp1);
        Polynomial p2 = new Polynomial(coeff2, exp2);
        
        Polynomial result = p1.multiply(p2);
        System.out.println("Test Multiply Case 9: 0 * (x^2 + 2x)");
        System.out.println("Expected coefficients: {0.0}");
        printArray(result.Coefficients); // Print actual coefficients
        System.out.println("Expected exponents: {0}");
        printArray(result.exponents);     // Print actual exponents
    }
    
    public static void testMultiplyCase10() {
        double[] coeff1 = {1}; 
        int[] exp1 = {0}; // Polynomial: 1
        double[] coeff2 = {0}; 
        int[] exp2 = {0}; // Polynomial: 0
        Polynomial p1 = new Polynomial(coeff1, exp1);
        Polynomial p2 = new Polynomial(coeff2, exp2);
        
        Polynomial result = p1.multiply(p2);
        System.out.println("Test Multiply Case 10: 1 * 0");
        System.out.println("Expected coefficients: {0.0}");
        printArray(result.Coefficients); // Print actual coefficients
        System.out.println("Expected exponents: {0}");
        printArray(result.exponents);     // Print actual exponents
    }
    
    public static void testMultiplyCase11() {
        double[] coeff1 = {1, 1}; 
        int[] exp1 = {1, 0}; // Polynomial: x + 1
        double[] coeff2 = {1}; 
        int[] exp2 = {0}; // Polynomial: 1
        Polynomial p1 = new Polynomial(coeff1, exp1);
        Polynomial p2 = new Polynomial(coeff2, exp2);
        
        Polynomial result = p1.multiply(p2);
        System.out.println("Test Multiply Case 11: (x + 1) * 1");
        System.out.println("Expected coefficients: {1, 1}");
        printArray(result.Coefficients); // Print actual coefficients
        System.out.println("Expected exponents: {1, 0}");
        printArray(result.exponents);     // Print actual exponents
    }
    
    public static void testMultiplyCase12() {
        double[] coeff1 = {1, 2}; 
        int[] exp1 = {2, 1}; // Polynomial: x^2 + 2x
        double[] coeff2 = {0, 0}; 
        int[] exp2 = {1, 0}; // Polynomial: 0
        Polynomial p1 = new Polynomial(coeff1, exp1);
        Polynomial p2 = new Polynomial(coeff2, exp2);
        
        Polynomial result = p1.multiply(p2);
        System.out.println("Test Multiply Case 12: (x^2 + 2x) * 0");
        System.out.println("Expected coefficients: {0.0}");
        printArray(result.Coefficients); // Print actual coefficients
        System.out.println("Expected exponents: {0}");
        printArray(result.exponents);     // Print actual exponents
    }
    
    public static void testMultiplyCase13() {
        double[] coeff1 = {3, 5}; 
        int[] exp1 = {1, 0}; // Polynomial: 3x + 5
        double[] coeff2 = {1, -1}; 
        int[] exp2 = {1, 0}; // Polynomial: x - 1
        Polynomial p1 = new Polynomial(coeff1, exp1);
        Polynomial p2 = new Polynomial(coeff2, exp2);
        
        Polynomial result = p1.multiply(p2);
        System.out.println("Test Multiply Case 13: (3x + 5) * (x - 1)");
        System.out.println("Expected coefficients: {-5, 2, 3}");
        printArray(result.Coefficients); // Print actual coefficients
        System.out.println("Expected exponents: {0, 1, 2}");
        printArray(result.exponents);     // Print actual exponents
    }
    
    public static void testMultiplyCase14() {
        double[] coeff1 = {2, 4}; 
        int[] exp1 = {3, 1}; // Polynomial: 2x^3 + 4x
        double[] coeff2 = {1}; 
        int[] exp2 = {2}; // Polynomial: x^2
        Polynomial p1 = new Polynomial(coeff1, exp1);
        Polynomial p2 = new Polynomial(coeff2, exp2);
        
        Polynomial result = p1.multiply(p2);
        System.out.println("Test Multiply Case 14: (2x^3 + 4x) * (x^2)");
        System.out.println("Expected coefficients: {4, 2}");
        printArray(result.Coefficients); // Print actual coefficients
        System.out.println("Expected exponents: {3, 5}");
        printArray(result.exponents);     // Print actual exponents
    }
    
    public static void testMultiplyCase15() {
        double[] coeff1 = {1, -1}; 
        int[] exp1 = {1, 0}; // Polynomial: x - 1
        double[] coeff2 = {2, 3}; 
        int[] exp2 = {2, 1}; // Polynomial: 2x^2 + 3x
        Polynomial p1 = new Polynomial(coeff1, exp1);
        Polynomial p2 = new Polynomial(coeff2, exp2);
        
        Polynomial result = p1.multiply(p2);
        System.out.println("Test Multiply Case 15: (x - 1) * (2x^2 + 3x)");
        System.out.println("Expected coefficients: {-3, 1, 2}");
        printArray(result.Coefficients); // Print actual coefficients
        System.out.println("Expected exponents: {1, 2, 3}");
        printArray(result.exponents);     // Print actual exponents
    }
    public static void testMultiplyCase16() {
        double[] coeff1 = {0.5, 1.5}; 
        int[] exp1 = {2, 1}; // Polynomial: 0.5x^2 + 1.5x
        double[] coeff2 = {4.0, -2.0}; 
        int[] exp2 = {1, 0}; // Polynomial: 4x - 2
        Polynomial p1 = new Polynomial(coeff1, exp1);
        Polynomial p2 = new Polynomial(coeff2, exp2);
        
        Polynomial result = p1.multiply(p2);
        System.out.println("Test Multiply Case 16: (0.5x^2 + 1.5x) * (4x - 2)");
        System.out.println("Expected coefficients: {2.0, 5.0, -3.0}");
        printArray(result.Coefficients); // Print actual coefficients
        System.out.println("Expected exponents: {3, 2, 1}");
        printArray(result.exponents);     // Print actual exponents
    }

    public static void testMultiplyCase17() {
        double[] coeff1 = {2.5, 3.0}; 
        int[] exp1 = {1, 0}; // Polynomial: 2.5x + 3
        double[] coeff2 = {1.0, 4.0}; 
        int[] exp2 = {2, 1}; // Polynomial: x^2 + 4x
        Polynomial p1 = new Polynomial(coeff1, exp1);
        Polynomial p2 = new Polynomial(coeff2, exp2);
        
        Polynomial result = p1.multiply(p2);
        System.out.println("Test Multiply Case 17: (2.5x + 3) * (x^2 + 4x)");
        System.out.println("Expected coefficients: {2.5, 13.0, 12.0}");
        printArray(result.Coefficients); // Print actual coefficients
        System.out.println("Expected exponents: {3, 2, 1}");
        printArray(result.exponents);     // Print actual exponents
    }

    public static void testMultiplyCase18() {
        double[] coeff1 = {1.0, -2.0}; 
        int[] exp1 = {3, 1}; // Polynomial: x^3 - 2x
        double[] coeff2 = {3.0, 0.5}; 
        int[] exp2 = {0, 2}; // Polynomial: 3 + 0.5x^2
        Polynomial p1 = new Polynomial(coeff1, exp1);
        Polynomial p2 = new Polynomial(coeff2, exp2);
        
        Polynomial result = p1.multiply(p2);
        System.out.println("Test Multiply Case 18: (x^3 - 2x) * (3 + 0.5x^2)");
        System.out.println("Expected coefficients: {0.5,2,-6}");
        printArray(result.Coefficients); // Print actual coefficients
        System.out.println("Expected exponents: {5, 3, 1}");
        printArray(result.exponents);     // Print actual exponents
    }
    
    public static void testMultiplyByOne() {
        double[] coeff1 = {3, 4}; 
        int[] exp1 = {2, 1}; // Polynomial: 3x^2 + 4x
        double[] coeff2 = {1}; 
        int[] exp2 = {0}; // Polynomial: 1
        Polynomial p1 = new Polynomial(coeff1, exp1);
        Polynomial p2 = new Polynomial(coeff2, exp2);
        
        Polynomial result = p1.multiply(p2);
        System.out.println("Test Multiply By One: (3x^2 + 4x) * 1");
        System.out.println("Expected coefficients: {3, 4}");
        printArray(result.Coefficients); // Print actual coefficients
        System.out.println("Expected exponents: {2, 1}");
        printArray(result.exponents);     // Print actual exponents
       
    }
    
    public static void testMultiplyByZero() {
        double[] coeff1 = {1, 2}; 
        int[] exp1 = {2, 0}; // Polynomial: x^2 + 2
        double[] coeff2 = {0}; 
        int[] exp2 = {0}; // Polynomial: 0
        Polynomial p1 = new Polynomial(coeff1, exp1);
        Polynomial p2 = new Polynomial(coeff2, exp2);
        
        Polynomial result = p1.multiply(p2);
        System.out.println("Test Multiply By Zero: (x^2 + 2) * 0");
        printArray(result.Coefficients); // Print actual coefficients
        System.out.println("Expected coefficients: {0}");
        printArray(result.exponents);     // Print actual exponents
        System.out.println("Expected exponents: {0}");
    }
    public static void testHighDegreePolynomialsAllZero() {
        // High degree polynomial with all coefficients as zero
        double[] coeff1 = {0, 0, 0, 0, 0}; // Represents 0x^4 + 0x^3 + 0x^2 + 0x + 0
        int[] exp1 = {4, 3, 2, 1, 0}; // Degrees: 4, 3, 2, 1, 0
        
        double[] coeff2 = {0, 0, 0}; // Represents 0x^2 + 0x + 0
        int[] exp2 = {2, 1, 0}; // Degrees: 2, 1, 0
        
        Polynomial p1 = new Polynomial(coeff1, exp1);
        Polynomial p2 = new Polynomial(coeff2, exp2);
        
        Polynomial result = p1.multiply(p2);
        System.out.println("Test High-Degree Polynomials All Zero: (0 + 0x + 0x^2 + 0x^3 + 0x^4) * (0 + 0x + 0x^2)");
        
        // Expected result should be a zero polynomial
        System.out.println("Expected coefficients: {0}");
        printArray(result.Coefficients); // Should print {0}
        
        System.out.println("Expected exponents: {0}");
        printArray(result.exponents); // Should print {0}
    }
    public static void testMultiplyTwoPolynomialsResultingInZero() {
        double[] coeff1 = {0}; // Represents 0
        int[] exp1 = {0}; // Polynomial: 0
        double[] coeff2 = {0}; 
        int[] exp2 = {0}; // Polynomial: 0
        Polynomial p1 = new Polynomial(coeff1, exp1);
        Polynomial p2 = new Polynomial(coeff2, exp2);
        
        Polynomial result = p1.multiply(p2);
        System.out.println("Test Multiply Two Polynomials Resulting In Zero: 0 * 0");
        printArray(result.Coefficients); // Should print {0}
        printArray(result.exponents);     // Should print {0}
    }
    public static void testMultiplyNegativeCoefficients() {
        double[] coeff1 = {-1, 3}; // Represents -1x + 3
        int[] exp1 = {1, 0}; // Polynomial: -x + 3
        double[] coeff2 = {2}; 
        int[] exp2 = {0}; // Polynomial: 2
        Polynomial p1 = new Polynomial(coeff1, exp1);
        Polynomial p2 = new Polynomial(coeff2, exp2);
        
        Polynomial result = p1.multiply(p2);
        System.out.println("Test Multiply Negative Coefficients: (-x + 3) * 2");
        System.out.println("Expected Coefficients: 6,-2");
        printArray(result.Coefficients); // Should print {-2, 6}
        System.out.println("Expected Coefficients: 0,1");
        printArray(result.exponents);     // Should print {1, 0}
    }
    public static void readfiletestCase1(){
        File file = new File("./polynomial1.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 1");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase2(){
        File file = new File("./polynomial2.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 2");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase3(){
        File file = new File("./polynomial3.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 3");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase4(){
        File file = new File("./polynomial4.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 4");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase5() {
    	File file = new File("./polynomial5.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 5");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase6() {
    	File file = new File("./polynomial6.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 6");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase7() {
    	File file = new File("./polynomial7.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 7");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase8() {
    	File file = new File("./polynomial8.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 8");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase9() {
    	File file = new File("./polynomial9.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 9");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase10() {
    	File file = new File("./polynomial10.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 10");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase11() {
    	File file = new File("./polynomial11.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 11");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase12() {
    	File file = new File("./polynomial12.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 12");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase13() {
    	File file = new File("./polynomial13.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 13");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase14() {
    	File file = new File("./polynomial14.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 14");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase15() {
    	File file = new File("./polynomial15.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 15");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase16() {
    	File file = new File("./polynomial16.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 16");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase17() {
    	File file = new File("./polynomial17.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 17");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase18() {
    	File file = new File("./polynomial18.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 18");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase19() {
    	File file = new File("./polynomial19.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 19");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase20() {
    	File file = new File("./polynomial20.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 20");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void readfiletestCase21() {
    	File file = new File("./polynomial21.txt");
        Polynomial p = new Polynomial(file);
        System.out.println("Read File Test Case 21");
        printArray(p.Coefficients);
        printArray(p.exponents);
    }

    public static void PolynomialToStringCase1(){
    	double[] coefficient = {-1,3};
    	int [] exponent = {0,1};
    	Polynomial p = new Polynomial(coefficient,exponent);
    	String pString = p.convertPolynomialtoString();
    	System.out.println("Expected:-1+3x");
    	System.out.println("	The output is "+ pString);
    }

    public static void PolynomialToStringCase2() {
        double[] coefficients = {0, 2, -4};
        int[] exponents = {0, 1, 2};
        Polynomial p = new Polynomial(coefficients, exponents);
        String pString = p.convertPolynomialtoString();
        System.out.println("Expected: 2x-4x2");
        System.out.println("	The output is " + pString);
    }

    public static void PolynomialToStringCase3() {
        double[] coefficients = {1, 0, 2};
        int[] exponents = {0, 1, 2};
        Polynomial p = new Polynomial(coefficients, exponents);
        String pString = p.convertPolynomialtoString();
        System.out.println("Expected: 1+2x2");
        System.out.println("	The output is " + pString);
    }

    public static void PolynomialToStringCase4() {
        double[] coefficients = {0, 3, 5};
        int[] exponents = {0, 1, 0}; // 5 is a constant term
        Polynomial p = new Polynomial(coefficients, exponents);
        String pString = p.convertPolynomialtoString();
        System.out.println("Expected: 3x+5");
        System.out.println("	The output is " + pString);
    }

    public static void PolynomialToStringCase5() {
        double[] coefficients = {2.5, -1.5, 0, 4};
        int[] exponents = {0, 1, 2, 3};
        Polynomial p = new Polynomial(coefficients, exponents);
        String pString = p.convertPolynomialtoString();
        System.out.println("Expected: 2.5-1.5x+4x3");
        System.out.println("	The output is " + pString);
    }

    public static void PolynomialToStringEdgeCase1() {
        double[] coefficients = {0, 0, 0};
        int[] exponents = {0, 1, 2};
        Polynomial p = new Polynomial(coefficients, exponents);
        String pString = p.convertPolynomialtoString();
        System.out.println("Expected: 0");
        System.out.println("	The output is " + pString);
    }

    public static void PolynomialToStringEdgeCase2() {
        double[] coefficients = {5};
        int[] exponents = {0};
        Polynomial p = new Polynomial(coefficients, exponents);
        String pString = p.convertPolynomialtoString();
        System.out.println("Expected: 5");
        System.out.println("	The output is " + pString);
    }

    public static void PolynomialToStringEdgeCase3() {
        double[] coefficients = {-3};
        int[] exponents = {0};
        Polynomial p = new Polynomial(coefficients, exponents);
        String pString = p.convertPolynomialtoString();
        System.out.println("Expected: -3");
        System.out.println("	The output is " + pString);
    }

    public static void PolynomialToStringEdgeCase4() {
        double[] coefficients = {3, -2, 1};
        int[] exponents = {2, 1, 0}; 
        Polynomial p = new Polynomial(coefficients, exponents);
        String pString = p.convertPolynomialtoString();
        System.out.println("Expected: 3x2-2x+1");
        System.out.println("	The output is " + pString);
    }
    public static void saveToFileCase1() {
    	String filename = "./FileCase1.txt";  
    	double[] coefficients = {3, -2, 1};
        int[] exponents = {2, 1, 0}; 
    	Polynomial poly1 = new Polynomial(coefficients, exponents); 
    	System.out.println("Expected:3x2-2x+1");
    	poly1.saveToFile(filename);  
    	
    	System.out.println("	Polynomial saved to " + filename);
    }
    public static void saveToFileCase2() {
        String filename = "./FileCase2.txt";  
        double[] coefficients = {0, 0, 5}; 
        int[] exponents = {0, 1, 2}; 
        Polynomial poly2 = new Polynomial(coefficients, exponents); 
        poly2.saveToFile(filename);  
        System.out.println("Expected:5x2");
        System.out.println("	Polynomial saved to " + filename);
    }

    public static void saveToFileCase3() {
        String filename = "./FileCase3.txt";  
        double[] coefficients = {4, -3, 2, 0};  // A polynomial with positive and negative coefficients
        int[] exponents = {3, 2, 1, 0}; 
        Polynomial poly3 = new Polynomial(coefficients, exponents); // Example polynomial
        poly3.saveToFile(filename);  // Call the saveToFile method
        System.out.println("Expected:4x3-3x2+2x");
        System.out.println("	Polynomial saved to " + filename);
    }

    public static void saveToFileCase4() {
        String filename = "./FileCase4.txt";  // Added .txt extension
        double[] coefficients = {1.5, 0, -2.75};  // A polynomial with decimal coefficients
        int[] exponents = {2, 1, 0}; 
        Polynomial poly4 = new Polynomial(coefficients, exponents); // Example polynomial
        poly4.saveToFile(filename);  // Call the saveToFile method
        System.out.println("Expected:1.5x2-2.75");
        System.out.println("	Polynomial saved to " + filename);
    }

    public static void saveToFileCase5() {
        String filename = "./FileCase5.txt";  // Added .txt extension
        double[] coefficients = {0, 0, 0};  // A polynomial where all coefficients are zero
        int[] exponents = {0, 1, 2}; 
        Polynomial poly5 = new Polynomial(coefficients, exponents); // Example polynomial
        poly5.saveToFile(filename);  // Call the saveToFile method
        System.out.println("Expected:0");
        System.out.println("	Polynomial saved to " + filename);
    }

    public static void saveToFileCase6() {
        String filename = "./FileCase6.txt";  // Added .txt extension
        double[] coefficients = {6};  // A polynomial with a single constant term
        int[] exponents = {0}; 
        Polynomial poly6 = new Polynomial(coefficients, exponents); // Example polynomial
        poly6.saveToFile(filename);  // Call the saveToFile method
        System.out.println("Expected:6");
        System.out.println("	Polynomial saved to " + filename);
    }

    public static void saveToFileCase7() {
        String filename = "./FileCase7.txt"; 
        double[] coefficients = {2, 1, -1};  // A polynomial with mixed coefficients
        int[] exponents = {3, 1, 0}; 
        Polynomial poly7 = new Polynomial(coefficients, exponents); // Example polynomial
        poly7.saveToFile(filename);  // Call the saveToFile method
        System.out.println("Expected:2x3+x-1");
        System.out.println("	Polynomial saved to " + filename);
    }
    public static void saveToFileCase8() {
        String filename = "./FileCase8.txt";
        double[] coefficients = {};  // No terms in the polynomial
        int[] exponents = {}; 
        Polynomial poly8 = new Polynomial(coefficients, exponents); 
        poly8.saveToFile(filename);  
        System.out.println("Expected: (no polynomial)");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileCase9() {
        String filename = "./FileCase9.txt";
        double[] coefficients = {0, 0, 5};  
        int[] exponents = {0, 1, 2}; 
        Polynomial poly9 = new Polynomial(coefficients, exponents); 
        poly9.saveToFile(filename);  
        System.out.println("Expected: 5x^2");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileCase10() {
        String filename = "./FileCase10.txt";
        double[] coefficients = {-3, 2};  
        int[] exponents = {1, 0}; 
        Polynomial poly10 = new Polynomial(coefficients, exponents); 
        poly10.saveToFile(filename);  
        System.out.println("Expected: -3x + 2");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileCase11() {
        String filename = "./FileCase11.txt";
        double[] coefficients = {1, -1, 2.5};  
        int[] exponents = {3, 2, 1}; 
        Polynomial poly11 = new Polynomial(coefficients, exponents); 
        poly11.saveToFile(filename);  
        System.out.println("Expected: x^3 - x^2 + 2.5x");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileCase12() {
        String filename = "./FileCase12.txt";
        double[] coefficients = {1.5, -2.3, 4.0};  
        int[] exponents = {2, 1, 0}; 
        Polynomial poly12 = new Polynomial(coefficients, exponents); 
        poly12.saveToFile(filename);  
        System.out.println("Expected: 1.5x^2 - 2.3x + 4.0");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileCase13() {
        String filename = "./FileCase13.txt";
        double[] coefficients = {3.2, 0.7, -1};  
        int[] exponents = {3, 2, 1}; 
        Polynomial poly13 = new Polynomial(coefficients, exponents); 
        poly13.saveToFile(filename);  
        System.out.println("Expected: 3.2x^3 + 0.7x^2 - x");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileCase14() {
        String filename = "./FileCase14.txt";
        double[] coefficients = {-2.5, -3.5};  
        int[] exponents = {1, 0}; 
        Polynomial poly14 = new Polynomial(coefficients, exponents); 
        poly14.saveToFile(filename);  
        System.out.println("Expected: -2.5x - 3.5");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileCase15() {
        String filename = "./FileCase15.txt";
        double[] coefficients = {1000.75, -250.5};  
        int[] exponents = {2, 0}; 
        Polynomial poly15 = new Polynomial(coefficients, exponents); 
        poly15.saveToFile(filename);  
        System.out.println("Expected: 1000.75x^2 - 250.5");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileCase16() {
        String filename = "./FileCase16.txt";
        double[] coefficients = {2, 3};  
        int[] exponents = {2, 2}; 
        Polynomial poly15 = new Polynomial(coefficients, exponents); 
        poly15.saveToFile(filename);  
        System.out.println("Expected: 5x^2");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileCase17() {
        String filename = "./FileCase17.txt";
        double[] coefficients = {1, 1};  
        int[] exponents = {1, 1}; 
        Polynomial poly = new Polynomial(coefficients, exponents); 
        poly.saveToFile(filename);  
        System.out.println("Expected: 2x");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileCase18() {
        String filename = "./FileCase18.txt";
        double[] coefficients = {5, 0, -5};  
        int[] exponents = {3, 3, 3}; 
        Polynomial poly = new Polynomial(coefficients, exponents); 
        poly.saveToFile(filename);  
        System.out.println("Expected: 0");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileCase19() {
        String filename = "./FileCase19.txt";
        double[] coefficients = {0, 0, 0};  
        int[] exponents = {2, 3, 4}; 
        Polynomial poly = new Polynomial(coefficients, exponents); 
        poly.saveToFile(filename);  
        System.out.println("Expected: 0");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileCase20() {
        String filename = "./FileCase20.txt";
        double[] coefficients = {2, -3, 5, -2};  
        int[] exponents = {10, 10, 5, 5}; 
        Polynomial poly = new Polynomial(coefficients, exponents); 
        poly.saveToFile(filename);  
        System.out.println("Expected: -x^10 + 3x^5");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileCase21() {
        String filename = "./FileCase21.txt";
        double[] coefficients = {4, 3};  
        int[] exponents = {6, 5}; 
        Polynomial poly = new Polynomial(coefficients, exponents); 
        poly.saveToFile(filename);  
        System.out.println("Expected: 4x^6 + 3x^5");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileCase22() {
        String filename = "./FileCase22.txt";
        double[] coefficients = {1, -1};  
        int[] exponents = {4, 4}; 
        Polynomial poly = new Polynomial(coefficients, exponents); 
        poly.saveToFile(filename);  
        System.out.println("Expected: 0");
        System.out.println("    Polynomial saved to " + filename);
    }
    
    public static void saveToFileCase23() {
        String filename = "./FileCase23.txt";
        double[] coefficients = {3, -3, 5, -5, 2, -2, 4, -4};  
        int[] exponents = {6, 6, 4, 4, 2, 2, 1, 1}; 
        Polynomial poly = new Polynomial(coefficients, exponents); 
        poly.saveToFile(filename);  
        System.out.println("Expected: 0");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileCase24() {
        String filename = "./FileCase24.txt";
        double[] coefficients = {0, 0, 0};  
        int[] exponents = {4, 2, 1}; 
        Polynomial poly = new Polynomial(coefficients, exponents); 
        poly.saveToFile(filename);  
        System.out.println("Expected: 0");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileCase25() {
        String filename = "./FileCase25.txt";
        double[] coefficients = {5};  
        int[] exponents = {0}; 
        Polynomial poly = new Polynomial(coefficients, exponents); 
        poly.saveToFile(filename);  
        System.out.println("Expected: 5");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileCase26() {
        String filename = "./FileCase26.txt";
        double[] coefficients = {2, -3};  
        int[] exponents = {100, 99}; 
        Polynomial poly = new Polynomial(coefficients, exponents); 
        poly.saveToFile(filename);  
        System.out.println("Expected: 2x^100 - 3x^99");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileCase27() {
        String filename = "./FileCase27.txt";
        double[] coefficients = {2, -2};  
        int[] exponents = {3, 3}; 
        Polynomial poly = new Polynomial(coefficients, exponents); 
        poly.saveToFile(filename);  
        System.out.println("Expected: 0");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileCase28() {
        String filename = "./FileCase28.txt";
        double[] coefficients = {1.5, -2.75};  
        int[] exponents = {2, 1}; 
        Polynomial poly = new Polynomial(coefficients, exponents); 
        poly.saveToFile(filename);  
        System.out.println("Expected: 1.5x^2 - 2.75x");
        System.out.println("    Polynomial saved to " + filename);
    }
    public static void saveToFileEdgeCase1() {
        String filename = "./FileEdgeCase1.txt";  // Added .txt extension
        double[] coefficients = {0};  // A polynomial with a single zero coefficient
        int[] exponents = {0}; 
        Polynomial poly1 = new Polynomial(coefficients, exponents); // Example polynomial
        poly1.saveToFile(filename);  // Call the saveToFile method
        System.out.println("Expected:0");
        System.out.println("	Polynomial saved to " + filename);  // Expected to save "0"
    }

    public static void saveToFileEdgeCase2() {
        String filename = "./FileEdgeCase2.txt";  // Added .txt extension
        double[] coefficients = {0, 0, 0};  // All zero coefficients
        int[] exponents = {0, 1, 2}; 
        Polynomial poly2 = new Polynomial(coefficients, exponents); // Example polynomial
        poly2.saveToFile(filename);  // Call the saveToFile method
        System.out.println("Expected:0");
        System.out.println("	Polynomial saved to " + filename);  // Expected to save "0"
    }

    public static void saveToFileEdgeCase3() {
        String filename = "./FileEdgeCase3.txt";  // Added .txt extension
        double[] coefficients = {1};  // A polynomial with a single non-zero coefficient
        int[] exponents = {0}; 
        Polynomial poly3 = new Polynomial(coefficients, exponents); // Example polynomial
        poly3.saveToFile(filename);  // Call the saveToFile method
        System.out.println("Expected:1");
        System.out.println("	Polynomial saved to " + filename);  // Expected to save "1"
    }

    public static void saveToFileEdgeCase4() {
        String filename = "./FileEdgeCase4.txt";  // Added .txt extension
        double[] coefficients = {-3};  // A polynomial with a single negative coefficient
        int[] exponents = {0}; 
        Polynomial poly4 = new Polynomial(coefficients, exponents); // Example polynomial
        poly4.saveToFile(filename);  // Call the saveToFile method
        System.out.println("Expected:-3");
        System.out.println("	Polynomial saved to " + filename);  // Expected to save "-3"
    }

    public static void saveToFileEdgeCase5() {
        String filename = "./FileEdgeCase5.txt";  // Added .txt extension
        double[] coefficients = {1, 0, -1};  // A polynomial with a zero term in between
        int[] exponents = {2, 1, 0}; 
        Polynomial poly5 = new Polynomial(coefficients, exponents); // Example polynomial
        poly5.saveToFile(filename);  // Call the saveToFile method
        System.out.println("Expected:x2-1");
        System.out.println("	Polynomial saved to " + filename);  // Expected to save "1x^2-1"
    }

    public static void saveToFileEdgeCase6() {
        String filename = "./FileEdgeCase6.txt";  // Added .txt extension
        double[] coefficients = {0, 2};  // A polynomial that starts with zero
        int[] exponents = {1, 0}; 
        Polynomial poly6 = new Polynomial(coefficients, exponents); // Example polynomial
        poly6.saveToFile(filename);  // Call the saveToFile method
        System.out.println("Expected:2");
        System.out.println("	Polynomial saved to " + filename);  // Expected to save "2"
    }

    public static void saveToFileEdgeCase7() {
        String filename = "./FileEdgeCase7.txt";  // Added .txt extension
        double[] coefficients = {0, 5, -2};  // Mixed zero and non-zero coefficients
        int[] exponents = {0, 1, 0}; 
        Polynomial poly7 = new Polynomial(coefficients, exponents); // Example polynomial
        poly7.saveToFile(filename);  // Call the saveToFile method
        System.out.println("Expected:5x-2");
        System.out.println("	Polynomial saved to " + filename);  // Expected to save "5"
    }
    public static void evaluatetest1() {
    	double[] coefficients = {0,5,-2};
    	int[] exponents = {0,1,0};
    	Polynomial poly1 = new Polynomial(coefficients,exponents);
    	double result = poly1.evaluate(2.0);
    	if(result == 8.0) {
    		System.out.println("Passed evaluate #1");
    	}
    	else {
    		System.out.println("Failed evaluate #1");
    	}
    }
    public static void evaluatetest2() {
        // Test Case 1: 3.5x + 1, x = 2
        double[] coefficients2 = { 1, 3.5 };
        int[] exponents2 = { 0, 1 };
        Polynomial poly2 = new Polynomial(coefficients2, exponents2);
        double result2 = poly2.evaluate(2.0);
        if(result2 == 8.0) {
            System.out.println("Passed evaluate #2");
        } else {
            System.out.println("Failed evaluate #2");
        }
    }
    public static void evaluatetest3() {
        // Test Case 2: 4x^2 - 1, x = 2
        double[] coefficients3 = { -1, 0, 4 };
        int[] exponents3 = { 0, 1, 2 };
        Polynomial poly3 = new Polynomial(coefficients3, exponents3);
        double result3 = poly3.evaluate(2.0);
        if(result3 == 15.0) {
            System.out.println("Passed evaluate #3");
        } else {
            System.out.println("Failed evaluate #3");
        }
    }

    public static void evaluatetest4() {
        // Test Case 3: -2.5x + 3, x = 4
        double[] coefficients4 = { 3, -2.5 };
        int[] exponents4 = { 0, 1 };
        Polynomial poly4 = new Polynomial(coefficients4, exponents4);
        double result4 = poly4.evaluate(4.0);
        if(result4 == -7.0) {
            System.out.println("Passed evaluate #4");
        } else {
            System.out.println("Failed evaluate #4");
        }
    }

    public static void evaluatetest5() {
        // Test Case 4: 0.5x^3 - 2x + 1, x = 2
        double[] coefficients5 = { 1, -2, 0, 0.5 };
        int[] exponents5 = { 0, 1, 2, 3 };
        Polynomial poly5 = new Polynomial(coefficients5, exponents5);
        double result5 = poly5.evaluate(2.0);
        if(result5 == 1.0) {
            System.out.println("Passed evaluate #5");
        } else {
            System.out.println("Failed evaluate #5");
        }
    }
    public static void evaluatetest6() {
        // Test Case 5: 1.0 - x, x = 1
        double[] coefficients6 = { 1.0, -1.0 };
        int[] exponents6 = { 0, 1 };
        Polynomial poly6 = new Polynomial(coefficients6, exponents6);
        double result6 = poly6.evaluate(1.0);
        if(result6 == 0.0) {
            System.out.println("Passed evaluate #6");
        } else {
            System.out.println("Failed evaluate #6");
        }
    }

    public static void evaluatetest7() {
        // Test Case 6: 2x^2 + 3x - 5, x = 1
        double[] coefficients7 = { -5, 3, 2 };
        int[] exponents7 = { 0, 1, 2 };
        Polynomial poly7 = new Polynomial(coefficients7, exponents7);
        double result7 = poly7.evaluate(1.0);
        if(result7 == 0.0) {
            System.out.println("Passed evaluate #7");
        } else {
            System.out.println("Failed evaluate #7");
        }
    }

    public static void evaluatetest8() {
        // Test Case 7: 0, x = 10
        double[] coefficients8 = { 0 };
        int[] exponents8 = { 0 };
        Polynomial poly8 = new Polynomial(coefficients8, exponents8);
        double result8 = poly8.evaluate(10.0);
        if(result8 == 0.0) {
            System.out.println("Passed evaluate #8");
        } else {
            System.out.println("Failed evaluate #8");
        }
    }
    public static void combineandRemoveDuplicatesTest1() {
        double[] coefficients = {2,3,2};
        int[] exponents = {1,2,1};
        Polynomial p = new Polynomial(coefficients,exponents);
        p = p.combineandRemoveDuplicates(p);
        System.out.println("Expected : {4,3}");
        printArray(p.Coefficients);
        System.out.println("Expected : {1,2}");
        printArray(p.exponents);
    }
    public static void combineandRemoveDuplicatesTest2() {
        double[] coefficients = {5, 0, -3, 5};
        int[] exponents = {3, 2, 1, 3};
        Polynomial p = new Polynomial(coefficients, exponents);
        p = p.combineandRemoveDuplicates(p);
        System.out.println("Expected : {10, -3}"); // 10 for exponent 3, -3 for exponent 1
        printArray(p.Coefficients);
        System.out.println("Expected : {3, 1}");   // Exponents 3 and 1
        printArray(p.exponents);
    }

    public static void combineandRemoveDuplicatesTest3() {
        double[] coefficients = {4, -1, 4, 2};
        int[] exponents = {2, 2, 1, 0};
        Polynomial p = new Polynomial(coefficients, exponents);
        p = p.combineandRemoveDuplicates(p);
        System.out.println("Expected : {2, 4, 3}"); // 7 for exponent 2, -1 for exponent 1, 2 for exponent 0
        printArray(p.Coefficients);
        System.out.println("Expected : {0, 1, 2}");   // Exponents 2, 1, and 0
        printArray(p.exponents);
    }

    public static void combineandRemoveDuplicatesTest4() {
        double[] coefficients = {1, 1, 1};
        int[] exponents = {4, 4, 4};
        Polynomial p = new Polynomial(coefficients, exponents);
        p = p.combineandRemoveDuplicates(p);
        System.out.println("Expected : {3}"); // 3 for exponent 4
        printArray(p.Coefficients);
        System.out.println("Expected : {4}");   // Exponent 4
        printArray(p.exponents);
    }

    public static void combineandRemoveDuplicatesTest5() {
        double[] coefficients = {0, 0, 0};
        int[] exponents = {1, 2, 3};
        Polynomial p = new Polynomial(coefficients, exponents);
        p = p.combineandRemoveDuplicates(p);
        System.out.println("Expected : {}"); // No non-zero coefficients or exponents
        printArray(p.Coefficients);
        System.out.println("Expected : {}");   // No exponents
        printArray(p.exponents);
    }

    public static void combineandRemoveDuplicatesTest6() {
        double[] coefficients = {7, 2, 5};
        int[] exponents = {3, 3, 4};
        Polynomial p = new Polynomial(coefficients, exponents);
        p = p.combineandRemoveDuplicates(p);
        System.out.println("Expected : {9, 5}"); // 9 for exponent 3, 5 for exponent 4
        printArray(p.Coefficients);
        System.out.println("Expected : {3, 4}");   // Exponents 3 and 4
        printArray(p.exponents);
    }
    public static void combineandRemoveDuplicatesTest7() {
        double[] coefficients = {3, 0, 4, 3};
        int[] exponents = {5, 5, 3, 5}; // Coefficient 0 should be ignored
        Polynomial p = new Polynomial(coefficients, exponents);
        p = p.combineandRemoveDuplicates(p);
        System.out.println("Expected : {6, 4}"); // 6 for exponent 5, 4 for exponent 3
        printArray(p.Coefficients);
        System.out.println("Expected : {5, 3}");   // Exponents 5 and 3
        printArray(p.exponents);
    }
    public static void combineandRemoveDuplicatesTest8() {
        double[] coefficients = {0, 0, 0};
        int[] exponents = {1, 2, 3}; // All terms should be removed
        Polynomial p = new Polynomial(coefficients, exponents);
        p = p.combineandRemoveDuplicates(p);
        System.out.println("Expected : {}"); // Empty arrays
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void combineandRemoveDuplicatesTest9() {
        double[] coefficients = {5, 6, 7};
        int[] exponents = {2, 3, 4}; // No duplicates, should stay the same
        Polynomial p = new Polynomial(coefficients, exponents);
        p = p.combineandRemoveDuplicates(p);
        System.out.println("Expected : {5, 6, 7}");
        printArray(p.Coefficients);
        System.out.println("Expected : {2, 3, 4}");
        printArray(p.exponents);
    }
    public static void combineandRemoveDuplicatesTest10() {
        double[] coefficients = {2, -2, 1, -1};
        int[] exponents = {3, 3, 4, 4}; // Terms for exponent 3 and 4 should cancel out
        Polynomial p = new Polynomial(coefficients, exponents);
        p = p.combineandRemoveDuplicates(p);
        System.out.println("Expected : {}"); // All terms cancel out
        printArray(p.Coefficients);
        printArray(p.exponents);
    }
    public static void combineandRemoveDuplicatesTest11() {
        double[] coefficients = {5, 3, 2, 4};
        int[] exponents = {6, 6, 6, 7}; // Combine all exponents 6
        Polynomial p = new Polynomial(coefficients, exponents);
        p = p.combineandRemoveDuplicates(p);
        System.out.println("Expected : {10, 4}"); // 10 for exponent 6, 4 for exponent 7
        printArray(p.Coefficients);
        System.out.println("Expected : {6, 7}");
        printArray(p.exponents);
    }
    public static void combineandRemoveDuplicatesTest12() {
        double[] coefficients = {7, 2, 5};
        int[] exponents = {3, 3, 4}; // Example you provided
        Polynomial p = new Polynomial(coefficients, exponents);
        p = p.combineandRemoveDuplicates(p);
        System.out.println("Expected : {9, 5}"); // 9 for exponent 3, 5 for exponent 4
        printArray(p.Coefficients);
        System.out.println("Expected : {3, 4}");   // Exponents 3 and 4
        printArray(p.exponents);
    }
    public static void combineandRemoveDuplicatesTest13() {
        double[] coefficients = {7, 2, 5};
        int[] exponents = {3, 3, 4}; // Example you provided
        Polynomial p = new Polynomial(coefficients, exponents);
        p = p.combineandRemoveDuplicates(p);
        System.out.println("Expected : {9, 5}"); // 9 for exponent 3, 5 for exponent 4
        printArray(p.Coefficients);
        System.out.println("Expected : {3, 4}");   // Exponents 3 and 4
        printArray(p.exponents);
    }

    
    

    

    




    
    public static void main(String[] args) {
        testDefaultConstructor(); 
        //Argument Constructor
        testArgumentConstructor1();
        testArgumentConstructor2();
        testArgumentConstructor3();
        testArgumentConstructor4();
        testArgumentConstructor5();
        testArgumentConstructor6();
        testArgumentConstructor7();
        testArgumentConstructor8();
        testArgumentConstructor9();
        testArgumentConstructor10();
        testArgumentConstructor11();
        testArgumentConstructor12();
        testArgumentConstructor13();
        testArgumentConstructor14();
        //Append Exponents
        testappendExponents1();
        testappendExponents2();
        testappendExponents3();
        testappendExponents4();
        testappendExponents5();
        testappendExponents6();
        testappendExponents7();
        testappendExponents8();
        testappendExponents9();
        testappendExponents10();
        testappendExponents11();
        testappendExponents12();
        testappendExponents13();
        //testAscendingCoefficientAndExponent
        testAscendingCoefficientAndExponent1();
        testAscendingCoefficientAndExponent2();
        testAscendingCoefficientAndExponent3();
        testAscendingCoefficientAndExponent4();
        testAscendingCoefficientAndExponent5();
        testAscendingCoefficientAndExponent6();
        testAscendingCoefficientAndExponent7();
        testAscendingCoefficientAndExponent8();
        testAscendingCoefficientAndExponent9();
        testAscendingCoefficientAndExponent10();
        testAscendingCoefficientAndExponent11();
        testAscendingCoefficientAndExponent12();
        //testadd
        testAddCase1();
        testAddCase2();
        testAddCase3();
        testAddCase4();
        testAddCase5();
        //test root
        hasRootCase1();
        hasRootCase2();
        hasRootCase3();
        hasRootCase4();
        hasRootCase5();
        //test simplify
        testSimplifyPolynomialCase1();
        testSimplifyPolynomialCase2();
        testSimplifyPolynomialCase3();
        testSimplifyPolynomialCase4();
        testSimplifyPolynomialCase5();
        testSimplifyPolynomialCase6();
        testSimplifyPolynomialCase7();
        testSimplifyPolynomialCase8();
        testSimplifyPolynomialCase9();
        testSimplifyPolynomialCase10();
        testSimplifyPolynomialCase11();
        //test multiply
        testMultiplyCase1();
        testMultiplyCase2();
        testMultiplyCase3();
        testMultiplyCase4();
        testMultiplyCase5(); 
        testMultiplyCase6();
        testMultiplyCase7();
        testMultiplyCase8();
        testMultiplyCase9();
        testMultiplyCase10();
        testMultiplyCase11();
        testMultiplyCase12();
        testMultiplyCase13();
        testMultiplyCase14();
        testMultiplyCase15();
        testMultiplyCase16();
        testMultiplyCase17();
        testMultiplyCase18();
        testMultiplyByOne();
        testMultiplyByZero();
        testHighDegreePolynomialsAllZero();
        testMultiplyTwoPolynomialsResultingInZero();
        testMultiplyNegativeCoefficients();
        //test filetestcase
        readfiletestCase1();
        readfiletestCase2();
        readfiletestCase3();
        readfiletestCase4();
        readfiletestCase5();
        readfiletestCase6();
        readfiletestCase7();
        readfiletestCase8();
        readfiletestCase9();
        readfiletestCase10();
        readfiletestCase11();
        readfiletestCase12();
        readfiletestCase13();
        readfiletestCase14();
        readfiletestCase15();
        readfiletestCase16();
        readfiletestCase17();
        readfiletestCase18();
        readfiletestCase19();
        readfiletestCase20();
        readfiletestCase21();
        //test convert to string
        PolynomialToStringCase1();
        PolynomialToStringCase2(); 
        PolynomialToStringCase3(); 
        PolynomialToStringCase4(); 
        PolynomialToStringCase5(); 
        PolynomialToStringEdgeCase1(); 
        PolynomialToStringEdgeCase2(); 
        PolynomialToStringEdgeCase3(); 
        PolynomialToStringEdgeCase4();
        //test convert to file
        saveToFileCase1();
        saveToFileCase2();
        saveToFileCase3();
        saveToFileCase4();
        saveToFileCase5();
        saveToFileCase6();
        saveToFileCase7();
        saveToFileCase8();
        saveToFileCase9();
        saveToFileCase10();
        saveToFileCase11();
        saveToFileCase12();
        saveToFileCase13();
        saveToFileCase14();
        saveToFileCase15();
        saveToFileCase16();
        saveToFileCase17();
        saveToFileCase18();
        saveToFileCase19();
        saveToFileCase20();
        saveToFileCase21();
        saveToFileCase22();
        saveToFileCase23();
        saveToFileCase24();
        saveToFileCase25();
        saveToFileCase26();
        saveToFileCase27();
        saveToFileCase28();
        saveToFileEdgeCase1();
        saveToFileEdgeCase2();
        saveToFileEdgeCase3();
        saveToFileEdgeCase4();
        saveToFileEdgeCase5();
        saveToFileEdgeCase6();
        saveToFileEdgeCase7();
        //evaluate
        evaluatetest1();
        evaluatetest2();
        evaluatetest3();
        evaluatetest4();
        evaluatetest5();
        evaluatetest6();
        evaluatetest7();
        evaluatetest8();
        combineandRemoveDuplicatesTest1();
        combineandRemoveDuplicatesTest2();
        combineandRemoveDuplicatesTest3();
        combineandRemoveDuplicatesTest4();
        combineandRemoveDuplicatesTest5();
        combineandRemoveDuplicatesTest6();
        combineandRemoveDuplicatesTest7();
        combineandRemoveDuplicatesTest8();
        combineandRemoveDuplicatesTest9();
        combineandRemoveDuplicatesTest10();
        combineandRemoveDuplicatesTest11();
        combineandRemoveDuplicatesTest12();
        combineandRemoveDuplicatesTest13();
        
    }
}
