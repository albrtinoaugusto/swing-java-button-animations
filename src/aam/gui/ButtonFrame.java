
package aam.gui;

import aam.apis.Animation;

/**
 *
 * @author Augusto Marrengula */
public class ButtonFrame extends javax.swing.JFrame
{


    public ButtonFrame()
    {
        initComponents();
    }

    
    private void animarBotao(){
        
        Animation animation = new Animation();
        animation.animateJButtonToRight(30, 390, 500, 100, button);
                
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        button = new javax.swing.JButton();
        close = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Button Frame");
        setMaximumSize(new java.awt.Dimension(550, 300));
        setMinimumSize(new java.awt.Dimension(550, 300));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(550, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        button.setText("Click Me");
        button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonActionPerformed(evt);
            }
        });
        getContentPane().add(button);
        button.setBounds(30, 90, 100, 40);

        close.setText("Fechar");
        close.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(400, 230, 100, 40);

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setOpaque(true);
        getContentPane().add(background);
        background.setBounds(0, 0, 550, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_closeActionPerformed
    {//GEN-HEADEREND:event_closeActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void buttonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonActionPerformed
    {//GEN-HEADEREND:event_buttonActionPerformed
        animarBotao();
    }//GEN-LAST:event_buttonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton button;
    private javax.swing.JButton close;
    // End of variables declaration//GEN-END:variables
}
