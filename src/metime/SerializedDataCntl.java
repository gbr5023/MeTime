package metime;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public final class SerializedDataCntl {
    
    private static SerializedDataCntl serializedDataController;
    public static String EXTERNAL_DATA_PATH = "data\\";
    
    private SerializedDataModel sdModel;
    
    private SerializedDataCntl(){
        getSerializedDataModel();
    }
    
    public static SerializedDataCntl getSerializedDataCntl(){
        if(serializedDataController == null)
            serializedDataController = new SerializedDataCntl();
        
        return serializedDataController;
    }
    
    public SerializedDataModel getSerializedDataModel(){
        if(sdModel == null)
            sdModel = new SerializedDataModel();
        
        return sdModel;
    }
    
    private void writeFile(String filePath){
        long curTime = System.currentTimeMillis();
        FileOutputStream fos;
        ObjectOutputStream out;
        
        try {
            fos = new FileOutputStream(filePath);
            out = new ObjectOutputStream(fos);
            out.writeObject(sdModel);
            out.close();
            
            System.out.println("Data write to " + filePath + " was successful.");
        } catch(IOException ex) {
            System.out.println("Data write to " + filePath + " failed.");
        }
        
        curTime = System.currentTimeMillis() - curTime;
        System.out.println("Saving took " + curTime + "ms");
    }
    
    private void readFile(String filePath){
        FileInputStream fis;
        ObjectInputStream in;
        
        try {
            fis = new FileInputStream(filePath);
            in = new ObjectInputStream(fis);
            sdModel = (SerializedDataModel)in.readObject();
            System.out.println(sdModel.getList());
        } catch(IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void setList(ArrayList listToSave, String filePath){
        sdModel.setList(listToSave);
        writeFile(filePath);
    }
    
    public ArrayList getList(String filePath){
        readFile(filePath);
        
        System.out.println("Getting data at " + filePath);
        if(sdModel.isEmpty())
            System.out.println("No data found at " + filePath);
        else
            System.out.println("Data found at " + filePath);
        
        return sdModel.getList();
    }
}
