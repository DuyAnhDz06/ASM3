/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assm.Objects;

import java.io.File;

/**
 *
 * @author balis
 */
public class FileCreator {

    String filename;
    String desktopPath = System.getProperty("user.home") + "\\" + "Desktop";
    File desktop = new File(desktopPath);
    File filePath;

    //Constructors
    public FileCreator(String filename) {
        this.filename = filename;
        try {
            filePath = new File(desktopPath + "\\" + filename);
            filePath.createNewFile();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    //Get the file path & file name
    public String getPath() {
        return String.valueOf(filePath);
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public File getDesktop() {
        return desktop;
    }

}
