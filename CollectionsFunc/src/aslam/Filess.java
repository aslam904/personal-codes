package aslam;

import java.util.ArrayList;
import java.util.Collections;
public class Filess {
    //public static final String name = "src/aslam/directory/";
    private String name;
    private String extension;
    public Filess(String name,String ext) {
        this.name=name;
        this.extension=ext;
    }
    public String getName() {
        return this.name;
    }
    public String getExt() {
        return this.extension;
    }

}