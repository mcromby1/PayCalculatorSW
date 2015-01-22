package pay.calculatorsw;

public class PayCalcForm extends javax.swing.JFrame {

    private PayCalc myMoney;
    private double payRate, hours, oTHours, dTHours, shiftDiff;

    public PayCalcForm() {
        initComponents();
        myMoney = new PayCalc();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        payRateBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hoursWorked = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        overTimeHours = new javax.swing.JTextField();
        PayCalcButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        answerBox = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        dTHoursBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        shiftDiffBox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Week Pay Calculator");
        setName("payCalcBox"); // NOI18N

        jLabel1.setText("Pay Rate");

        payRateBox.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                payRateBoxComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                payRateBoxComponentRemoved(evt);
            }
        });
        payRateBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payRateBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Hours Worked");

        hoursWorked.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                hoursWorkedComponentAdded(evt);
            }
        });
        hoursWorked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursWorkedActionPerformed(evt);
            }
        });

        jLabel3.setText("Overtime Hours");

        overTimeHours.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                overTimeHoursComponentAdded(evt);
            }
        });

        PayCalcButton.setText("Calculate Pay");
        PayCalcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayCalcButtonActionPerformed(evt);
            }
        });

        answerBox.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                answerBoxComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(answerBox);

        jLabel4.setText("Double Time Hours");

        jLabel5.setText("Shift Premium");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PayCalcButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(shiftDiffBox)
                            .addComponent(overTimeHours, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(payRateBox)
                            .addComponent(hoursWorked, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(dTHoursBox))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(payRateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hoursWorked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(overTimeHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(dTHoursBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(shiftDiffBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PayCalcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void payRateBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payRateBoxActionPerformed

    }//GEN-LAST:event_payRateBoxActionPerformed

    private void hoursWorkedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursWorkedActionPerformed
     
    }//GEN-LAST:event_hoursWorkedActionPerformed

    private void PayCalcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayCalcButtonActionPerformed
        try {
            payRate = Double.parseDouble(payRateBox.getText());
        } catch (NumberFormatException | NullPointerException e) {
            payRate = 0;
        }

        try {
            hours = Double.parseDouble(hoursWorked.getText());
        } catch (NumberFormatException | NullPointerException e) {
            hours = 0;
        }

        try {
            oTHours = Double.parseDouble(overTimeHours.getText());
        } catch (NumberFormatException | NullPointerException e) {
            oTHours = 0;
        }

        try {
            dTHours = Double.parseDouble(dTHoursBox.getText());
        } catch (NumberFormatException | NullPointerException e) {
            dTHours = 0;
        }

        try {
            shiftDiff = Double.parseDouble(shiftDiffBox.getText());
        } catch (NumberFormatException | NullPointerException e) {
            shiftDiff = 0;
        }

        myMoney.setHourlyRate(payRate);
        System.out.println(myMoney.getHourlyRate());
        myMoney.setHours(hours);
        System.out.println(myMoney.getHours());
        myMoney.setoTHours(oTHours);
        System.out.println(myMoney.getoTHours());
        myMoney.setdTHours(dTHours);
        System.out.println(myMoney.getdTHours());
        myMoney.setShiftDiff(shiftDiff);
        System.out.println(myMoney.getShiftDiff());
        answerBox.setText(Double.toString(myMoney.getPay()));
        System.out.println(myMoney.getPay());
    }//GEN-LAST:event_PayCalcButtonActionPerformed

    private void payRateBoxComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_payRateBoxComponentAdded

    }//GEN-LAST:event_payRateBoxComponentAdded

    private void payRateBoxComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_payRateBoxComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_payRateBoxComponentRemoved

    private void hoursWorkedComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_hoursWorkedComponentAdded
    }//GEN-LAST:event_hoursWorkedComponentAdded

    private void overTimeHoursComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_overTimeHoursComponentAdded

    }//GEN-LAST:event_overTimeHoursComponentAdded

    private void answerBoxComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_answerBoxComponentAdded

    }//GEN-LAST:event_answerBoxComponentAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PayCalcButton;
    private javax.swing.JTextPane answerBox;
    private javax.swing.JTextField dTHoursBox;
    private javax.swing.JTextField hoursWorked;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField overTimeHours;
    private javax.swing.JTextField payRateBox;
    private javax.swing.JTextField shiftDiffBox;
    // End of variables declaration//GEN-END:variables
}
