package com.tss.tasks;

import java.util.*;

public class indexing {
    
    static void removeDuplicate(char str[], int length)  {
        int index = 0;   
        for (int i = 0; i < length; i++)   {
            int j;   
            for (j = 0; j < i; j++) {    
                if (str[i] == str[j])   {   
                	System.out.print(str[i]);
                    break;   
                }  
            }   
            if (j == i) {    
                str[index++] = str[i];   
            }   
        }   
        //System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
    }   
    
    public static void main(String[] args) {   
        String info = "javaaa is the best learning website";  
        char str[] = info.toCharArray();  
        int len = str.length;   
        removeDuplicate(str, len);   
    }   
}
