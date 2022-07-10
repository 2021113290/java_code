import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-09
 * Time: 20:21
 */
public class Person {
    int age;
    public Person(int age) {
        this.age = age;
    }
    public void BuyCola(VendingMachine vm){
        if (vm.balance>=vm.ColaPrice) {
            vm.balance -= vm.ColaPrice;
            vm.total += vm.ColaPrice;
            System.out.println("给你可乐!");
            vm.showBalance();
        }
        else {
            System.out.println("请投入更多的钱！");
            Scanner sc=new Scanner(System.in);
            int money= sc.nextInt();
            vm.insertMoney(money);

        }
    }
    public  void BuyBeer(VendingMachine vm){
        if (vm.balance>=vm.BeerPrice&&age>=18) {
            vm.balance -= vm.BeerPrice;
            vm.total += vm.BeerPrice;
            System.out.println("给你啤酒!");
            vm.showBalance();
        }
        else {
            if(age<18)
            System.out.println("不满足18岁，无法买酒");
            else {
                System.out.println("请投入更多的钱！");
                Scanner sc=new Scanner(System.in);
                int money= sc.nextInt();
                vm.insertMoney(money);
            }
        }
    }
}
