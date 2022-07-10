import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-09
 * Time: 21:40
 */
public class Client {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();


        while(true){
            System.out.println("1.Cola     2.Beer    3.exit");
            System.out.println("请输入你的选择：");
            Scanner sc=new Scanner(System.in);
            int select = sc.nextInt();
       /* System.out.println("请输入年龄：");

        int age = sc.nextInt();
*/
        //Person person = new Person(age);


        if (select == 1) {
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            Person person = new Person(age);
            vm.showPrompt();
            vm.showBalance();
            System.out.println("输入投入钱的金额：");
            int money = sc.nextInt();
            vm.insertMoney(money);
            vm.showBalance();
            person.BuyCola(vm);
            //vm.showBalance();
        } else if (select == 2) {
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            Person person = new Person(age);
            if (person.age >= 18) {
                vm.showPrompt();
                vm.showBalance();
                System.out.println("输入投入钱的金额：");
                int money = sc.nextInt();
                vm.insertMoney(money);
                vm.showBalance();
                person.BuyBeer(vm);
                //vm.showBalance();
            } else {
                System.out.println("年龄不够，无法买酒！");
                break;
            }
        } else if (select == 3) {
            return;
        }
    }
}
}
