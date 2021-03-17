package com.company;

import java.util.Iterator;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	    //Definirea instantei unei stive
        Stack<Integer> stackJava=new Stack<Integer>();
        int stackSize=10;

        //Adaugarea elementelor in stiva
        for(int i=0; i<stackSize;i++){
            stackJava.push(i);}
        stackJava.push(40);

        //Afisarea elementelor din stiva
        System.out.println("Elementele stivei sunt: "+stackJava );

        //Eliminarea ultimului element adaugat in stiva
        int elementSters= stackJava.pop();
        System.out.println("Elementul eliminat: "+ elementSters);
        System.out.println("Elementele stivei sunt: "+stackJava );

        //Afisarea ultimului element adaugat in stiva
        int head=stackJava.peek();
        System.out.println("Elementul care urmeaza sa fie procesat este "+head);

        //Afiseaza dimensiunea stivei
        int size=stackJava.size();
        System.out.println("Dimensiunea stivei este "+size);

        //Itereaza prin elementele stivei
        Iterator it=stackJava.iterator();
        while(it.hasNext()){
            stackJava.pop();
        }
        System.out.println("Elementele stivei sunt: "+stackJava );

        //Verifica daca stiva este goala
        if(stackJava.empty()){
            System.out.println("Stiva este goala.");
        }
    }
}
