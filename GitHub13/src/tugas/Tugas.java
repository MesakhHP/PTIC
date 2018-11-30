/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author Mesakh
 */
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a , b , c , d;
        System.out.println("please input your first number:");
        Scanner e = new Scanner(System.in);
        a = e.nextInt();
        System.out.println("then, input your second number: ");
        Scanner titit = new Scanner(System.in);
        b = titit.nextInt();
        c = a + b;
        d = a - b;
        int f = a*b;
        float g = a/b;
        System.out.println("Choose your option :");
        System.out.println("1. plus");
        System.out.println("2. minus");
        System.out.println("3. multiple");
        System.out.println("4. devide");
        Scanner bukannya_pakai_nextline = new Scanner(System.in);
        int z = bukannya_pakai_nextline.nextInt();
        if(z == 1){
        System.out.println("This is the result : "+c);}
        else if(z == 2){
        System.out.println("This is the result : "+d);}
        else if(z == 3){
        System.out.println("This is the result : "+f);}
        else{
        System.out.println("This is the result : "+g);}
    }
    
}
