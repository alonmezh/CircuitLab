/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author alonm
 */
public class Resistor {
    
    private static int _nextAvailableResistorId = 1;
    private double _resistance;
    private int _id;
    private Node [] _nodes = new Node[2];
    
 
    public Resistor(double resistance, Node node1, Node node2) throws IllegalArgumentException {
        if (resistance < 0)
            throw new IllegalArgumentException("Resistance can not be negative number: " + resistance);
        if (node1 == null)
            throw new IllegalArgumentException("Node1 has null value");
        if (node2 == null)
            throw new IllegalArgumentException("Node2 has null value");
        
        this._resistance = resistance;
        this._nodes[0] = node1;
        this._nodes[1] = node2;
        this._id = _nextAvailableResistorId++;
        Circuit.getInstance().add(this);
    }
    public Node [] getNodes(){
        return _nodes;
    }
    
    @Override
    public  String toString(){
        return "R" + _id + " " + _nodes[0] + " " + _nodes[1] + " " + _resistance; 
    }
    
}
