/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
  and open the template in the editor.
 */

package examsoftware;

import javax.swing.JLabel;

/**
 *
 * @author Guru
 */
public class TorFPanel extends javax.swing.JPanel {

    /**
     * Creates new form TorFPanel
     */
    int qno;
    String answers[];
    JLabel UnattemptedLabel;
    public TorFPanel(int i, String answers[],JLabel UnattemptedLabel) {
        this.UnattemptedLabel=UnattemptedLabel;
        this.qno=i;
        this.answers=answers;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(255, 255, 255));
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jToggleButton1.setText("True");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("False");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton2))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    if(jToggleButton1.isSelected()==true){answers[qno]="$T";}
    else {answers[qno]="$U";}        
        jToggleButton2.setSelected(false);
        countattemptquest();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton2.isSelected()==true){answers[qno]="$F";}
        else {answers[qno]="$U";}    
        jToggleButton1.setSelected(false);
        countattemptquest();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
          jToggleButton1.setSelected(false);
          jToggleButton2.setSelected(false);
        
        switch(answers[qno].toString().charAt(1)){
            case 'T':{
                    jToggleButton1.setSelected(true);
                    jToggleButton2.setSelected(false);
                    
                    countattemptquest();
                break;
            }
                
            case 'F':{
                    jToggleButton1.setSelected(false);
                    jToggleButton2.setSelected(true);
                    
                    countattemptquest();
                break;
            }
            case 'U':{
                    jToggleButton1.setSelected(false);
                    jToggleButton2.setSelected(false);
                    
                    countattemptquest();
                break;
            }                   
        }
         
    }//GEN-LAST:event_formAncestorAdded
private void countattemptquest(){
        int unattempted=0;       
        for(int i=0;i<answers.length;i++){            
          if(answers[i].equals("$U")){
               unattempted++;               
          }          
        }
        UnattemptedLabel.setText("No. Of Unattempted Questions : "+unattempted);
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton jToggleButton1;
    public javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}