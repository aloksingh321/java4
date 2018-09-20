import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class 2ndfile {

    public static void main(String[] args)throws Exception{
        File f1=new File("E:\\Users\\alok\\Desktop\\qwe.txt");
        File f2=new File("E:\\Users\\alok\\documents\\asd.txt");
        if(!f1.exists())
        {
        	f1.createNewFile();
        }
        if(!f2.exists())
        {
        	f2.createNewFile();
        }
    }
}