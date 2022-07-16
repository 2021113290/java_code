package computer_test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-16
 * Time: 9:21
 */
public class Computer {
    public void powerOn(){
        System.out.println("电脑开机");
    }
    public void powerOff(){
        System.out.println("电脑关机");
    }
    public void useDevice(USB usb){
        usb.open();
//        if (usb instanceof Mouse){
//            Mouse mouse=(Mouse) usb;
//            mouse.click();
//        }else if (usb instanceof Keybroad){
//            Keybroad keybroad=(Keybroad) usb;
//            keybroad.type();
//        }
        usb.work();
        usb.close();
    }
}
