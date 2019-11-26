package excepciones8;

public class Excepciones8 {

        public static void main(String[] args) {
        char ch;
        try{
            //Dado que prompt() podría arrojar una excepción, su llamada debe incluirse dentro de un bloque try-catch
            ch = prompt("Ingresar una letra");
            
        }catch (java.io.IOException exc){
            System.out.println("OCurrió una excepción de E/S");
            ch = 'X';
        }
        System.out.println("Usted presionó : " + ch);
    }
        public static char prompt(String args) throws java.io.IOException{
            System.out.println(args + " :");
            return (char) System.in.read();
        }
    
}
