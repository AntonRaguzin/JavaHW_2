public class Main2 {
    public static void main(String[] args) {
        int initialBalance = 120; // начальный баланс на счете в рублях
        int depositAmount = 500; // сумма пополнения в рублях
        int bonusAccount = 100; // количество рублей для получения бонуса в 1 руб
        int bonusRub = depositAmount / bonusAccount; // количество бонусов за пополнение
        System.out.println("Начальный баланс - " + initialBalance + " рубль(ей)");
        System.out.println("Счет пополнен на - " + depositAmount + " рубль(ей)");

        if (depositAmount > 1000) {
            System.out.println("Начислено бонусных рублей - " + bonusRub + " рубль(ей)");
        } else {
            System.out.println("Начислено бонусных рублей - 0 рубль(ей)");
        }

        if (depositAmount > 1000) {
            System.out.println ("Итоговый баланс - " + (initialBalance + depositAmount + bonusRub) + " рубль(ей)");
        } else {
            System.out.println ("Итоговый баланс - " + (initialBalance + depositAmount) + " рубль(ей)");
        }
            }
}
