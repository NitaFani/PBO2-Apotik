/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewKaryawan;

import apotek.*;

/**
 *
 * @author JUNITA
 */
public class profil extends javax.swing.JPanel {

    /**
     * Creates new form profil
     */
    public profil() {
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

        namma = new javax.swing.JLabel();
        kode = new javax.swing.JLabel();
        jabatan = new javax.swing.JLabel();
        tgl = new javax.swing.JLabel();
        alamat = new javax.swing.JLabel();
        telp = new javax.swing.JLabel();
        bckgrnd = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(namma, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 152, 410, 40));
        add(kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 73, 410, 40));
        add(jabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 235, 410, 40));
        add(tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 318, 410, 40));
        add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 403, 410, 40));
        add(telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 484, 410, 40));

        bckgrnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/profil.png"))); // NOI18N
        add(bckgrnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 572));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamat;
    private javax.swing.JLabel bckgrnd;
    private javax.swing.JLabel jabatan;
    private javax.swing.JLabel kode;
    private javax.swing.JLabel namma;
    private javax.swing.JLabel telp;
    private javax.swing.JLabel tgl;
    // End of variables declaration//GEN-END:variables
}