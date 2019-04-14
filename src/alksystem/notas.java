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


public class notas extends javax.swing.JFrame {
     private Cell.HorizontalAlignment RIGHT;
    private int idnota=0;
    int xx=0;
    int yy=0; 
  
    
    /** Constructor de carga de la ventana*/
    public notas() {
        super("Registro de Notas");
 
        initComponents();
setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icon.png")));
        
        ListarNotas(Integer.parseInt(PseudoCache.getid().trim()));
        ListarCursos(Integer.parseInt(PseudoCache.getid().trim()));
        ListarAlumnos();

  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoSexo = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        TxtCodCurso = new javax.swing.JTextField();
        TxtCodAlumno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CBXUnidad = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();
        javax.swing.JButton Nuevo = new javax.swing.JButton();
        BTNEliminar = new javax.swing.JButton();
        TxtPromedio = new javax.swing.JTextField();
        TxtNombrecurso = new javax.swing.JTextField();
        TxtNombreAlumno = new javax.swing.JTextField();
        Cerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabLista = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        TXTBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PanelCurso = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabListacurso = new javax.swing.JTable();
        Curso = new javax.swing.JLabel();
        TXTCurso = new javax.swing.JTextField();
        CmdCursoRegistrar = new javax.swing.JButton();
        PanelCurso2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TabListaalumno = new javax.swing.JTable();
        Curso2 = new javax.swing.JLabel();
        TXTAlumno = new javax.swing.JTextField();
        CmdAlumnoRegistrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        regresar = new javax.swing.JButton();
        Cerrar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Los Alumnos"));

        TxtCodCurso.setEnabled(false);

        TxtCodAlumno.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Cod Curso");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Cod Alumno");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Promedio");

        CBXUnidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Bimestre");

        Registrar.setBackground(new java.awt.Color(0, 102, 102));
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/postcategoryicon.png"))); // NOI18N
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        Nuevo.setBackground(new java.awt.Color(0, 102, 102));
        Nuevo.setForeground(new java.awt.Color(255, 255, 255));
        Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        BTNEliminar.setBackground(new java.awt.Color(0, 102, 102));
        BTNEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BTNEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/elim.png"))); // NOI18N
        BTNEliminar.setText("Eliminar");
        BTNEliminar.setEnabled(false);
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });

        TxtNombrecurso.setEnabled(false);

        TxtNombreAlumno.setEnabled(false);

        Cerrar.setBackground(new java.awt.Color(0, 102, 102));
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undo.gif"))); // NOI18N
        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtCodAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(TxtCodCurso, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNombreAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(TxtNombrecurso)))
                    .addComponent(TxtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBXUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(TxtNombrecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCodAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CBXUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Alumnos Registrados"), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Alumnos"));

        TXTBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTBuscarActionPerformed(evt);
            }
        });
        TXTBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTBuscarKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Apellidos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        PanelCurso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Cursos"), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        TabListacurso.setForeground(new java.awt.Color(102, 51, 0));
        TabListacurso.setModel(new javax.swing.table.DefaultTableModel(
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
        TabListacurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabListacursoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabListacurso);

        Curso.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Curso.setForeground(new java.awt.Color(0, 102, 102));
        Curso.setText("Curso");

        TXTCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCursoActionPerformed(evt);
            }
        });
        TXTCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTCursoKeyPressed(evt);
            }
        });

        CmdCursoRegistrar.setBackground(new java.awt.Color(0, 102, 102));
        CmdCursoRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        CmdCursoRegistrar.setText("Registrar");
        CmdCursoRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CmdCursoRegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelCursoLayout = new javax.swing.GroupLayout(PanelCurso);
        PanelCurso.setLayout(PanelCursoLayout);
        PanelCursoLayout.setHorizontalGroup(
            PanelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(PanelCursoLayout.createSequentialGroup()
                        .addComponent(Curso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(CmdCursoRegistrar)))
                .addContainerGap())
        );
        PanelCursoLayout.setVerticalGroup(
            PanelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCursoLayout.createSequentialGroup()
                .addGroup(PanelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Curso)
                    .addComponent(TXTCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmdCursoRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        PanelCurso2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Alumnos"), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        TabListaalumno.setForeground(new java.awt.Color(102, 51, 0));
        TabListaalumno.setModel(new javax.swing.table.DefaultTableModel(
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
        TabListaalumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabListaalumnoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TabListaalumno);

        Curso2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Curso2.setForeground(new java.awt.Color(0, 102, 102));
        Curso2.setText("Alumno");

        TXTAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTAlumnoActionPerformed(evt);
            }
        });
        TXTAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTAlumnoKeyPressed(evt);
            }
        });

        CmdAlumnoRegistrar.setBackground(new java.awt.Color(0, 102, 102));
        CmdAlumnoRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        CmdAlumnoRegistrar.setText("Registrar");
        CmdAlumnoRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CmdAlumnoRegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelCurso2Layout = new javax.swing.GroupLayout(PanelCurso2);
        PanelCurso2.setLayout(PanelCurso2Layout);
        PanelCurso2Layout.setHorizontalGroup(
            PanelCurso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCurso2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCurso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(PanelCurso2Layout.createSequentialGroup()
                        .addComponent(Curso2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CmdAlumnoRegistrar)))
                .addContainerGap())
        );
        PanelCurso2Layout.setVerticalGroup(
            PanelCurso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCurso2Layout.createSequentialGroup()
                .addGroup(PanelCurso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Curso2)
                    .addComponent(TXTAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmdAlumnoRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(13, 152, 242));

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
                            .addComponent(regresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelCurso2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(99, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(PanelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PanelCurso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(248, 248, 248))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(73, 73, 73)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Notas Del Alumno");

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

    /** Método para Registrar una nota*/
    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        //Validación de campos
             
        if (this.TxtCodCurso.getText().length()==0){
             JOptionPane.showMessageDialog(rootPane, "Debes Seleccionar el curso");
             TxtCodCurso.requestFocus();//rabFocus(); 
             return ;
        }
        if (this.TxtCodAlumno.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes Seleccionar el Alumno");
            TxtCodAlumno.requestFocus(); 
        return ;
        }
        
         if (this.TxtPromedio.getText().length()==0 ){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el Promedio del Alumno");
            TxtPromedio.requestFocus(); 
        return ;
        }
         
          if (Integer.parseInt(this.TxtPromedio.getText())<0 || Integer.parseInt(this.TxtPromedio.getText())>20 ){
            JOptionPane.showMessageDialog(rootPane, "Ingrese Un promedio valido");
            TxtPromedio.requestFocus(); 
        return ;
        }
      
        Logica.ClsNotas nota=new Logica.ClsNotas();  //objeto tipo nota
        nota.idnota=this.idnota;
        nota.idcurso=Integer.parseInt(this.TxtCodCurso.getText());
        nota.idalumno=Integer.parseInt(this.TxtCodAlumno.getText());
        nota.promedio=Integer.parseInt(this.TxtPromedio.getText());
        //Selecciona el item
        int seleccionado=CBXUnidad.getSelectedIndex();
        nota.unidad=(String)this.CBXUnidad.getItemAt(seleccionado);//texto del Item seleccionado
       
  //Evaluamos si el usuario esta Registrando una nueva nota o esta actualizando
  if(this.idnota==0){
       boolean respuesta=true; //bandera
       respuesta=nota.RegistrarNota(); //ejecuta el método que registra nota
       ListarNotas(Integer.parseInt(PseudoCache.getid().trim())); //actualiza la tabla
       
       //lanza el aviso
       if (respuesta==false)
           { 
           JOptionPane.showMessageDialog(rootPane, "Se ha registrado correctamente");
            Limpiarcampos();
            this.BTNEliminar.setEnabled(false);
           }
       else{  JOptionPane.showMessageDialog(rootPane, "Nota No Registrada"); }
         
  }
  else //actualiza los datos de la nota
  {
           boolean respuesta2=true; //bandera
            respuesta2=nota.ActualizarNota(); //ejecuta el método que Actualiza nota
            ListarNotas(Integer.parseInt(PseudoCache.getid().trim())); //actualiza la tabla
       
             //lanza el aviso
             if (respuesta2==false)
               { 
                JOptionPane.showMessageDialog(rootPane, "Se ha Actualizado correctamente");
                Limpiarcampos();
                this.BTNEliminar.setEnabled(false);
               }
             else{  JOptionPane.showMessageDialog(rootPane, "No se actualizó"); }
  
   }
       
    }//GEN-LAST:event_RegistrarActionPerformed

    /** Método para seleccionar una nota para editarlo*/
    private void TabListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabListaMouseClicked
       //activa los botones 
       this.Registrar.setText("Actualizar");
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
         
                
         
    }//GEN-LAST:event_TabListaMouseClicked

    /**Método para registrar una nueva nota*/
    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        this.Registrar.setText("Registrar");
        this.Limpiarcampos();
        this.idnota=0;
        this.BTNEliminar.setEnabled(false);
    }//GEN-LAST:event_NuevoActionPerformed

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
        // TODO add your handling code here:

        if (this.idnota==0){
            JOptionPane.showMessageDialog(rootPane, "Seleccione una Nota");
            return;
        }
       //Captura la confirmacion
        int confirmacion= JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de eliminar?", "Confirma la acción", 2);
                    
       if (confirmacion==0){ //evaluamos la confirmación
           boolean confirmacion2=true;
            Logica.ClsNotas nota=new Logica.ClsNotas();
            confirmacion2=nota.EliminarNota( this.idnota);
                if (confirmacion2==false){ //Evaluamos el resultado de la operacion
                     JOptionPane.showMessageDialog(rootPane, "Eliminación correcta");
                     Limpiarcampos();  //Limpiamos los campos
                    this.BTNEliminar.setEnabled(false); //Deshabilitamos el botón
                    this.ListarNotas(Integer.parseInt(PseudoCache.getid().trim())); //recargamos la lista
                }else{
                     JOptionPane.showMessageDialog(rootPane, "No se pudo Eliminar");
                }
       }    
    }//GEN-LAST:event_BTNEliminarActionPerformed

    /**  Método para buscar Personas */
    private void TXTBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTBuscarKeyPressed
      
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        Logica.ClsNotas nota=new  Logica.ClsNotas();
                //Extraemos la lista de personas dentro de un modelo
        modelo=nota.BusquedaNotas(this.TXTBuscar.getText().trim());
        
        //Asociamos el modelo al JTable
        this.TabLista.setModel(modelo);
        
         //Oculta la primera columna
        OcultarColumnaTablaNotas();
        
    }//GEN-LAST:event_TXTBuscarKeyPressed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_CerrarActionPerformed

    private void TabListacursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabListacursoMouseClicked
        // TODO add your handling code here:
                
        //Creación de una fila de JTable y captura la fila, con el evento clic
        int fila=TabLista.rowAtPoint(evt.getPoint());
        
        //Captura de los datos de la nota para editarlo
         this.TxtCodCurso.setText(TabListacurso.getValueAt(fila, 0).toString());
         this.TxtNombrecurso.setText(TabListacurso.getValueAt(fila, 1).toString());
         
    }//GEN-LAST:event_TabListacursoMouseClicked

    private void TXTCursoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTCursoKeyPressed
        // TODO add your handling code here:
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        Logica.ClsCurso curso=new  Logica.ClsCurso();
                //Extraemos la lista de personas dentro de un modelo
        modelo=curso.BusquedaCursos(this.TXTCurso.getText().trim());
        
        //Asociamos el modelo al JTable
        this.TabListacurso.setModel(modelo);
        
         //Oculta la primera columna
        OcultarColumnaTabla();
    }//GEN-LAST:event_TXTCursoKeyPressed

    private void TXTBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTBuscarActionPerformed

    private void TXTCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCursoActionPerformed

    private void TabListaalumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabListaalumnoMouseClicked
        // TODO add your handling code here:
        int fila=TabLista.rowAtPoint(evt.getPoint());
        
        //Captura de los datos de la nota para editarlo
         this.TxtCodAlumno.setText(TabListaalumno.getValueAt(fila, 0).toString());
         this.TxtNombreAlumno.setText(TabListaalumno.getValueAt(fila, 1).toString()+" "+TabListaalumno.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_TabListaalumnoMouseClicked

    private void TXTAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTAlumnoActionPerformed

    private void TXTAlumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTAlumnoKeyPressed
        // TODO add your handling code here:
        TableModel modelo = new DefaultTableModel();
        Logica.ClsAlumno alumno=new  Logica.ClsAlumno();
                //Extraemos la lista de personas dentro de un modelo
        modelo=alumno.BusquedaAlumnosvista(this.TXTAlumno.getText().trim());
        
        //Asociamos el modelo al JTable
        this.TabListaalumno.setModel(modelo);
        
         //Oculta la primera columna
        OcultarColumnaTabla();
    }//GEN-LAST:event_TXTAlumnoKeyPressed

    private void CmdCursoRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CmdCursoRegistrarMouseClicked
        // TODO add your handling code here:
        cursos f=new cursos();
        f.show();
    }//GEN-LAST:event_CmdCursoRegistrarMouseClicked

    private void CmdAlumnoRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CmdAlumnoRegistrarMouseClicked
        // TODO add your handling code here:
        /*FRMAlumnos f=new FRMAlumnos();
        f.show();*/
          estudiante EST = new estudiante();
        EST.setVisible(true);
        EST.setLocationRelativeTo(null);
        EST.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        this.dispose();
    }//GEN-LAST:event_CmdAlumnoRegistrarMouseClicked

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
        menuprof MEN = new menuprof();
        MEN.setAlwaysOnTop( true );
        MEN.setVisible(true);
        int x = (int) rect.getMaxX() - MEN.getWidth();
        int y = 2;
        MEN.setLocation(x, y);
        MEN.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater
        (new Runnable() 
                       {
                              public void run() 
                              {
                                       new notas().setVisible(true);  
                              }
                     }
           );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JComboBox CBXUnidad;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Cerrar1;
    private javax.swing.JButton CmdAlumnoRegistrar;
    private javax.swing.JButton CmdCursoRegistrar;
    private javax.swing.JLabel Curso;
    private javax.swing.JLabel Curso2;
    private javax.swing.ButtonGroup GrupoSexo;
    private javax.swing.JPanel PanelCurso;
    private javax.swing.JPanel PanelCurso2;
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField TXTAlumno;
    private javax.swing.JTextField TXTBuscar;
    private javax.swing.JTextField TXTCurso;
    private javax.swing.JTable TabLista;
    private javax.swing.JTable TabListaalumno;
    private javax.swing.JTable TabListacurso;
    private javax.swing.JTextField TxtCodAlumno;
    private javax.swing.JTextField TxtCodCurso;
    private javax.swing.JTextField TxtNombreAlumno;
    private javax.swing.JTextField TxtNombrecurso;
    private javax.swing.JTextField TxtPromedio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables

    
 /**Métodos Auxiliares*/
    private void ListarNotas(int id){ //Cargamos la tabla con la lista de personas
         //Creamos un objeto nota
        Logica.ClsNotas nota=new Logica.ClsNotas();
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        //Extraemos la lista de personas dentro de un modelo
        modelo=nota.ListarNotaProf(id);

        //Asociamos el modelo al JTable
        this.TabLista.setModel(modelo);
        
        //Oculta lascolumnas codigo
        OcultarColumnaTablaNotas();
    }
    
    
        private void ListarCursos(int id){ //Cargamos la tabla con la lista de personas
         //Creamos un objeto nota
        Logica.ClsCurso nota=new Logica.ClsCurso();
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        //Extraemos la lista de personas dentro de un modelo
        modelo=nota.ListarCursosProf(id);

        //Asociamos el modelo al JTable
        this.TabListacurso.setModel(modelo);
        
        //Oculta la primera columna
        OcultarColumnaTabla();
    }
        
             private void ListarAlumnos(){ //Cargamos la tabla con la lista de personas
         //Creamos un objeto nota
        Logica.ClsAlumno alumnito=new Logica.ClsAlumno();
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        //Extraemos la lista de personas dentro de un modelo
        modelo=alumnito.ListarAlumnosvista();

        //Asociamos el modelo al JTable
        this.TabListaalumno.setModel(modelo);
        
        //Oculta la primera columna
        OcultarColumnaTabla();
    }
        
        
    
    

    public void Limpiarcampos(){
       this.CBXUnidad.setSelectedIndex(0);
       this.TxtCodCurso.setText("");
       this.TxtCodAlumno.setText("");
       this.TxtPromedio.setText("");
       this.TxtNombreAlumno.setText("");
       this.TxtNombrecurso.setText("");
    }
    
    private  void OcultarColumnaTabla(){
            //Oculta la primera columna de la tabla
       this.TabListaalumno.getColumnModel().getColumn(0).setMaxWidth(0);
       this.TabListaalumno.getColumnModel().getColumn(0).setMinWidth(0);
       this.TabListaalumno. getColumnModel().getColumn(0).setPreferredWidth(0);
       
       this.TabListacurso.getColumnModel().getColumn(0).setMaxWidth(0);
       this.TabListacurso.getColumnModel().getColumn(0).setMinWidth(0);
       this.TabListacurso. getColumnModel().getColumn(0).setPreferredWidth(0);
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
