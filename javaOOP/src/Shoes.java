public class Shoes extends Product{
    private String  type;
    private Double  footNumber;

    public String getType() {
        return type;
    }

    public Double getFootNumber() {
        return footNumber;
    }

    public void setFootNumber(Double footNumber) {
        this.footNumber = footNumber;
    }

    public void setType(String type) {
        this.type = type;
    }
}
