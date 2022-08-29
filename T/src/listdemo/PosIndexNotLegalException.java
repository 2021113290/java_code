package listdemo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-08-29
 * Time: 10:45
 */
public class PosIndexNotLegalException extends RuntimeException{
    public PosIndexNotLegalException(){

    }
    public PosIndexNotLegalException(String msg){
        super(msg);
    }
}
