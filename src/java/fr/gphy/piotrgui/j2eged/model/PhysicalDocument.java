package fr.gphy.piotrgui.j2eged.model;
// Generated 2 oct. 2013 16:50:55 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * PhysicalDocument generated by hbm2java
 */
public class PhysicalDocument  implements java.io.Serializable {


     private Integer idPhysicalDocument;
     private byte[] binaryBlob;

    public PhysicalDocument() {
    }

	
    public PhysicalDocument(byte[] binaryBlob) {
        this.binaryBlob = binaryBlob;
    }
    public PhysicalDocument(byte[] binaryBlob, Set<Document> documents) {
       this.binaryBlob = binaryBlob;
    }
   
    public Integer getIdPhysicalDocument() {
        return this.idPhysicalDocument;
    }
    
    public void setIdPhysicalDocument(Integer idPhysicalDocument) {
        this.idPhysicalDocument = idPhysicalDocument;
    }
    public byte[] getBinaryBlob() {
        return this.binaryBlob;
    }
    
    public void setBinaryBlob(byte[] binaryBlob) {
        this.binaryBlob = binaryBlob;
    }




}

