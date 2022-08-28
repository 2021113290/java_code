package computer_test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-16
 * Time: 9:49
 */
public class WirelessMouse extends Mouse implements WirelessUSB,BlueTooth{
   private boolean isBlueTooth;
   public WirelessMouse(boolean isBlueTooth){
       this.isBlueTooth=isBlueTooth;
   }
   public void open(){
       if(isBlueTooth){
           System.out.println("打开蓝牙鼠标");
       }else {
           super.open();
       }
   }
    public void close(){
        if(isBlueTooth){
            System.out.println("关闭蓝牙鼠标");
        }else {
            super.close();
        }
    }
    public boolean connect(){
        if(isBlueTooth){
            System.out.println("无线鼠标蓝牙连接成功");
        }else {
            System.out.println("无线鼠标usb连接成功");
        }
        return true;
    }

    @Override
    public void work() {
       if (this.connect())
       {
           this.click();
       }
    }
}
