package fr.gphy.piotrgui.j2eged.controllers;

import fr.gphy.piotrgui.j2eged.helpers.BrowserHelper;
import fr.gphy.piotrgui.j2eged.model.Document;
import fr.gphy.piotrgui.j2eged.model.Folder;
import fr.gphy.piotrgui.j2eged.model.Metadata;
import javax.faces.event.ActionEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * 
 * @author Piotr
 */
@ManagedBean(name="BrowserController")
@SessionScoped
public class BrowserController implements Serializable {

    private List<Object[]> data;
    private List<Folder> folders;
    private List<DisplayDoc> toDisplay = new ArrayList<>();
    private BrowserHelper helper = new BrowserHelper();
    private Folder currenFolder = null;

    public List<Object[]> getData() {
        return data;
    }

    public void setData(List<Object[]> data) {
        this.data = data;
    }

    public List<DisplayDoc> getToDisplay() {
        return toDisplay;
    }

    public void setToDisplay(List<DisplayDoc> toDisplay) {
        this.toDisplay = toDisplay;
    }
    
    public void clear() {
        this.toDisplay = new ArrayList<>();
    }

    public void loadDocument() {
        this.clear();
        
        this.data = this.helper.getDocuments(null);
        this.folders = this.helper.getFolders(1);
        this.loadToDisplay();
    }

    public void loadToDisplay() {
        for (Object[] row : this.data) {
            this.toDisplay.add(new DisplayDoc((Document) row[0], (Metadata) row[1]));
        }
        
        for (Folder fold : this.folders) {
            this.toDisplay.add(new DisplayDoc(fold));
        }
    }

    public void clickOnFolder(ActionEvent event) {
        System.err.println("TOTO");
        System.err.println(event.getSource());
    }
    
    public void clickOnUpload() {
        System.err.println("Upload");
    }
    
    
    public class DisplayDoc {

        private Document doc = null;
        private Metadata meta = null;

        private Folder folder = null;
        
        public DisplayDoc(Document doc, Metadata meta) {
            this.doc = doc;
            this.meta = meta;
        }

        public DisplayDoc(Folder folder) {
            this.folder = folder;
        }

        public Folder getFolder() {
            return folder;
        }

        public void setFolder(Folder folder) {
            this.folder = folder;
        }
        
        public Document getDoc() {
            return doc;
        }

        public Metadata getMeta() {
            return meta;
        }
        
        public Boolean isFolder() {
            return (this.folder != null);
        }
    }
}