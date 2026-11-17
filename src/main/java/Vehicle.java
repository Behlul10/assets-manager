import java.math.BigDecimal;

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
    public BigDecimal getValeu() {
        BigDecimal reducedVal = BigDecimal.ZERO;
        switch (this.year) {
            this.year => 0 || this.year <3 -> reducedVal = 0.3;
        }
    }

}
