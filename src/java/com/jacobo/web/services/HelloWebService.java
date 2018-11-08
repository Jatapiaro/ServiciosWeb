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
@WebService(serviceName = "HelloWebService")
public class HelloWebService {

    /**
     * This is a sample web service operation
     * @param String name to say hello
     * @return String a custom hello message for a given name
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String name) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hola, !");
        sb.append(name);
        sb.append(", bienvenido al servicio web!");
        return sb.toString();
    }
}
