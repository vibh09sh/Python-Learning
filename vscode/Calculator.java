class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public double add(double a, double b, double c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3)); // calls the first method
        System.out.println(calc.add(2, 3, 4)); // calls the second method
        System.out.println(calc.add(2.5, 3.5)); // calls the third method
        System.out.println(calc.add(2.5, 3.5, 4.5)); // calls the fourth method
    }
}
