package mantas.company;

public class Main {

    public static void main(String[] args) {
//        Account bobsAccount = new Account();
//        bobsAccount.withdrawal(100.0);
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100.0);
//
//        Account timsAccount = new Account("Tim", "tm@fd.lt", "12345");
//        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());\
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 2500);


    }
}
