/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

import java.util.ArrayList;

/**
 *
 * @author alonm
 */
public class Circuit {
    
    private static Circuit _instance = null;
    
    public static Circuit getInstance(){
        if(_instance == null)
            _instance = new Circuit();
        return _instance;
    }
    
    private ArrayList<Resistor> _resistors;
    
    private Circuit(){
        _resistors = new ArrayList<>();
    }
    
    public void add(Resistor r){
        if (r == null)
            throw new IllegalArgumentException("Resistor has null value");
        _resistors.add(r);
    }
    
    @Override
    public String toString(){
        String out = "";
        for (Resistor _resistor : _resistors) {
            out += _resistor+ System.lineSeparator();
        }
        return out;
    }
            
    public static void main(String[] args){
        Node a = new Node();
        System.out.println("a: " + a);
        Node b = new Node();
        System.out.println("b: " + b);
        Resistor r = new Resistor(40,a,b);
        System.out.println(r);
        
        Node c = new Node();
        System.out.println("c: " + c);
        Node d = new Node();
        System.out.println("d: "+ d);
        Resistor r2 = new Resistor(60, c, d);
        System.out.println(r2);
        
        System.out.println("\n"+Circuit.getInstance());
        
        Resistor r3 = new Resistor(-60, c, d);
        Resistor r4 = new Resistor(60, null, d);
        Resistor r5 = new Resistor(60, c, null);
      }
}
