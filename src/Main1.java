public class Main1 {
    public static void main(String[] args) {
        int ticketPrice = 25700; //стоимость билета в рублях
        int oneMile = 20; // количество рублей за 1 милю
        int milesQuantity = (ticketPrice / oneMile); // количество миль за билет
        System.out.println("Начислено бонусных миль - " + milesQuantity);
    }
}
