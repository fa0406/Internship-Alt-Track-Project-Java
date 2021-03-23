package Transaction;

import javax.swing.table.DefaultTableModel;

public class TransactionClass {
    //Initialization
	private double SubTotal = 0;
    private double GrandTotal = 0;
    private double Tax = 0;
    private DefaultTableModel Table = new DefaultTableModel();
    
    //The Column of Table
    public TransactionClass(){
        getTable().addColumn("Name");
        getTable().addColumn("Price");
        getTable().addColumn("Quantity");
        getTable().addColumn("Item");
        getTable().addColumn("Price Total");
    }

    //The Calculation of Sub Total
    public double CalculateSubTotal(){
        SubTotal = 0;
        for (int A=0; A<Table.getRowCount(); A++){
            SubTotal=SubTotal+Double.parseDouble(Table.getValueAt(A, 4).toString());
        }
        return SubTotal;
    }

    //The Calculation of Tax (15%)
    public double CalculateTax(){
        Tax=SubTotal*0.15;
        return Tax;
    }
    
    //The Calculation of Grand Total
    public double CalculateGrandTotal(){
        GrandTotal=SubTotal+Tax;
        return GrandTotal;
    }
    
    //Getter
    public double getSubTotal() {
        return SubTotal;
    }

    //Setter
    public void setSubTotal(double subTotal) {
        this.SubTotal = subTotal;
    }
    
    //Getter
    public double getTax() {
        return Tax;
    }
    
    //Setter
    public void setTax(double Tax) {
        this.Tax = Tax;
    }

    //Getter
    public double getGrandTotal() {
        return GrandTotal;
    }

    //Setter
    public void setGrandTotal(double GrandTotal) {
        this.GrandTotal = GrandTotal;
    }
    
    //Getter
    public DefaultTableModel getTable() {
        return Table;
    }
    
    //Setter
    public void setTable(DefaultTableModel Table) {
        this.Table = Table;
    }
}