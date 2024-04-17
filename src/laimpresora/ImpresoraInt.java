package laimpresora;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import laimpresora.DocumentosYPaginas.Documento;
public class ImpresoraInt extends javax.swing.JFrame {
    public ImpresoraInt() {
        this.timertask = new TimerTask() {
            @Override
            public void run() {
                docu2=colaImpresion.peek();
                if (docu2!=null){
                    pagre++;
                    Doccola1.setText("Imprimiendo: "+docu2.toString());
                    Pagcola.setText("Paginas restantes: "+(docu2.getPaginasRestantes()-pagre));
                    Doccola.setText("Documentos restantes: "+docre);
                    progresdoc.setMaximum(docu2.getNumPaginas());
                    progresdoc.setValue(pagre);
                if (pagre==docu2.getPaginasRestantes()) {docre--; colaImpresion.remove();pagre=-1;}
                }
                else {
                    Doccola1.setText("Imprimiendo: NINGUNO");
                    Pagcola.setText("No hay paginas en cola");
                    Doccola.setText("No hay documentos en cola");
                    progresdoc.setValue(0);}
            }
        };
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulonombredoc = new javax.swing.JLabel();
        Ingnombre = new javax.swing.JTextField();
        Doccola = new javax.swing.JLabel();
        titulonumpag = new javax.swing.JLabel();
        Ingpag = new javax.swing.JTextField();
        Anadir = new javax.swing.JButton();
        Imprimir = new javax.swing.JButton();
        Pagcola = new javax.swing.JLabel();
        Doccola1 = new javax.swing.JLabel();
        progresdoc = new javax.swing.JProgressBar();
        Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        titulonombredoc.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        titulonombredoc.setText("Nombre del documento");

        Ingnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngnombreActionPerformed(evt);
            }
        });

        Doccola.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        Doccola.setText("No hay documentos en cola");

        titulonumpag.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        titulonumpag.setText("Numero de paginas");

        Ingpag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngpagActionPerformed(evt);
            }
        });

        Anadir.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Anadir.setText("Añadir");
        Anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnadirActionPerformed(evt);
            }
        });

        Imprimir.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Imprimir.setText("Imprimir");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        Pagcola.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        Pagcola.setText("No hay paginas en cola");

        Doccola1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        Doccola1.setText("Imprimiendo: NINGUNO");

        Titulo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        Titulo.setText("Impresora");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulonombredoc)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Ingnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(Doccola, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(titulonumpag)
                                .addComponent(Ingpag, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pagcola, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Doccola1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(progresdoc, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(Titulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titulonombredoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ingnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Doccola))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulonumpag)
                    .addComponent(Pagcola))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ingpag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Doccola1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(progresdoc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(Anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static String doc; static int pag,pagre=-1,docre,presionado=0;
    Timer timer;
    TimerTask timertask;

DocumentosYPaginas doyp = new DocumentosYPaginas();
DocumentosYPaginas.Documento docu;
DocumentosYPaginas.Documento docu2;
    Queue<Documento> colaImpresion = new LinkedList<>();
    private void AnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnadirActionPerformed
        doc=Ingnombre.getText();
        pag=Integer.parseInt(Ingpag.getText());
        docu = doyp.new Documento(doc, pag);
        docu.setNombre(doc);docu.setNumPaginas(pag);docre++;
        colaImpresion.add(docu);
    }//GEN-LAST:event_AnadirActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        presionado++;
        if (presionado <=1){
        timer=new Timer();
        timer.scheduleAtFixedRate(timertask, 0, 1000);
        }
    }//GEN-LAST:event_ImprimirActionPerformed

    private void IngpagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngpagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngpagActionPerformed

    private void IngnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngnombreActionPerformed
    
 
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ImpresoraInt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImpresoraInt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImpresoraInt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImpresoraInt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImpresoraInt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anadir;
    private javax.swing.JLabel Doccola;
    private javax.swing.JLabel Doccola1;
    private javax.swing.JButton Imprimir;
    private javax.swing.JTextField Ingnombre;
    private javax.swing.JTextField Ingpag;
    private javax.swing.JLabel Pagcola;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar progresdoc;
    private javax.swing.JLabel titulonombredoc;
    private javax.swing.JLabel titulonumpag;
    // End of variables declaration//GEN-END:variables
}
