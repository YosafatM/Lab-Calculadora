
package calculadora;


public class Operaciones {
    private int dato1, dato2;
    
    public int sumar(){
        int total;
        
        total = this.dato1 + this.dato2;
        
        return total;
    }
        
    public int restar(){
        int total;
        
        total = this.dato1 - this.dato2;
        
        return total;
    }
            
    public int division(){
        int total;
        
        total = this.dato1 / this.dato2;
        
        return total;
    }
    
    public int multiplicacion(){
        int total;
        
        total = this.dato1 * this.dato2;
        
        return total;
    }
    
    public void setDatos(int dato1, int dato2){
        this.dato1 = dato1;
        this.dato2 = dato2;
    }
    
}
