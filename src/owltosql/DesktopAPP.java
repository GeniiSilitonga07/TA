package owltosql;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.apache.commons.io.FilenameUtils;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.jena.ontology.DatatypeProperty;
import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.ObjectProperty;
import org.apache.jena.ontology.OntProperty;
import static owltosql.DesktopAPP.owlFactCB;

public class DesktopAPP extends javax.swing.JFrame {
    static String file;
    static String extension;
    static OntModel model;
    public DesktopAPP() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonBrowseFile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OutputArea = new javax.swing.JTextArea();
        jButtonViewClassProperty = new javax.swing.JButton();
        jButtonViewFactDimension = new javax.swing.JButton();
        jButtonViewDimensionAttribute = new javax.swing.JButton();
        javax.swing.JButton jButtonSelectFactDimension = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("OWL2SQL");

        jButtonBrowseFile.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButtonBrowseFile.setText("Browse File");
        jButtonBrowseFile.setActionCommand("btnBrowseFile");
        jButtonBrowseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrowseFile(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Output");

        OutputArea.setEditable(false);
        OutputArea.setColumns(20);
        OutputArea.setRows(5);
        jScrollPane1.setViewportView(OutputArea);

        jButtonViewClassProperty.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButtonViewClassProperty.setText("View Class and Property");
        jButtonViewClassProperty.setActionCommand("btnViewClassProperty");
        jButtonViewClassProperty.setMaximumSize(new java.awt.Dimension(205, 23));
        jButtonViewClassProperty.setMinimumSize(new java.awt.Dimension(205, 23));
        jButtonViewClassProperty.setPreferredSize(new java.awt.Dimension(205, 23));
        jButtonViewClassProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewClassProperty(evt);
            }
        });

        jButtonViewFactDimension.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButtonViewFactDimension.setText("View Fact and Dimension");
        jButtonViewFactDimension.setActionCommand("btnSelectFactDimension");
        jButtonViewFactDimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewtFactDimension(evt);
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

        jButtonSelectFactDimension.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButtonSelectFactDimension.setText("Select Fact and Dimension");
        jButtonSelectFactDimension.setActionCommand("btnSelectFactDimension");
        jButtonSelectFactDimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectFactDimension(evt);
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
                                    .addComponent(jButtonViewClassProperty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonViewDimensionAttribute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonViewFactDimension, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSelectFactDimension, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1)
                                .addGap(41, 41, 41)
                                .addComponent(jButtonBrowseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jButtonBrowseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonViewClassProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonViewDimensionAttribute, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonViewFactDimension, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSelectFactDimension, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // Nothing to do
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonBrowseFile(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBrowseFile
        final JFileChooser fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        fc.showSaveDialog(null);
        file = fc.getSelectedFile().getAbsolutePath();
        jTextField1.setText(file);
    }//GEN-LAST:event_jButtonBrowseFile
    
    private boolean checkFileExtension(String file){
        extension = FilenameUtils.getExtension(file);
        boolean rFile = false;
        if("owl".equals(extension)){
            rFile = true;
        }
        return rFile;
    }
    
    private void readOntologyModel(String file) throws FileNotFoundException{
        File owl_file = new File(file);
        FileReader reader = new FileReader(owl_file);
        model = ModelFactory .createOntologyModel(OntModelSpec.OWL_DL_MEM);
        model.read(reader,null);
    }
    
    private void btnViewClassProperty(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewClassProperty
        OutputArea.setText(null);
        boolean readFile = checkFileExtension(file);
        if(readFile==false){
            JOptionPane.showMessageDialog(null, "File is not valid!");
            System.out.print(extension);
        }else if(readFile==true){
            try {
                readOntologyModel(file);
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
                            OutputArea.append("     Individual: "+ owlIndividual.getLocalName() + "\n");
                        }
                        System.out.println("\n");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }                           
    }//GEN-LAST:event_btnViewClassProperty
    
    private boolean checkDataType(OntProperty owlProperty){
        boolean dtBool;
        if("int".equals(owlProperty.getRange().getLocalName())|
           "integer".equals(owlProperty.getRange().getLocalName())|
           "double".equals(owlProperty.getRange().getLocalName())|
           "decimal".equals(owlProperty.getRange().getLocalName())|
           "float".equals(owlProperty.getRange().getLocalName())|
           "date".equals(owlProperty.getRange().getLocalName())|
           "long".equals(owlProperty.getRange().getLocalName())|
           "dateTime".equals(owlProperty.getRange().getLocalName())|
           "dateTimeStamp".equals(owlProperty.getRange().getLocalName())|
           "time".equals(owlProperty.getRange().getLocalName())|
           "short".equals(owlProperty.getRange().getLocalName())|
           "unsignedInt".equals(owlProperty.getRange().getLocalName()))
        {
            dtBool = true;                        
        }else{
            dtBool = false;
        }
        return dtBool;
    }
    
    private boolean checkIfFactAttrisntNull(String[] owlFactAttribute){
        boolean notNull = false;
        if(owlFactAttribute!=null){
            notNull = true;
        }
        return notNull;
    }
    
    private boolean checkIfFactAttrExist(String[][] owlFactAttribute, String attrName, int factNum, int attrNum){
        boolean isExist = false;
        int i;
        for(i=0; i<attrNum; i++){
            if(owlFactAttribute[factNum][i]!=null){
                if(owlFactAttribute[factNum][i].equals(attrName)){
                    isExist = true;
                }
            }
        }
        
        return isExist;
    }
    
    private boolean checkIfArrDimisntNull(String[] owlFactDimension){
        boolean notNull = false;
        if(owlFactDimension!=null){
            notNull = true;
        }
        
        return notNull;
    }
    
    private boolean checkIfExistDimension(String[][] owlFactDimension, String dimName, int factNum, int dimNum){
        boolean isExist = false;
        int i;
        for(i=0; i<dimNum; i++){
            if(owlFactDimension[factNum][i]!=null){
                if(owlFactDimension[factNum][i].equals(dimName)){
                    isExist = true;
                }
            }
        }
        
        return isExist;
    }
    
    public String owlFactS[] = new String[100],
            owlFactAttributeS[][] = new String[100][500], 
            owlFactAttributeDTS[] = new String[500],
            owlFactDimensionS[][] = new String[100][500],
            owlFactDimensionAttrS[][][] = new String[100][500][1000],
            owlFactDimensionAttrDTS[] = new String[1000];
  
    public int counterFactS = 0, 
            counterFactAttrS = 0,  
            counterFactDimS = 0,
            counterFactAttrMS = 0,
            counterDimAttrS=0;
    
    private void btnViewtFactDimension(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewtFactDimension
        String owlFact[] = new String[100],
        owlFactAttribute[][] = new String[100][500], 
        owlFactAttributeDT[] = new String[500],
        owlFactDimension[][] = new String[100][500],
        owlFactDimensionAttr[][][] = new String[100][500][1000],
        owlFactDimensionAttrDT[] = new String[1000];
  
        int counterFact = 0, 
        counterFactAttr = 0,  
        counterFactDim = 0,
        counterFactAttrM = 0,
        counterDimAttr=0;
        
        OutputArea.setText(null);
        boolean readFile = checkFileExtension(file);
        if(readFile==false){
            JOptionPane.showMessageDialog(null, "File is not valid!");
            System.out.print(extension);
        }else if(readFile==true){
            try {
                readOntologyModel(file);
                Iterator classIter = model.listClasses();
                while (classIter.hasNext()){
                    OntClass owlClass = (OntClass) classIter.next();                   
                    if(owlClass.getLocalName()!=null){
                        Iterator ontProperty = owlClass.listDeclaredProperties();
                        while(ontProperty.hasNext()){
                            OntProperty owlProperty = (OntProperty) ontProperty.next();
                            if(owlProperty.getLocalName()!=null){
                                if(owlProperty.canAs(DatatypeProperty.class)&&owlProperty.getRange()!=null){
                                    if(checkIfFactAttrisntNull(owlFactAttribute[counterFact])==false){
                                        if(checkDataType(owlProperty)==true){
                                            owlFactAttribute[counterFact][counterFactAttr] = owlProperty.getLocalName();
                                            owlFactAttributeDT[counterFactAttr] = owlProperty.getRange().getLocalName();
                                            counterFactAttrM++;
                                            counterFactAttr++;
                                        }else{
                                            owlFactAttribute[counterFact][counterFactAttr] = owlProperty.getLocalName();
                                            owlFactAttributeDT[counterFactAttr] = owlProperty.getRange().getLocalName();
                                            counterFactAttr++;
                                        } 
                                    }else if(checkIfFactAttrisntNull(owlFactAttribute[counterFact])==true){
                                        if(checkIfFactAttrExist(owlFactAttribute, owlProperty.getLocalName(), counterFact, counterFactAttr)==false){
                                            if(checkDataType(owlProperty)==true){
                                                owlFactAttribute[counterFact][counterFactAttr] = owlProperty.getLocalName();
                                                owlFactAttributeDT[counterFactAttr] = owlProperty.getRange().getLocalName();
                                                counterFactAttrM++;
                                                counterFactAttr++;
                                            }else{
                                                owlFactAttribute[counterFact][counterFactAttr] = owlProperty.getLocalName();
                                                owlFactAttributeDT[counterFactAttr] = owlProperty.getRange().getLocalName();
                                                counterFactAttr++;
                                            }
                                        }
                                    }
                                }else if(owlProperty.canAs(ObjectProperty.class)&&owlProperty.getRange()!=null){
                                    if(checkIfArrDimisntNull(owlFactDimension[counterFact])==false){
                                        owlFactDimension[counterFact][counterFactDim] = owlProperty.getRange().getLocalName();
                                        
                                        Iterator dimIter = model.listClasses();
                                        while(dimIter.hasNext()){
                                            OntClass owlDim = (OntClass) dimIter.next();
                                            if(owlDim.getLocalName()!=null){
                                                if(owlDim.getLocalName().equals(owlFactDimension[counterFact][counterFactDim])){
                                                    Iterator ontDimProperty = owlDim.listDeclaredProperties();
                                                    while(ontDimProperty.hasNext()){
                                                        OntProperty owlDimProperty = (OntProperty) ontDimProperty.next();
                                                        if(owlDimProperty.getLocalName()!=null){
                                                            if(owlDimProperty.canAs(DatatypeProperty.class)&&owlDimProperty.getRange()!=null){
                                                                owlFactDimensionAttr[counterFact][counterFactDim][counterDimAttr] = owlDimProperty.getLocalName();
                                                                owlFactDimensionAttrDT[counterDimAttr] = owlDimProperty.getRange().getLocalName();
                                                                counterDimAttr++;
                                                            }
                                                        }
                                                    }
                                                    owlFactDimensionAttr[counterFact][counterFactDim][counterDimAttr] = owlDim.getLocalName()+"ID";
                                                    owlFactDimensionAttrDT[counterDimAttr] = "int";
                                                    owlFactAttribute[counterFact][counterFactAttr] = owlDim.getLocalName()+"ID";
                                                    owlFactAttributeDT[counterFactAttr] = "int";
                                                    counterFactAttr++;
                                                    counterFactAttrM++;
                                                    counterDimAttr++;
                                                }
                                            }
                                        }
                                        counterFactDim++;
                                    }else if(checkIfArrDimisntNull(owlFactDimension[counterFact])==true){
                                        if(checkIfExistDimension(owlFactDimension, owlProperty.getRange().getLocalName(), counterFact, counterFactDim)==false){
                                            owlFactDimension[counterFact][counterFactDim] = owlProperty.getRange().getLocalName();
                                            
                                            Iterator dimIter = model.listClasses();
                                            while(dimIter.hasNext()){
                                                OntClass owlDim = (OntClass) dimIter.next();
                                                if(owlDim.getLocalName()!=null){
                                                    if(owlDim.getLocalName().equals(owlFactDimension[counterFact][counterFactDim])){
                                                        Iterator ontDimProperty = owlDim.listDeclaredProperties();
                                                        while(ontDimProperty.hasNext()){
                                                            OntProperty owlDimProperty = (OntProperty) ontDimProperty.next();
                                                            if(owlDimProperty.getLocalName()!=null){
                                                                if(owlDimProperty.canAs(DatatypeProperty.class)&&owlDimProperty.getRange()!=null){
                                                                    owlFactDimensionAttr[counterFact][counterFactDim][counterDimAttr] = owlDimProperty.getLocalName();
                                                                    owlFactDimensionAttrDT[counterDimAttr] = owlDimProperty.getRange().getLocalName();
                                                                    counterDimAttr++;
                                                                }
                                                            }
                                                        }
                                                        owlFactDimensionAttr[counterFact][counterFactDim][counterDimAttr] = owlDim.getLocalName()+"ID";
                                                        owlFactDimensionAttrDT[counterDimAttr] = "int";
                                                        owlFactAttribute[counterFact][counterFactAttr] = owlDim.getLocalName()+"ID";
                                                        owlFactAttributeDT[counterFactAttr] = "int";
                                                        counterFactAttr++;
                                                        counterFactAttrM++;
                                                        counterDimAttr++;
                                                    }
                                                }
                                            }
                                            counterFactDim++;
                                        }
                                    }
                                }
                            }
                        }
                        
                        if(counterFactAttrM>0 && counterFactDim>1){
                            owlFact[counterFact] = owlClass.getLocalName();
                            owlFactAttribute[counterFact][counterFactAttr] = owlClass.getLocalName()+"ID";
                            owlFactAttributeDT[counterFactAttr] = "int";
                            counterFactAttrM++;
                            counterFactAttr++;
                             
                            owlFactDimension[counterFact][counterFactDim] = "DimDate";
                            owlFactDimensionAttr[counterFact][counterFactDim][counterDimAttr] = "DimDateID";
                            owlFactDimensionAttrDT[counterDimAttr] = "dateTime";
                            counterDimAttr++;
                            owlFactDimensionAttr[counterFact][counterFactDim][counterDimAttr] = "CalendarMonthNumberInYear";
                            owlFactDimensionAttrDT[counterDimAttr]= "dateTime";
                            counterDimAttr++;
                            owlFactDimensionAttr[counterFact][counterFactDim][counterDimAttr] = "DayNumberCalendarMonth";
                            owlFactDimensionAttrDT[counterDimAttr]= "dateTime";
                            counterDimAttr++;
                            owlFactDimensionAttr[counterFact][counterFactDim][counterDimAttr] = "DayOfWeek";
                            owlFactDimensionAttrDT[counterDimAttr]= "dateTime";
                            counterDimAttr++;
                            owlFactDimensionAttr[counterFact][counterFactDim][counterDimAttr] = "CalendarMonthName";
                            owlFactDimensionAttrDT[counterDimAttr]= "dateTime";
                            counterDimAttr++;
                            owlFactDimensionAttr[counterFact][counterFactDim][counterDimAttr] = "FullDateDescription";
                            owlFactDimensionAttrDT[counterDimAttr]= "dateTime";
                            counterDimAttr++;
                            owlFactDimensionAttr[counterFact][counterFactDim][counterDimAttr] = "LastDayInMonthIndicator";
                            owlFactDimensionAttrDT[counterDimAttr]= "dateTime";
                            counterDimAttr++;
                            owlFactDimensionAttr[counterFact][counterFactDim][counterDimAttr] = "CalendarWeekNumberInYear";
                            owlFactDimensionAttrDT[counterDimAttr]= "dateTime";
                            counterDimAttr++;
                            owlFactDimensionAttr[counterFact][counterFactDim][counterDimAttr] = "CalendarWeekEndingDate";
                            owlFactDimensionAttrDT[counterDimAttr]= "dateTime";
                            counterDimAttr++;
                            owlFactDimensionAttr[counterFact][counterFactDim][counterDimAttr] = "Date";
                            owlFactDimensionAttrDT[counterDimAttr]= "dateTime";
                            counterDimAttr++;
                            owlFactDimensionAttr[counterFact][counterFactDim][counterDimAttr] = "DayNumberCalendarYear";
                            owlFactDimensionAttrDT[counterDimAttr]= "dateTime";
                            counterDimAttr++;
                            
                            owlFactAttribute[counterFact][counterFactAttr] = "DimDateID";
                            owlFactAttributeDT[counterFactAttr] = "dateTime";
                            counterFactAttr++;
                            counterFactAttrM++;
                            counterFactDim++;

                            OutputArea.append("Fact: "+ owlFact[counterFact]+"\n");
                            
                            int i, j, k;
                            for(i=0; i<counterFactAttr; i++){
                                if(owlFactAttribute[counterFact][i]!=null){
                                    OutputArea.append("-->Fact Attribute: "+ owlFactAttribute[counterFact][i] + "| "+ owlFactAttributeDT[i]+ "\n");
                                }
                            }
                            for(j=0; j<counterFactDim; j++){
                                if(owlFactDimension[counterFact][j]!=null){
                                    OutputArea.append("---->Dimension: "+ owlFactDimension[counterFact][j] + "\n");
                                    for(k=0;k<counterDimAttr; k++){
                                        if(owlFactDimensionAttr[counterFact][j][k]!=null){
                                            OutputArea.append("------>Dimension Attr: " + owlFactDimensionAttr[counterFact][j][k] + " | "+ owlFactDimensionAttrDT[k]+ "\n");
                                        }
                                    }
                                }
                            }
                            OutputArea.append("\n");
                            counterFact++;
                        }
                        
                    }
                    counterFactAttr = 0;
                    counterFactAttrM = 0;
                    counterFactDim = 0;
                }
                
            }catch (Exception e) { 
                e.printStackTrace(); 
            }
        }
    }//GEN-LAST:event_btnViewtFactDimension

    private void btnViewDimensionAttribute(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDimensionAttribute
        String owlDim[] = new String[500],
               owlDimAttr[][] = new String[500][500],
               owlDimAttrDT[][][] = new String[500][500][500];
        
        int counterDim = 0,
            counterDimAttr = 0;
        
        OutputArea.setText(null);
        boolean readFile = checkFileExtension(file);
        if(readFile==false){
            JOptionPane.showMessageDialog(null, "File is not valid!");
            System.out.print(extension);
        }else if(readFile==true){
            try {
                readOntologyModel(file);
                Iterator classIter = model.listClasses();
                
                while (classIter.hasNext()) {
                    OntClass owlDimension = (OntClass) classIter.next();
                    if(owlDimension.getLocalName() != null){
                        Iterator ontProperty = owlDimension.listDeclaredProperties();
                        while (ontProperty.hasNext()){
                           OntProperty owlDimAttribute = (OntProperty) ontProperty.next();
                           if (owlDimAttribute.getLocalName() != null){
                                if (owlDimAttribute.canAs(DatatypeProperty.class)&&owlDimAttribute.getRange()!=null){
                                    owlDimAttr[counterDim][counterDimAttr] = owlDimAttribute.getLocalName();
                                    owlDimAttrDT[counterDim][counterDimAttr][counterDimAttr] = owlDimAttribute.getRange().getLocalName();
                                    counterDimAttr++;
                                }
                            }
                        }
                    
                        if(counterDimAttr!=0){
                            owlDim[counterDim] = owlDimension.getLocalName();
                            if(owlDim[counterDim]!=null){
                                OutputArea.append("Dimension: " + owlDim[counterDim] + "\n");
                            }
                        
                            int i;
                            for(i=0; i<counterDimAttr; i++){
                                if(owlDimAttr[counterDim][i]!=null){
                                    OutputArea.append("-->Attribute: " + owlDimAttr[counterDim][i] + " | " + owlDimAttrDT[counterDim][i][i] + "\n");
                                }
                            }
                            OutputArea.append("\n");
                            counterDim++;
                        }
                        counterDimAttr=0;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnViewDimensionAttribute
    
    static JCheckBox[] owlFactCB;
    
    private void jButtonSelectFactDimension(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelectFactDimension
        OutputArea.setText(null);
        
        boolean readFile = checkFileExtension(file);
        if(readFile==false){
            JOptionPane.showMessageDialog(null, "File is not valid!");
            System.out.print(extension);
        }else if(readFile==true){
            try {
                readOntologyModel(file);
                Iterator classIter = model.listClasses();
                while (classIter.hasNext()){
                    OntClass owlClass = (OntClass) classIter.next();                   
                    if(owlClass.getLocalName()!=null){
                        Iterator ontProperty = owlClass.listDeclaredProperties();
                        while(ontProperty.hasNext()){
                            OntProperty owlProperty = (OntProperty) ontProperty.next();
                            if(owlProperty.getLocalName()!=null){
                                if(owlProperty.canAs(DatatypeProperty.class)&&owlProperty.getRange()!=null){
                                    if(checkIfFactAttrisntNull(owlFactAttributeS[counterFactS])==false){
                                        if(checkDataType(owlProperty)==true){
                                            owlFactAttributeS[counterFactS][counterFactAttrS] = owlProperty.getLocalName();
                                            owlFactAttributeDTS[counterFactAttrS] = owlProperty.getRange().getLocalName();
                                            counterFactAttrMS++;
                                            counterFactAttrS++;
                                        }else{
                                            owlFactAttributeS[counterFactS][counterFactAttrS] = owlProperty.getLocalName();
                                            owlFactAttributeDTS[counterFactAttrS] = owlProperty.getRange().getLocalName();
                                            counterFactAttrS++;
                                        } 
                                    }else if(checkIfFactAttrisntNull(owlFactAttributeS[counterFactS])==true){
                                        if(checkIfFactAttrExist(owlFactAttributeS, owlProperty.getLocalName(), counterFactS, counterFactAttrS)==false){
                                            if(checkDataType(owlProperty)==true){
                                                owlFactAttributeS[counterFactS][counterFactAttrS] = owlProperty.getLocalName();
                                                owlFactAttributeDTS[counterFactAttrS] = owlProperty.getRange().getLocalName();
                                                counterFactAttrMS++;
                                                counterFactAttrS++;
                                            }else{
                                                owlFactAttributeS[counterFactS][counterFactAttrS] = owlProperty.getLocalName();
                                                owlFactAttributeDTS[counterFactAttrS] = owlProperty.getRange().getLocalName();
                                                counterFactAttrS++;
                                            }
                                        }
                                    }
                                }else if(owlProperty.canAs(ObjectProperty.class)&&owlProperty.getRange()!=null){
                                    if(checkIfArrDimisntNull(owlFactDimensionS[counterFactS])==false){
                                        owlFactDimensionS[counterFactS][counterFactDimS] = owlProperty.getRange().getLocalName();
                                        
                                        Iterator dimIter = model.listClasses();
                                        while(dimIter.hasNext()){
                                            OntClass owlDim = (OntClass) dimIter.next();
                                            if(owlDim.getLocalName()!=null){
                                                if(owlDim.getLocalName().equals(owlFactDimensionS[counterFactS][counterFactDimS])){
                                                    Iterator ontDimProperty = owlDim.listDeclaredProperties();
                                                    while(ontDimProperty.hasNext()){
                                                        OntProperty owlDimProperty = (OntProperty) ontDimProperty.next();
                                                        if(owlDimProperty.getLocalName()!=null){
                                                            if(owlDimProperty.canAs(DatatypeProperty.class)&&owlDimProperty.getRange()!=null){
                                                                owlFactDimensionAttrS[counterFactS][counterFactDimS][counterDimAttrS] = owlDimProperty.getLocalName();
                                                                owlFactDimensionAttrDTS[counterDimAttrS] = owlDimProperty.getRange().getLocalName();
                                                                counterDimAttrS++;
                                                            }
                                                        }
                                                    }
                                                    owlFactDimensionAttrS[counterFactS][counterFactDimS][counterDimAttrS] = owlDim.getLocalName()+"ID";
                                                    owlFactDimensionAttrDTS[counterDimAttrS] = "int";
                                                    owlFactAttributeS[counterFactS][counterFactAttrS] = owlDim.getLocalName()+"ID";
                                                    owlFactAttributeDTS[counterFactAttrS] = "int";
                                                    counterFactAttrS++;
                                                    counterFactAttrMS++;
                                                    counterDimAttrS++;
                                                }
                                            }
                                        }
                                        counterFactDimS++;
                                    }else if(checkIfArrDimisntNull(owlFactDimensionS[counterFactS])==true){
                                        if(checkIfExistDimension(owlFactDimensionS, owlProperty.getRange().getLocalName(), counterFactS, counterFactDimS)==false){
                                            owlFactDimensionS[counterFactS][counterFactDimS] = owlProperty.getRange().getLocalName();
                                            
                                            Iterator dimIter = model.listClasses();
                                            while(dimIter.hasNext()){
                                                OntClass owlDim = (OntClass) dimIter.next();
                                                if(owlDim.getLocalName()!=null){
                                                    if(owlDim.getLocalName().equals(owlFactDimensionS[counterFactS][counterFactDimS])){
                                                        Iterator ontDimProperty = owlDim.listDeclaredProperties();
                                                        while(ontDimProperty.hasNext()){
                                                            OntProperty owlDimProperty = (OntProperty) ontDimProperty.next();
                                                            if(owlDimProperty.getLocalName()!=null){
                                                                if(owlDimProperty.canAs(DatatypeProperty.class)&&owlDimProperty.getRange()!=null){
                                                                    owlFactDimensionAttrS[counterFactS][counterFactDimS][counterDimAttrS] = owlDimProperty.getLocalName();
                                                                    owlFactDimensionAttrDTS[counterDimAttrS] = owlDimProperty.getRange().getLocalName();
                                                                    counterDimAttrS++;
                                                                }
                                                            }
                                                        }
                                                        owlFactDimensionAttrS[counterFactS][counterFactDimS][counterDimAttrS] = owlDim.getLocalName()+"ID";
                                                        owlFactDimensionAttrDTS[counterDimAttrS] = "int";
                                                        owlFactAttributeS[counterFactS][counterFactAttrS] = owlDim.getLocalName()+"ID";
                                                        owlFactAttributeDTS[counterFactAttrS] = "int";
                                                        counterFactAttrS++;
                                                        counterFactAttrMS++;
                                                        counterDimAttrS++;
                                                    }
                                                }
                                            }
                                            counterFactDimS++;
                                        }
                                    }
                                }
                            }
                        }
                        
                        if(counterFactAttrMS>0 && counterFactDimS>1){
                            owlFactS[counterFactS] = owlClass.getLocalName();
                            owlFactAttributeS[counterFactS][counterFactAttrS] = owlClass.getLocalName()+"ID";
                            owlFactAttributeDTS[counterFactAttrS] = "int";
                            counterFactAttrMS++;
                            counterFactAttrS++;
                            counterFactS++;
                        }
                        
                    }
                    counterFactAttrS = 0;
                    counterFactAttrMS = 0;
                    counterFactDimS = 0;
                }
                
            }catch (Exception e) { 
                e.printStackTrace(); 
            }
           
            Listener listener = new Listener();
            
            JFrame sFrame = new JFrame();
            JPanel topPanel = new JPanel();
            JPanel midPanel = new JPanel();
            JPanel btmPanel = new JPanel();
            JButton btnConvert = new JButton("Create SQL");
            btnConvert.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(selectionCounter==0){
                        JOptionPane.showMessageDialog(null, "Choose one Fact!");
                    }else{
                        int i, flagFact = 0;
                        for(i=0; i<counterFactS; i++){
                            if(owlFactS[i]==selectedFact){
                                flagFact=i;
                                break;
                            }
                        }
                        FileWriter fw;    
                        try {
                            fw = new FileWriter("E:\\Semester 8\\TA2\\ConversionResult\\new_"+owlFactS[flagFact]+".sql");
                            fw.write("DROP DATABASE IF EXISTS `NEW_"+owlFactS[flagFact]+"_DB`;\n\n");
                            fw.write("CREATE DATABASE `NEW_"+owlFactS[flagFact]+"_DB`;\n\n");
                            fw.write("DROP TABLE IF EXISTS `"+ owlFactS[flagFact]+"_FACT"+"`;\n\n");
                            fw.write("CREATE TABLE "+ owlFactS[flagFact]+"_FACT(\n");
                            for(i=0; i<owlFactAttributeS[flagFact].length; i++){
                                if(owlFactAttributeS[flagFact][i]!=null&&owlFactAttributeDTS[i]!=null){
                                    
//                                    if(owlFactAttributeDT[i]=="string"){
//                                        fw.write("\t" + owlFactAttribute[flagFact][i] + " " + "varchar" + " " + " NOT NULL,\n");
//                                    }else{
//                                        fw.write("\t" + owlFactAttributeS[flagFact][i] + " " + owlFactAttributeDTS[i] + " " + " NOT NULL,\n");
//                                    }
                                }
                            }
//                            fw.write("\tPRIMARY KEY (`"+owlFactAttribute[flagFact][owlFactAttribute[flagFact].length]+"`),\n");
//                            for(i=0; i<owlFactDimension[flagFact].length; i++){
//                                fw.write("\tKEY `FK_"+owlFact[flagFact]+ i+1 +"` (`"+
//                                        owlFactDimensionAttr[flagFact][i][owlFactDimensionAttr[flagFact][i].length]+"`),\n");
//                            }
//                            for(i=0; i<owlFactDimension[flagFact].length; i++){
//                                fw.write("\tCONSTRAINT `FK_"+owlFact[flagFact]+ i+1 +"` FOREIGN KEY (`"+
//                                        owlFactDimensionAttr[flagFact][i][owlFactDimensionAttr[flagFact][i].length]+"`) REFERENCES `"+
//                                        owlFactDimension[flagFact][i]+"` (`"+owlFactDimensionAttr[flagFact][i][owlFactDimensionAttr[flagFact][i].length]+"`),\n");
//                            }
                            fw.write(") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;");
                            JOptionPane.showMessageDialog(null, "Creating SQL Success");
                            sFrame.dispose();
                            fw.close();
                        } catch (IOException ex) {
//                            Logger.getLogger(DesktopAPP.class.getName()).log(Level.SEVERE, null, ex);
                            JOptionPane.showMessageDialog(null, "Creating SQL Failed");
                        }
                    }
                }
            });
            JLabel label = new JLabel("Select one Fact:");
            
            JPanel checkBoxPanel = new JPanel();
            checkBoxPanel.setLayout(new GridLayout(20,1,5,5));
            
            topPanel.add(label);
            
            int i;   
            owlFactCB = new JCheckBox[counterFactS];
            for(i=0; i<counterFactS; i++){
                owlFactCB[i] = new JCheckBox(owlFactS[i]);
                owlFactCB[i].addItemListener((ItemListener) listener);
                checkBoxPanel.add(owlFactCB[i]);                    
            }
            
            midPanel.add(checkBoxPanel);
            
            btmPanel.add(btnConvert);
            
            sFrame.add(topPanel, BorderLayout.PAGE_START);
            sFrame.add(midPanel, BorderLayout.CENTER);
            sFrame.add(btmPanel, BorderLayout.PAGE_END);
            sFrame.setSize(700, 600);
            sFrame.setDefaultCloseOperation(sFrame.DISPOSE_ON_CLOSE);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            sFrame.setVisible(true);
            
        }
    }//GEN-LAST:event_jButtonSelectFactDimension
    

    static int selectionCounter = 0;
    
    static String selectedFact;
    
    static class Listener implements ItemListener{
        private final int MAX_SELECTIONS = 1;

        @Override
        public void itemStateChanged(ItemEvent e) {
            JCheckBox source = (JCheckBox) e.getSource();
            if (source.isSelected()) {
                selectionCounter++;
                if (selectionCounter == MAX_SELECTIONS){
                    for (JCheckBox box: owlFactCB){
                        if (!box.isSelected()){
                            box.setEnabled(false);
                        }else{
                            selectedFact = box.getText();
                        }
                    }
                }
            }else {
                selectionCounter--;
                if (selectionCounter < MAX_SELECTIONS)
                    for (JCheckBox box: owlFactCB)
                        box.setEnabled(true);
            }
        }
    }
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
    private javax.swing.JButton jButtonBrowseFile;
    private javax.swing.JButton jButtonViewClassProperty;
    private javax.swing.JButton jButtonViewDimensionAttribute;
    private javax.swing.JButton jButtonViewFactDimension;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}