package gt.edu.umg.ingenieria.sistemas.is.branchexample1;

public class BranchApp {
    
    public static void main(String[] args) {        
        Calculator calc = new Calculator();
        
        int total = calc.add(1500, 600);
        
        System.out.println("El total de la suma es " + total);
    }
    
    
    
}
