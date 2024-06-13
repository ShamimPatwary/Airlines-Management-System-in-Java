package airlines.reservation.system;

import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserControl extends javax.swing.JFrame {

    String loginUser;
    
    public UserControl() {
        initComponents();
        
    }
    
    public UserControl(String loginUser){       
        initComponents();
        this.loginUser = loginUser;
        String getValue = jLabel1.getText();
        jLabel1.setText(getValue + " : "  + loginUser);
        autoIdcall();
    }
    
    
    public void clearTextField(){
        modelbox.setText("");
        sourcebox.setText("");
        destinationbox.setText("");
        datebox.setText("");
        farebox.setText("");
        totalfare.setText("");
        jSpinner1.setValue(1);
    }
    
    
    public void infoMsg(String msg, String title){
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }
       
    
    public void autoIdcall(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ars","root","");
            Statement start = con.createStatement();
            ResultSet rs = start.executeQuery("select MAX(ticketid) from bookings");
            rs.next();
            rs.getString("MAX(ticketid)");
            if(rs.getString("MAX(ticketid)") == null){
                txtid.setText("EWU202");
            }
            else{
                long tic = Long.parseLong(rs.getString("MAX(ticketid)").substring(3,rs.getString("MAX(ticketid)").length()));
                tic++;
                txtid.setText("EWU"+String.format("%03d",tic));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtsource = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        textdestination = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        modelbox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sourcebox = new javax.swing.JTextField();
        destinationbox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        datebox = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        farebox = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        confirmBooking = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        totalfare = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel1.setText("   Welcome");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel2.setText("                                                 Take A Tour");

        jLabel3.setFont(new java.awt.Font("Mongolian Baiti", 0, 24)); // NOI18N
        jLabel3.setText(" Source");

        txtsource.setFont(new java.awt.Font("Mongolian Baiti", 0, 24)); // NOI18N
        txtsource.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Bangladesh", "UAE", "US", "UK", "India" }));

        jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 0, 24)); // NOI18N
        jLabel4.setText(" Destination");

        textdestination.setFont(new java.awt.Font("Mongolian Baiti", 0, 24)); // NOI18N
        textdestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Bangladesh", "UAE", "US", "UK", "India" }));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Company", "Model", "Source", "Destination", "Fare", "seat", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText(" Model");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText(" Source");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText(" Destination");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText(" Date");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText(" Fare");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText(" Seat");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        jSpinner1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jSpinner1InputMethodTextChanged(evt);
            }
        });

        confirmBooking.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        confirmBooking.setText("Confirm Booking");
        confirmBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBookingActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText(" Total Price");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText(" Ticket ID");

        txtid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtid.setText(" Auto ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(485, 485, 485)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(modelbox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(farebox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(confirmBooking)
                                .addGap(211, 211, 211)
                                .addComponent(cancel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpinner1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(sourcebox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(destinationbox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(datebox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(totalfare, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtsource, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textdestination, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jButton1)
                        .addGap(32, 32, 32))))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsource, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textdestination)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelbox)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sourcebox)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinationbox)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datebox))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(farebox)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalfare))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(confirmBooking))
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        DefaultTableModel tmodel = (DefaultTableModel)jTable1.getModel();
        int x = jTable1.getSelectedRow();
        
        String model = tmodel.getValueAt(x,1).toString();
        String source = tmodel.getValueAt(x,2).toString();
        String destination = tmodel.getValueAt(x,3).toString();
        String date = tmodel.getValueAt(x,6).toString();
        String fare = tmodel.getValueAt(x,4).toString();
        
        modelbox.setText(model);
        sourcebox.setText(source);
        destinationbox.setText(destination);
        datebox.setText(date);
        farebox.setText(fare);
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String source = txtsource.getSelectedItem().toString();
        String destination = textdestination.getSelectedItem().toString();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ars","root","");
            PreparedStatement pst = con.prepareStatement("select * from airplanesdetails where source = ? and 	destination = ?");
            pst.setString(1, source);
            pst.setString(2, destination);
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData data = rs.getMetaData();
            int x =data.getColumnCount();
            DefaultTableModel tmodel = (DefaultTableModel)jTable1.getModel();
            tmodel.setRowCount(0);
            if(rs.next()){
                Vector v1 = new Vector();
                for(int i=0; i<x; i++){
                    v1.add(rs.getString("company"));
                    v1.add(rs.getString("model"));
                    v1.add(rs.getString("source"));
                    v1.add(rs.getString("destination"));
                    v1.add(rs.getString("fare"));
                    v1.add(rs.getString("seat"));
                    v1.add(rs.getString("date"));
                }
                tmodel.addRow(v1);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSpinner1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jSpinner1InputMethodTextChanged
        
    }//GEN-LAST:event_jSpinner1InputMethodTextChanged

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        
        int x = Integer.parseInt(farebox.getText().toString());
        int y = Integer.parseInt(jSpinner1.getValue().toString());
        int total = x * y;
        totalfare.setText(Integer.toString(total));
        
    }//GEN-LAST:event_jSpinner1StateChanged

    private void confirmBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBookingActionPerformed
        
        String ticketid = txtid.getText();
        String model = modelbox.getText();
        String source = sourcebox.getText();
        String destination = destinationbox.getText();
        String date = datebox.getText();
        String fare = farebox.getText();
        String seat = jSpinner1.getValue().toString();
        String totalprice = totalfare.getText();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ars","root","");
            PreparedStatement pst = con.prepareStatement ("insert into bookings (ticketid,Model,source,destination,date,fare,seat,totalprice)values(?,?,?,?,?,?,?,?)");
            pst.setString(1,ticketid);
            pst.setString(2,model);
            pst.setString(3,source);
            pst.setString(4,destination);
            pst.setString(5,date);
            pst.setString(6,fare);
            pst.setString(7,seat);
            pst.setString(8,totalprice);
            
            
            int x = pst.executeUpdate();
            if(x>0){
//                String selectquery = "selct count(*) from airplanesdetails where seat = ?";
//                Statement start = con.createStatement();
//                ResultSet rs = start.executeQuery(selectquery);
//                if(rs.next()){
//                    int total = rs.getInt(seat);  //total refers to total seat in airplanes 
//                    int s = Integer.parseInt(jSpinner1.getValue().toString());  //s refers to seat
//                    int totalseat = total - s;
//                    String insertQuery = "insert into airplanesdetails (seat) values (totalseat)";
//                    start.executeUpdate(insertQuery);    
//            }
                infoMsg("Ticket Booking Successfull\nThanks For Believing Us","Take A Tour");
                clearTextField();
                
            }
            else{
                infoMsg("Ticket Booking Failled","Take A Tour");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_confirmBookingActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed

        dispose();
        UserLogin ul = new UserLogin();
        ul.setVisible(true);
        ul.setLocationRelativeTo(null);
    }//GEN-LAST:event_cancelActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserControl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton confirmBooking;
    private javax.swing.JTextField datebox;
    private javax.swing.JTextField destinationbox;
    private javax.swing.JTextField farebox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField modelbox;
    private javax.swing.JTextField sourcebox;
    private javax.swing.JComboBox<String> textdestination;
    private javax.swing.JTextField totalfare;
    private javax.swing.JLabel txtid;
    private javax.swing.JComboBox<String> txtsource;
    // End of variables declaration//GEN-END:variables
}
