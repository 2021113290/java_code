/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-09
 * Time: 18:05
 */
public class VendingMachine {
     int balance;
     int ColaPrice;
     int BeerPrice;
     int total;

    public VendingMachine() {
        balance = 0;
        ColaPrice = 5;
        BeerPrice=6;
        total = 20;
    }

    /*public VendingMachine(int price) {
        this.price = price;
    }*/


    public void showPrompt(){
        System.out.println("欢迎光临");
    }

    public void showBalance() {
        System.out.println("售货机已投入"+balance+"元");
    }

    public void insertMoney(int amount) {

        balance += amount;
        //System.out.println("售货机已投入"+balance+"元");
    }
   /* public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        VendingMachine vm1 = new VendingMachine();
        vm.showPrompt();
        vm.showBalance();
        vm.insertMoney(10);
        vm.showBalance();
        vm.getCola();
        vm.getBeer(10);
        vm.showBalance();
    }*/

}
