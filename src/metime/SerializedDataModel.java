package metime;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jxr5398
 */
public class SerializedDataModel implements Serializable {
    
    private ArrayList listToSave;
    
    public SerializedDataModel(){
        listToSave = new ArrayList();
    }
    
    public SerializedDataModel(ArrayList listToSave){
        this.listToSave = listToSave;
    }
    
    public ArrayList getList(){
        return listToSave;
    }
    
    public void setList(ArrayList listToSave){
        this.listToSave = listToSave;
    }
    
    public boolean isEmpty(){
        return listToSave.isEmpty() || listToSave == null;
    }
}
