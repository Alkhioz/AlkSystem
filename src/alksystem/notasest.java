package alksystem;




import Logica.PseudoCache;
import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import easytable.Cell;
import easytable.Row.RowBuilder;
import easytable.Table.TableBuilder;
import easytable.TableDrawer;
import java.awt.Desktop;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class notasest extends javax.swing.JFrame {
     private Cell.HorizontalAlignment RIGHT;
    private int idnota=0;
    int xx=0;
    int yy=0; 
  
    
    /** Constructor de carga de la ventana*/
    public notasest() {
        super("Registro de Notas");
 
        initComponents();
setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icon.png")));
        
        ListarNotasEst(Integer.parseInt(PseudoCache.getid().trim()));
    
  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoSexo = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabLista = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        Cerrar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setName("Registro de Personas"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jPanel5.setBackground(new Color(0,0,0,0));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
        });

        TabLista.setForeground(new java.awt.Color(102, 51, 0));
        TabLista.setModel(new javax.swing.table.DefaultTableModel(
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
        TabLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabLista);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(13, 152, 242));

        Cerrar1.setBackground(new java.awt.Color(13, 152, 242));
        Cerrar1.setFont(new java.awt.Font("Freestyle Script", 1, 18)); // NOI18N
        Cerrar1.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png")).getImage().getScaledInstance(56,56, Image.SCALE_SMOOTH)));
        Cerrar1.setActionCommand("ACEPTAR");
        Cerrar1.setBorderPainted(false);
        Cerrar1.setFocusPainted(false);
        Cerrar1.setMaximumSize(new java.awt.Dimension(56, 56));
        Cerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cerrar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Cerrar1MouseExited(evt);
            }
        });
        Cerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(13, 152, 242));
        jButton1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png")).getImage().getScaledInstance(56,56, Image.SCALE_SMOOTH)));
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        regresar.setBackground(new java.awt.Color(13, 152, 242));
        regresar.setFont(new java.awt.Font("Freestyle Script", 1, 18)); // NOI18N
        regresar.setForeground(new java.awt.Color(255, 255, 255));
        regresar.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gob.png")).getImage().getScaledInstance(56,56, Image.SCALE_SMOOTH)));
        regresar.setActionCommand("ACEPTAR");
        regresar.setBorderPainted(false);
        regresar.setFocusPainted(false);
        regresar.setMaximumSize(new java.awt.Dimension(56, 56));
        regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regresarMouseExited(evt);
            }
        });
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Cerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Método para seleccionar una nota para editarlo*/
    private void TabListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabListaMouseClicked
       //activa los botones 
       /*this.Registrar.setText("Actualizar");
       this.BTNEliminar.setEnabled(true);
        
        //Creación de una fila de JTable y captura la fila, con el evento clic
        int fila=TabLista.rowAtPoint(evt.getPoint());
        Logica.ClsAlumno alum=new Logica.ClsAlumno();
        //Captura de los datos de la nota para editarlo
         this.idnota=Integer.parseInt(TabLista.getValueAt(fila, 0).toString());
         this.TxtCodCurso.setText(TabLista.getValueAt(fila, 1).toString());
         this.TxtCodAlumno.setText(TabLista.getValueAt(fila, 3).toString());
         this.TxtNombrecurso.setText(TabLista.getValueAt(fila, 2).toString());
         this.TxtNombreAlumno.setText(TabLista.getValueAt(fila, 4).toString()+" "+TabLista.getValueAt(fila, 5).toString());
         this.TxtPromedio.setText(TabLista.getValueAt(fila, 6).toString());
         this.CBXUnidad.setSelectedItem(TabLista.getValueAt(fila, 7).toString());
         */
                
         
    }//GEN-LAST:event_TabListaMouseClicked

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        xx=evt.getX();
        yy=evt.getY();

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseDragged

    private void Cerrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Cerrar1MouseEntered

    private void Cerrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Cerrar1MouseExited

    private void Cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerrar1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Cerrar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         try {
             TableBuilder tableBuilder = new TableBuilder()
                    .addColumnOfWidth(145)
                    .addColumnOfWidth(145)
                    .addColumnOfWidth(98)
                    .addColumnOfWidth(98)
                    .setFontSize(8)
                    .setFont(PDType1Font.HELVETICA);
            
// Header ...
tableBuilder.addRow(new RowBuilder()
        .add(Cell.withText("Estudiante").withAllBorders().withTextColor(Color.WHITE))
        .add(Cell.withText("Curso").withAllBorders().withTextColor(Color.WHITE))
        .add(Cell.withText("Promedio").withAllBorders().withTextColor(Color.WHITE))
        .add(Cell.withText("Unidad").withAllBorders().withTextColor(Color.WHITE))
        .setBackgroundColor(Color.BLUE)
        .setBorderColor(Color.BLACK)
        .build());
             
// ... and some cells
for (int i = 0; i < TabLista.getRowCount(); i++) {
    tableBuilder.addRow(new RowBuilder()
            .add(Cell.withText(TabLista.getValueAt(i, 4).toString()+" "+TabLista.getValueAt(i, 5).toString()).withAllBorders())
            .add(Cell.withText(TabLista.getValueAt(i, 2).toString()).withAllBorders())
            .add(Cell.withText(TabLista.getValueAt(i, 6).toString()).withAllBorders())
            .add(Cell.withText(TabLista.getValueAt(i, 7).toString()).withAllBorders())
            .setBackgroundColor(i % 2 == 0 ? Color.LIGHT_GRAY : Color.WHITE)
            .build());      
}

final PDDocument document = new PDDocument();
final PDPage page = new PDPage(PDRectangle.A4);
document.addPage(page);
final PDPageContentStream contentStream = new PDPageContentStream(document, page);

// Define the starting point
final float startY = page.getMediaBox().getHeight() - 50;
final int startX = 50;
// Draw!
(new TableDrawer(contentStream, tableBuilder.build(), startX, startY)).draw();

contentStream.close();

document.save("notas.pdf");
document.close();

System.out.println("pdf creado");

if (Desktop.isDesktopSupported()) {
    try {
        File myFile = new File("notas.pdf");
        Desktop.getDesktop().open(myFile);
    } catch (IOException ex) {
        // no application registered for PDFs
    }
}

        } catch (IOException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void regresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_regresarMouseEntered

    private void regresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_regresarMouseExited

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
        Rectangle rect = defaultScreen.getDefaultConfiguration().getBounds();
        menuest MEN = new menuest();
        MEN.setAlwaysOnTop( true );
        MEN.setVisible(true);
        int x = (int) rect.getMaxX() - MEN.getWidth();
        int y = 2;
        MEN.setLocation(x, y);
        MEN.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    /** Método Main*/
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(notasest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(notasest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(notasest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(notasest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater
        (new Runnable() 
                       {
                              public void run() 
                              {
                                       new notasest().setVisible(true);  
                              }
                     }
           );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar1;
    private javax.swing.ButtonGroup GrupoSexo;
    private javax.swing.JTable TabLista;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables

    
 /**Métodos Auxiliares*/
    private void ListarNotasEst(int id){ //Cargamos la tabla con la lista de personas
         //Creamos un objeto nota
        Logica.ClsNotas nota=new Logica.ClsNotas();
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        //Extraemos la lista de personas dentro de un modelo
        modelo=nota.ListarNotaEst(id);

        //Asociamos el modelo al JTable
        this.TabLista.setModel(modelo);
        
        //Oculta lascolumnas codigo
        OcultarColumnaTablaNotas();
    }
    
    private  void OcultarColumnaTablaNotas(){
            //Oculta la primera columna de la tabla
       this.TabLista.getColumnModel().getColumn(0).setMaxWidth(0);
       this.TabLista.getColumnModel().getColumn(0).setMinWidth(0);
       this.TabLista. getColumnModel().getColumn(0).setPreferredWidth(0);
       
       this.TabLista.getColumnModel().getColumn(1).setMaxWidth(0);
       this.TabLista.getColumnModel().getColumn(1).setMinWidth(0);
       this.TabLista. getColumnModel().getColumn(1).setPreferredWidth(0);
       
       this.TabLista.getColumnModel().getColumn(3).setMaxWidth(0);
       this.TabLista.getColumnModel().getColumn(3).setMinWidth(0);
       this.TabLista. getColumnModel().getColumn(3).setPreferredWidth(0);
    }
}
