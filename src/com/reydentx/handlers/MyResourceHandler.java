/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reydentx.handlers;

import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.server.handler.ResourceHandler;

/**
 *
 * @author ducnt3
 */
public class MyResourceHandler extends ResourceHandler{

    @Override
    protected void doResponseHeaders(HttpServletResponse response, org.eclipse.jetty.util.resource.Resource resource, String mimeType) {
        super.doResponseHeaders(response, resource, mimeType);
        response.setHeader(HttpHeaders.EXPIRES, "658400");
    }
    
}
