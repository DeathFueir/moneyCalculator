/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneycalculator.control;

/**
 *
 * @author Sergio
 */
public interface Command {
    String name();
    void execute();
}
