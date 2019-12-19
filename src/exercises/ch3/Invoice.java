package exercises.ch3;

public class Invoice {
    private String number;
    private String description;
    private Integer item;
    private Double pricePerItem;

    public Invoice(String number, String description, Integer item, Double pricePerItem) {
        this.number = number;
        this.description = description;
        this.item = item;
        this.pricePerItem = pricePerItem;
    }

    public double setInvoiceAmount() {
        if (item < 0)
            return (0);
        if (pricePerItem < 0)
            return (0.0);
        return (pricePerItem * item);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(Double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
}
