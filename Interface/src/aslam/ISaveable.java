package aslam;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> list);
}
//whatever functions are in the interface all the fuctions should on the implementing class or error will appear
//List is a universal keyword for arraylist ,linkedlist etc
//using list makes the program updatedable we can convert it into arraylist or linkedlist in the future
//without importing list will not work