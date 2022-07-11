import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-10
 * Time: 20:24
 */

    public class Clock {

        Display hour=new Display(24);
        Display minute=new Display(60);
        Display second=new Display(60);
        Display day=new Display(32);
        Display month=new Display(12);
        Display year=new Display(10000);

    public Clock(int hour, int minute, int second, int year, int month, int day){
        this.hour.setValue(hour);
        this.minute.setValue(minute);
        this.second.setValue(second);
        this.year.setValue(year);
        this.month.setValue(month);
        this.day.setValue(day);
    }
        /*public Clock() {
            hour = new Display(24);
            minute = new Display(60);
            second=new Display(60);
            day=new Display(32);
            month=new Display(12);
            year=new Display(10000);
        }
*/
        public void start() {
            //for(;;) {
                second.increase();
                if(second.getValue()==0){
                    minute.increase();
                    if (minute.getValue()==0) {
                        hour.increase();
                        if(hour.getValue()==0){
                            day.increase();
                            if (day.getValue()==0){
                                month.increase();
                            }
                            else if ((day.getValue()==28||day.getValue()==27)&&month.getValue()==2){
                                month.increase();
                                day.setValue(0);
                            }
                            if (month.getValue()==0){
                                year.increase();
                            }
                        }
                    }
                }

            }

       // }
        public String toString(){
            return String.format("%02d/%02d/%02d,%02d:%02d:%02d",year.getValue(),month.getValue(),day.getValue(),hour.getValue(),minute.getValue(),second.getValue());
        }

        public static void main(String[] args) {
            // TODO Auto-generated method stub

           /* Clock c = new Clock();
            c.start();*/
            Scanner input=new Scanner(System.in);
            Clock clock=new Clock(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
            for(;;) {
                clock.start();
                System.out.println(clock.toString());
            }

        }

    }


