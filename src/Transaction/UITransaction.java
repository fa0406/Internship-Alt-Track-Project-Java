package Transaction;

//import Java library
import java.text.NumberFormat;
import javax.swing.table.TableColumn;

import java.awt.Font;
import java.awt.event.KeyEvent;

public class UITransaction extends javax.swing.JFrame {
    StuffClass SC;
    TransactionClass TC = new TransactionClass();
    
    public UITransaction() {
        Initalize();
        DataItem();
        Table_Stuff.setModel(TC.getTable());
    }
    
    /* Class DataItem()
     * all the data item are written here
    */
    private void DataItem(){
        StuffClass Item_1 = new StuffClass("Chocolate Pudding", "Pudding", 25000);
        StuffClass Item_2 = new StuffClass("Manggo Pudding", "Pudding", 30000);
        StuffClass Item_3 = new StuffClass("Double Choco Muffin", "Muffin", 35000);
        StuffClass Item_4 = new StuffClass("Strawberry & Cheese Muffin", "Muffin", 40000);
        StuffClass Item_5 = new StuffClass("Rainbow Cake", "Slice Cake", 45000);
        StuffClass Item_6 = new StuffClass("Strawberry Cheese Cake", "Slice Cake", 60000);
        StuffClass Item_7 = new StuffClass("Cheese & Maple Pancake", "Pancake", 22000);
        StuffClass Item_8 = new StuffClass("Pandan Banana Pancake", "Pancake", 30000);
        
        ComboBox_Stuff.addItem(Item_1);
        ComboBox_Stuff.addItem(Item_2);
        ComboBox_Stuff.addItem(Item_3);
        ComboBox_Stuff.addItem(Item_4);
        ComboBox_Stuff.addItem(Item_5);
        ComboBox_Stuff.addItem(Item_6);
        ComboBox_Stuff.addItem(Item_7);
        ComboBox_Stuff.addItem(Item_8);
    }
    
    /* An unchecked warning tells a programmer that a cast may cause a program to throw an exception somewhere else.
     * Suppressing the warning with @SuppressWarnings("unchecked") tells the compiler that the programmer believes
     * the code to be safe and won't cause unexpected exceptions.
    */
    @SuppressWarnings("unchecked")
    
    /* Class Initialize()
     * for all Initialization are in here, and also the font and size of text/label
    */
    private void Initalize() {
        Label_1 = new javax.swing.JLabel();
        Label_2 = new javax.swing.JLabel();
        Label_3 = new javax.swing.JLabel();
        Label_4 = new javax.swing.JLabel();
        Label_5 = new javax.swing.JLabel();
        Label_6 = new javax.swing.JLabel();
        Label_7 = new javax.swing.JLabel();
        Label_8 = new javax.swing.JLabel();
        Label_9 = new javax.swing.JLabel();
        Label_10 = new javax.swing.JLabel();

        StuffPrice_Label = new javax.swing.JLabel();
        StuffQuantity_Label = new javax.swing.JLabel();
        SubTotal_Label = new javax.swing.JLabel();
        Tax_Label = new javax.swing.JLabel();
        GrandTotal_Label = new javax.swing.JLabel();
        
        StuffQuantity_TextField = new javax.swing.JTextField();
        
        ScrollPane1_1 = new javax.swing.JScrollPane();
        
        Table_Stuff = new javax.swing.JTable();
        
        Button_Save = new javax.swing.JButton();
        Button_Delete = new javax.swing.JButton();

        CheckBox_Tax = new javax.swing.JCheckBox();
        
        ComboBox_Stuff = new javax.swing.JComboBox();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label_1.setFont(new Font("Segoe UI", 1, 30));
        Label_1.setText("Sprinkle Bakery");

        Label_2.setFont(new Font("Gill Sans", 1, 14));
        Label_2.setText("Item Name >>");

        ComboBox_Stuff.setNextFocusableComponent(StuffQuantity_TextField);
        ComboBox_Stuff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent Event) {
                ComboBoxStuff_ActionPerformed(Event);
            }
        });
        
        Label_3.setFont(new Font("Gill Sans", 1, 14));
        Label_3.setText("Quantity    >>");

        Label_4.setFont(new Font("Gill Sans", 1, 14));
        Label_4.setText("Price         >>");

        StuffPrice_Label.setFont(new Font("Helvetica", 1, 19));
        StuffPrice_Label.setText("00");

        Label_5.setFont(new Font("Gill Sans", 0, 14));
        Label_5.setText("IDR");

        StuffQuantity_Label.setText("Label_6");

        StuffQuantity_TextField.setNextFocusableComponent(Button_Save);
        StuffQuantity_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent Event) {
                TextField_QuantityKeyPressed(Event);
            }
        });

        Table_Stuff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ScrollPane1_1.setViewportView(Table_Stuff);

        Button_Save.setText("SAVE");
        Button_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent Event) {
                ButtonSave_ActionPerformed(Event);
            }
        });
        
        Label_6.setFont(new Font("Gill Sans", 1 ,14));
        Label_6.setText("Sub Total     >> ");
                
        Label_7.setFont(new Font("Gill Sans", 0, 14));
        Label_7.setText("IDR");

        SubTotal_Label.setFont(new Font("Gill Sans", 0, 14));
        SubTotal_Label.setText("00");
        
        CheckBox_Tax.setFont(new Font("Gill Sans", 1, 14));
        CheckBox_Tax.setText("Tax	   	       >> ");
        CheckBox_Tax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent Event) {
                CheckBoxTax_ActionPerformed(Event);
            }
        });

        Label_8.setFont(new Font("Gill Sans", 0 ,14));
        Label_8.setText("IDR");
        
        Tax_Label.setFont(new Font("Gill Sans", 0, 14));
        Tax_Label.setText("00");
        
        Label_9.setFont(new Font("Gill Sans", 1 ,14));
        Label_9.setText("Grand Total >>");
        
        Label_10.setFont(new Font("Gill Sans", 0 ,14));
        Label_10.setText("IDR");
        
        GrandTotal_Label.setFont(new Font("Gill Sans", 0, 14));
        GrandTotal_Label.setText("00");
        
        Button_Delete.setText("DELETE");
        Button_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent Event) {
                btnHapusActionPerformed(Event);
            }
        });
        
        //layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Label_2)
                                        .addComponent(Label_4))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Label_5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(StuffPrice_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(ComboBox_Stuff, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(Label_3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(StuffQuantity_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(StuffQuantity_Label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_Save)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Button_Delete))
                                .addComponent(ScrollPane1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(Label_1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Label_9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Label_10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(GrandTotal_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_6)
                                    .addComponent(CheckBox_Tax))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Label_8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Tax_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Label_7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(SubTotal_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Button_Delete, Button_Save});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_2)
                    .addComponent(ComboBox_Stuff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_4)
                    .addComponent(StuffPrice_Label)
                    .addComponent(Label_5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_3)
                    .addComponent(StuffQuantity_Label)
                    .addComponent(StuffQuantity_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Delete)
                    .addComponent(Button_Save))
                .addGap(18, 18, 18)
                .addComponent(ScrollPane1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_6)
                    .addComponent(SubTotal_Label)
                    .addComponent(Label_7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBox_Tax)
                    .addComponent(Tax_Label)
                    .addComponent(Label_8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_9)
                    .addComponent(GrandTotal_Label)
                    .addComponent(Label_10))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }

    private void TextField_QuantityKeyPressed(java.awt.event.KeyEvent Event) {
        if(Event.getKeyCode()==KeyEvent.VK_ENTER)
            Button_Save.requestFocus();
    }
    
    private void ComboBoxStuff_ActionPerformed(java.awt.event.ActionEvent Event) {
        SC = (StuffClass)ComboBox_Stuff.getSelectedItem();
        StuffPrice_Label.setText(NumberFormat.getNumberInstance().format(SC.getStuffPrice()));
        StuffQuantity_Label.setText(SC.getStuffQuantity());
    }
    
    //store into Array List
    private void ButtonSave_ActionPerformed(java.awt.event.ActionEvent Event) {
        String[] DataTable = new String[5];
        double PriceStuff = 0.0;
        double QuantityStuff = 0.0;
        int Quantity = 0;
        
        DataTable[0] = SC.getStuffName();
        PriceStuff = SC.getStuffPrice();
        DataTable[1] = String.valueOf(SC.getStuffPrice());
        Quantity = Integer.parseInt(StuffQuantity_TextField.getText());
        DataTable[2] = StuffQuantity_TextField.getText();
        DataTable[3] = SC.getStuffQuantity();
        QuantityStuff = PriceStuff * Quantity ;
        DataTable[4] = String.valueOf(QuantityStuff);
        
        TC.getTable().addRow(DataTable);
        SubTotal_Label.setText(NumberFormat.getNumberInstance().format(TC.CalculateSubTotal()));
        CheckBoxTax_ActionPerformed(null);
        
        ComboBox_Stuff.requestFocus();
    }
    
    private void CheckBoxTax_ActionPerformed(java.awt.event.ActionEvent evt) {
        if (CheckBox_Tax.isSelected())
            Tax_Label.setText(NumberFormat.getNumberInstance().format(TC.CalculateTax()));
        else{
            Tax_Label.setText("0");
            TC.setTax(0);
        }
        
        GrandTotal_Label.setText(NumberFormat.getNumberInstance().format(TC.CalculateGrandTotal()));
    }
    
    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {
        TC.getTable().removeRow(Table_Stuff.getSelectedRow());
        SubTotal_Label.setText(NumberFormat.getNumberInstance().format(TC.CalculateSubTotal()));
        CheckBoxTax_ActionPerformed(null);
    }
    
    public static void main(String args[]) {
        
    	try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UITransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UITransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UITransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UITransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    	java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new UITransaction().setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton Button_Delete;
    private javax.swing.JButton Button_Save;
    private javax.swing.JComboBox ComboBox_Stuff;
    private javax.swing.JCheckBox CheckBox_Tax;
    private javax.swing.JLabel Label_1;
    private javax.swing.JLabel Label_10;
    private javax.swing.JLabel Label_2;
    private javax.swing.JLabel Label_3;
    private javax.swing.JLabel Label_4;
    private javax.swing.JLabel Label_5;
    private javax.swing.JLabel Label_6;
    private javax.swing.JLabel Label_7;
    private javax.swing.JLabel Label_8;
    private javax.swing.JLabel Label_9;
    private javax.swing.JScrollPane ScrollPane1_1;
    private javax.swing.JLabel StuffPrice_Label;
    private javax.swing.JLabel Tax_Label;
    private javax.swing.JLabel StuffQuantity_Label;
    private javax.swing.JLabel SubTotal_Label;
    private javax.swing.JLabel GrandTotal_Label;
    private javax.swing.JTable Table_Stuff;
    private javax.swing.JTextField StuffQuantity_TextField;
}
