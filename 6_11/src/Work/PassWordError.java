package Work;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-11
 * Time: 19:12
 */
class NameError extends RuntimeException {
    public NameError() {

    }
    public NameError(String message) {
        super(message);
    }
}
class PassWordError extends RuntimeException{
    public PassWordError() {

    }
    public PassWordError(String message) {
        super(message);
    }
}
