import java.util.*;
import java.io.*;
import java.lang.*;

public class Tree
{
    public static void main()
    {
        Array_imp obj=new Array_imp();
        obj.Root("A");
        obj.left("B",0);
        obj.right("C",0);
        obj.left("D",1);
        obj.right("E",1);
        obj.right("F",1);
        obj.print_Tree();
    }
}

class Array_imp
{
    
    static int root=0;
    static String[] str=new String[10];
    
    public void Root(String key)
    {
        str[0]=key;
    }
    
    public void left(String key,int root)
    {
        int t=(root*2)+1;
        if(str[root]==null)
        {
            System.out.println("Cannot set child no parent found");
            
        }
        else
         str[t]=key;
    }
    
     public void right(String key,int root)
    {
        int t=(root*2)+2;
        if(str[root]==null)
        {
            System.out.println("Cannot set child no parent found");
            
        }
        else
         str[t]=key;
    }
    
    public void print_Tree()
    {
        for(int i=0;i<10;i++)
        {
            if(str[i]!=null)
            {
                System.out.println(str[i]  + " ");
            }
            else
            System.out.println("--");
        }
        
    }
}
