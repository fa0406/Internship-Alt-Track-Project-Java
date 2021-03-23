package Transaction;

public class StuffClass {
	
	//Initialization
    private String StuffName = "";
    private String StuffQuantity = "";
    private double StuffPrice = 0.0;

    public StuffClass (String SN, String SQ, double SP) {
        this.StuffName = SN;
        this.StuffQuantity = SQ;
        this.StuffPrice = SP;
    }

    //Override
    @Override
    public String toString() {
        return this.StuffName;
    }
    
    //Getter
    public String getStuffName() {
        return StuffName;
    }

    //Setter
    public void setStuffName(String SN) {
        this.StuffName = SN;
    }
    
    //Getter
    public String getStuffQuantity() {
        return StuffQuantity;
    }
    
    //Setter
    public void setStuffQuantity(String SQ) {
        this.StuffQuantity = SQ;
    }

    //Getter
    public double getStuffPrice() {
        return StuffPrice;
    }
    
    //Setter
    public void setStuffPrice(double SP) {
        this.StuffPrice = SP;
    }
}