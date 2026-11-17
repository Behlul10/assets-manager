import java.math.BigDecimal;
import java.time.LocalDate;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, BigDecimal origionalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, origionalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public BigDecimal getValue() {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - this.year;
        BigDecimal value = this.getOrigionalCost();

        // Calculate depreciation based on age
        if (age >= 0 && age <= 3) { // 3% reduction per year
            BigDecimal reduction = value.multiply(BigDecimal.valueOf(0.03)).multiply(BigDecimal.valueOf(age));
            value = value.subtract(reduction);
        } else if (age >= 4 && age <= 6) { // 6% reduction per year
            BigDecimal reduction = value.multiply(BigDecimal.valueOf(0.06)).multiply(BigDecimal.valueOf(age));
            value = value.subtract(reduction);
        } else if (age >= 7 && age <= 10) { // 8% reduction per year
            BigDecimal reduction = value.multiply(BigDecimal.valueOf(0.08)).multiply(BigDecimal.valueOf(age));
            value = value.subtract(reduction);
        } else if (age > 10) { // Over 10 years old - value is $1000.00
            value = new BigDecimal("1000.00");
        }

        // Apply mileage penalty
        if (this.odometer > 100000 && (!this.makeModel.contains("Honda") || !this.makeModel.contains("Toyota"))) {
            // Reduce final value by 25%
            BigDecimal penalty = value.multiply(BigDecimal.valueOf(0.25));
            value = value.subtract(penalty);
        }
        return value;
    }
}
