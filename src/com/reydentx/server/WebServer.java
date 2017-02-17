/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reydentx.server;

import com.reydentx.app.MainApp;
import com.reydentx.handlers.HomeHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;

/**
 *
 * @author ducnt3
 */
public class WebServer {
    public static void SetupAndStart() {
        try {
            Server server = new Server(8081);
            
            // servlet handlers
            ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);
            handler.addServlet(HomeHandler.class, "/*");
            
            // static resource handler
            ContextHandler resource_handler = new ContextHandler("/public");
            resource_handler.setResourceBase("./public/");
            resource_handler.setHandler(new ResourceHandler());

            // use a handler to handle all requests
            HandlerList handlers = new HandlerList();
            handlers.setHandlers(new Handler[]{resource_handler, handler});
            server.setHandler(handlers);
            server.start();
        } catch (Exception ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
