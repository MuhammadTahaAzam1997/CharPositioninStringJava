/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positioncharacterinstring;
import java.util.*;
/**
 *
 * @author Muhammad Taha Azam
 */
public class PositionCharacterinString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner obj=new Scanner(System.in);
    

String abc[]=new String[1];
    for(String x: abc){
        System.out.println("Enter your word");
        x=obj.nextLine();
        int a=x.length();
        System.out.println("length of the string is: "+a);
        System.out.println("Which character are you finding from  the string?");
        char ch = obj.next().charAt(0);
        int position=x.indexOf(ch)+1;
        System.out.println("The character "+ch+" is found the word"+x+" at position: "+position);
    }

    }
    
}
