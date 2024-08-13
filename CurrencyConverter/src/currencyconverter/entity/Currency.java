package currencyconverter.entity;


public class Currency {
    private int id;
    private String name;
    private int type;
    private String code;
    private double value;
    
    public Currency(){
    
    }

    public Currency(int id, String name, int type, double value, String code) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.value = value;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
}
