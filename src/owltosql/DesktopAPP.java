package owltosql;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;
import org.apache.commons.io.FilenameUtils;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
import javax.swing.JOptionPane;
import org.apache.jena.ontology.DatatypeProperty;
import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.ObjectProperty;
import org.apache.jena.ontology.OntProperty;

public class DesktopAPP extends javax.swing.JFrame {
    static String file;
    static String extension;

    public DesktopAPP() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OutputArea = new javax.swing.JTextArea();
        jButtonViewClassAttribute = new javax.swing.JButton();
        jButtonViewFactDimension = new javax.swing.JButton();
        jButtonTransformtoSQL = new javax.swing.JButton();
        jButtonViewDimensionAttribute = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Transform OWL to SQL");

        jButton1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButton1.setText("Browse OWL File");
        jButton1.setActionCommand("btnBrowse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Output");

        OutputArea.setEditable(false);
        OutputArea.setColumns(20);
        OutputArea.setRows(5);
        jScrollPane1.setViewportView(OutputArea);

        jButtonViewClassAttribute.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButtonViewClassAttribute.setText("View Class and Property");
        jButtonViewClassAttribute.setActionCommand("btnViewClassAttribute");
        jButtonViewClassAttribute.setMaximumSize(new java.awt.Dimension(205, 23));
        jButtonViewClassAttribute.setMinimumSize(new java.awt.Dimension(205, 23));
        jButtonViewClassAttribute.setPreferredSize(new java.awt.Dimension(205, 23));
        jButtonViewClassAttribute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewClassAttribute(evt);
            }
        });

        jButtonViewFactDimension.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButtonViewFactDimension.setText("View Fact and Dimension");
        jButtonViewFactDimension.setActionCommand("btnViewFactDimension");
        jButtonViewFactDimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFactDimension(evt);
            }
        });

        jButtonTransformtoSQL.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButtonTransformtoSQL.setText("Transform to SQL");
        jButtonTransformtoSQL.setActionCommand("btnTransformtoSQL");
        jButtonTransformtoSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransformtoSQL(evt);
            }
        });

        jButtonViewDimensionAttribute.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButtonViewDimensionAttribute.setText("View Dimension and Attribute");
        jButtonViewDimensionAttribute.setActionCommand("btnViewDimensionAttribute");
        jButtonViewDimensionAttribute.setMaximumSize(new java.awt.Dimension(205, 23));
        jButtonViewDimensionAttribute.setMinimumSize(new java.awt.Dimension(205, 23));
        jButtonViewDimensionAttribute.setPreferredSize(new java.awt.Dimension(205, 23));
        jButtonViewDimensionAttribute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDimensionAttribute(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonViewClassAttribute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonViewDimensionAttribute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonViewFactDimension, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonTransformtoSQL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1)
                                .addGap(41, 41, 41)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonViewClassAttribute, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonViewDimensionAttribute, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonViewFactDimension, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTransformtoSQL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // Nothing to do
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        final JFileChooser fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        fc.showSaveDialog(null);
        file = fc.getSelectedFile().getAbsolutePath();
        jTextField1.setText(file);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private boolean checkFileExtension(String file){
        extension = FilenameUtils.getExtension(file);
        boolean rFile = false;
        if(!"owl".equals(extension)&!"xml".equals(extension)){
            rFile = false;
        }else if("owl".equals(extension)|"xml".equals(extension)){
            rFile = true;
        }
        return rFile;
    }
    
    private void btnViewClassAttribute(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewClassAttribute
        OutputArea.setText(null);
        boolean readFile = checkFileExtension(file);
        if(readFile==false){
            JOptionPane.showMessageDialog(null, "File is not valid!");
            System.out.print(extension);
        }else if(readFile==true){
            try {
                File owl_file = new File(file);
                FileReader reader = new FileReader(owl_file);
                OntModel model = ModelFactory .createOntologyModel(OntModelSpec.OWL_DL_MEM);
                model.read(reader,null);
                Iterator classIter = model.listClasses();
                
                while (classIter.hasNext()) {
                    OntClass owlClass = (OntClass) classIter.next();
                    if(owlClass.getLocalName() != null){
                        OutputArea.append("Classes: "+ owlClass.getLocalName());
                        OutputArea.append("\n");
                        Iterator ontProperty = owlClass.listDeclaredProperties();
                        while (ontProperty.hasNext()){
                            OntProperty owlProperty = (OntProperty) ontProperty.next();
                            if (owlProperty.getLocalName() != null){
                                if (owlProperty.canAs(ObjectProperty.class)){
                                    OutputArea.append("     Object Properties: "+ owlProperty.getLocalName());
                                    OutputArea.append("\n");
                                }else if (owlProperty.canAs(DatatypeProperty.class)){
                                    OutputArea.append("     Data Properties: "+ owlProperty.getLocalName());
                                    OutputArea.append("\n");
                                }
                            }
                        }
                        Iterator ontIndividual = owlClass.listInstances();
                        while (ontIndividual.hasNext()){
                            Individual owlIndividual = (Individual) ontIndividual.next();
                            OutputArea.append("     Individual: "+ owlIndividual.getLocalName());
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }                           
    }//GEN-LAST:event_btnViewClassAttribute

    private void btnViewFactDimension(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFactDimension
        OutputArea.setText(null);
        boolean readFile = checkFileExtension(file);
        if(readFile==false){
            JOptionPane.showMessageDialog(null, "File is not valid!");
            System.out.print(extension);
        }else if(readFile==true){
            try {
                File owl_file = new File(file);
                FileReader reader = new FileReader(owl_file);
                OntModel model = ModelFactory .createOntologyModel(OntModelSpec.OWL_DL_MEM);
                model.read(reader,null);
                String owlFact[] = new String[1000];
                String owlRelation[][] = new String[1000][1000];
                String owlDimension[][] = new String[1000][1000];
                int i = 0;
                int j = 0;
                Iterator classIter = model.listClasses();

                while (classIter.hasNext()){
                    OntClass owlClass = (OntClass) classIter.next();
                    if(owlClass.getLocalName() != null){
                        owlFact[i] = owlClass.getLocalName();
                        OutputArea.append("Fact: "+ owlFact[i] +"\n");
                        Iterator ontProperty = owlClass.listDeclaredProperties();
                        while (ontProperty.hasNext()){
                            OntProperty owlProperty = (OntProperty) ontProperty.next();
                            if(owlProperty.canAs(ObjectProperty.class) && owlProperty.getRange() != null){
                                owlRelation[i][j] = owlProperty.getLocalName();
                                OutputArea.append("    Relation: "+ owlRelation[i][j]+"\n");
                                owlDimension[i][j] = owlProperty.getRange().getLocalName();
                                OutputArea.append("        Dimension: "+ owlDimension[i][j]+ "\n");
                            }
                            j++;
                        }
                        i++;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnViewFactDimension

    private void btnTransformtoSQL(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransformtoSQL
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTransformtoSQL

    private void btnViewDimensionAttribute(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDimensionAttribute
        OutputArea.setText(null);
        boolean readFile = checkFileExtension(file);
        if(readFile==false){
            JOptionPane.showMessageDialog(null, "File is not valid!");
            System.out.print(extension);
        }else if(readFile==true){
            try {
                File owl_file = new File(file);
                FileReader reader = new FileReader(owl_file);
                OntModel model = ModelFactory .createOntologyModel(OntModelSpec.OWL_DL_MEM);
                model.read(reader,null);
                Iterator classIter = model.listClasses();
                
                while (classIter.hasNext()) {
                    OntClass owlClass = (OntClass) classIter.next();
                        if(owlClass.getLocalName() != null){
                            OutputArea.append("Dimension: "+ owlClass.getLocalName());
                            OutputArea.append("\n");
                            Iterator ontProperty = owlClass.listDeclaredProperties();
                                while (ontProperty.hasNext()){
                                    OntProperty owlProperty = (OntProperty) ontProperty.next();
                                    if (owlProperty.getLocalName() != null){
                                        if (owlProperty.canAs(DatatypeProperty.class)){
                                            OutputArea.append("     Atribut: "+ owlProperty.getLocalName());
                                            OutputArea.append("\n");
                                        }
                                    }
                                }
                        }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnViewDimensionAttribute

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
            java.util.logging.Logger.getLogger(DesktopAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesktopAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesktopAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesktopAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DesktopAPP().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea OutputArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonTransformtoSQL;
    private javax.swing.JButton jButtonViewClassAttribute;
    private javax.swing.JButton jButtonViewDimensionAttribute;
    private javax.swing.JButton jButtonViewFactDimension;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}