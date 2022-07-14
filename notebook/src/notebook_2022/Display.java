package notebook_2022;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-14
 * Time: 16:04
 */
public class Display {
    private int value=0;
    private int limit=0;

    public Display(int limit) {
        this.limit = limit;
        value = 0;
    }

    public void increase() {
        value++;
        if (value == limit)
        {
            value = 0;
        }
    }

    public void setValue(int value){
        this.value=value;
    }
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
           /* Scanner input=new Scanner(System.in);
            Clock clock=new Clock(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
            clock.start();

            for(;;) {
                clock.start();
                System.out.println(clock.toString());
            }*/
    }

}
