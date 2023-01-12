package exception;

public class CustomExceptionTest {

    private String password;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) throws CustomException {

        if(password == null) {
            throw new CustomException("password can't be null");
        }

        if(password.length() <= 3) {
            throw new CustomException("password's length must be over 3");
        }

        this.password = password;
    }

    public static void main(String[] args) {

        CustomExceptionTest ce = new CustomExceptionTest();

        try {
            ce.setPassword(null);
            System.out.println("can't print");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        try {
            ce.setPassword("abc");
            System.out.println("can't print");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

}
