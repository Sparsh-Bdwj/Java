public class Operator {
    
        public static void main(String[] args) {
            int a = 15, b = 7;
    
            System.out.println("Arithmetic Operators:");
            System.out.println("a + b = " + (a + b)); 
            System.out.println("a - b = " + (a - b)); 
            System.out.println("a * b = " + (a * b)); 
            System.out.println("a / b = " + (a / b)); 
            System.out.println("a % b = " + (a % b)); 
            
            System.out.println("\nRelational Operators:");
            System.out.println("a == b: " + (a == b)); 
            System.out.println("a != b: " + (a != b)); 
            System.out.println("a > b: " + (a > b)); 
            System.out.println("a < b: " + (a < b)); 
            System.out.println("a >= b: " + (a >= b));
            System.out.println("a <= b: " + (a <= b)); 
            
            System.out.println("\nLogical Operators:");
            System.out.println("a > b && a != b: " + (a > b && a != b)); 
            System.out.println("a > b || a == b: " + (a > b || a == b));
            System.out.println("!(a > b): " + !(a > b)); 
        
            System.out.println("\nBitwise Operators:");
            System.out.println("a & b: " + (a & b)); 
            System.out.println("a | b: " + (a | b)); 
            System.out.println("a ^ b: " + (a ^ b)); 
            System.out.println("~a: " + (~a)); 
            
        }
    }
    
