package computer_test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-16
 * Time: 9:27
 */
public class TestUSB {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.powerOn();//电脑开机
        USB usbmouse=new Mouse();
        ///USB wirelessmouse=new WirelessMouse(true);
        USB wirelessmouse=new WirelessMouse(false);
        Keybroad keybroad=new Keybroad();
        computer.useDevice(wirelessmouse);
        computer.useDevice(usbmouse);
        computer.powerOff();

    }
}
