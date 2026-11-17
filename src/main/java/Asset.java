import java.math.BigDecimal;
import java.time.LocalDate;

public class Asset {
    private String description;
    private String dateAcquired;
    private BigDecimal origionalCost;

    public Asset(String description, String dateAcquired, BigDecimal origionalCost){
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.origionalCost = origionalCost;
    }

    public Asset(String description, BigDecimal origionalCost) {
        this.description = description;
        this.dateAcquired = LocalDate.now().toString();
        this.origionalCost = origionalCost;
    }

    public BigDecimal getOrigionalCost() {
        return origionalCost;
    }

    public void setOrigionalCost(BigDecimal origionalCost) {
        this.origionalCost = origionalCost;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getValue() {
        return this.origionalCost;
    }
}
