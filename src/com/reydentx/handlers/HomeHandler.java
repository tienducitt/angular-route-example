/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reydentx.handlers;

import hapax.TemplateDataDictionary;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

/**
 *
 * @author ducnt3
 */
public class HomeHandler extends BaseHandler {

        private static final Logger _LOGGER = Logger.getLogger(HomeHandler.class);

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                try {
                        TemplateDataDictionary dic = getBaseDictionary();
                        String html = applyTemplate(dic, "layout");
                        System.out.println("Hello");
                        print(html, resp);
                } catch (Exception ex) {
                        _LOGGER.error(ex.getMessage(), ex);
                }
        }
}
