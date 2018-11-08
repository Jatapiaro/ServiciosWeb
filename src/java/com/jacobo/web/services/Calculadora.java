/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacobo.web.services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jacobotapia
 */
@WebService(serviceName = "Calculadora")
public class Calculadora {
    
    /**
     * This is a sample web service operation
     * @param double a
     * @param double b
     * @param char operation
     * @return double result
     */
    @WebMethod(operationName = "calculate")
    public double calculate(
            @WebParam(name = "a") double a,
            @WebParam(name = "operation") String operation,
            @WebParam(name = "b") double b) {
        
        switch(operation.charAt(0)) {
            case '+':
                return this.sum(a, b);
            case '-':
                return this.sub(a, b);
            case '*':
                return this.mul(a, b);
            case '/':
                return this.div(a, b);
        }
        return 0;
    }
    
    /*
     * Makes a sum
     * @param double a
     * @param double b
     * @return double result
    */
    private double sum(double a, double b) {
        return a + b;
    }
    
    /*
     * Makes a subtraction
     * @param double a
     * @param double b
     * @return double result
    */    
    private double sub(double a, double b) {
        return a - b;
    }
    
    /*
     * Makes a multiplication
     * @param double a
     * @param double b
     * @return double result
    */    
    private double mul(double a, double b) {
        return a * b;
    }    
 
    /*
     * Makes a division
     * @param double a
     * @param double b
     * @return double result
    */    
    private double div(double a, double b) {
        return a / b;
    } 
    
}
