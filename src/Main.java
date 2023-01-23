public class Main {
    public static void main(String[] args) {
        try {
            Credentials.checkCredentials("admin","admin","admin");
        }catch (WrongLoginException|WrongPasswordException e){
            System.out.println("Не верно");
            e.printStackTrace();
        }finally {
            System.out.println("Верно");
        }
    }
}