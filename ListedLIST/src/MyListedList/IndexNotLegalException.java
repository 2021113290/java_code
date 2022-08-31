package MyListedList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-08-30
 * Time: 22:41
 */
public class IndexNotLegalException extends RuntimeException{
        public IndexNotLegalException(){

        }
        public IndexNotLegalException(String msg){
            super(msg);
        }

}
