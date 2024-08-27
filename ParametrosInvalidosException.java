public class ParametrosInvalidosException extends Exception{
    ParametrosInvalidosException(){
        super();
        System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
    }
}