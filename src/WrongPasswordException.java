public class WrongPasswordException extends Exception {
    public WrongPasswordException(){
    }
    public WrongPasswordException(String massage){
        super(massage);
    }
}
