import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Asset miCasa = new House("Penthouse", "1999", BigDecimal.valueOf(23), "Ozone Parkway", 4, 10_000, 4);
        Asset araba = new Vehicle("Bat-Mobile", "2008", BigDecimal.valueOf(2_000_000), "custom-artisonal-hand-craft", 2000, 300_000);

        System.out.println("House: " + miCasa.getDescription() + "\n  Address: " + miCasa.getDateAcquired());

        System.out.println("Car: " + araba.getDescription() + "\n Cost: " + araba.getOrigionalCost() );

    }
}
