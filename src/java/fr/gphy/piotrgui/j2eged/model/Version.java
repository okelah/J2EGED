package fr.gphy.piotrgui.j2eged.model;
// Generated 2 oct. 2013 16:50:55 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Version generated by hbm2java
 */
public class Version  implements java.io.Serializable {


     private Integer idVersion;
     private Document document;
     private User user;
     private Metadata metadata;
     private Date changeDate;
     private String commit;

    public Version() {
    }

	
    public Version(Document document, User user, Metadata metadata, Date changeDate) {
        this.document = document;
        this.user = user;
        this.metadata = metadata;
        this.changeDate = changeDate;
    }
    public Version(Document document, User user, Metadata metadata, Date changeDate, String commit) {
       this.document = document;
       this.user = user;
       this.metadata = metadata;
       this.changeDate = changeDate;
       this.commit = commit;
    }
   
    public Integer getIdVersion() {
        return this.idVersion;
    }
    
    public void setIdVersion(Integer idVersion) {
        this.idVersion = idVersion;
    }
    public Document getDocument() {
        return this.document;
    }
    
    public void setDocument(Document document) {
        this.document = document;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Metadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
    public Date getChangeDate() {
        return this.changeDate;
    }
    
    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }
    public String getCommit() {
        return this.commit;
    }
    
    public void setCommit(String commit) {
        this.commit = commit;
    }




}

