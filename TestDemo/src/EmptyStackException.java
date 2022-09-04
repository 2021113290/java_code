/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-09-03
 * Time: 20:09
 */
public class EmptyStackException extends RuntimeException {
    public EmptyStackException(){

    }
    public EmptyStackException(String msg){
        super(msg);
    }
}
