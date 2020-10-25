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
public class Node {
    
    private static int _nextAvailableNodeId = 0;
    
    private int _id = 0;
    
      public Node(){
        _id = _nextAvailableNodeId++;
    }
    
    /**To string
     *
     * @return
     */
    @Override
    public String toString(){
        return "" + _id;
    }
    
}