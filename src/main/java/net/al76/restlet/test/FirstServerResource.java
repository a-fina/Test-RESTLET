/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.al76.restlet.test;

import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 *
 * @author alessio.finamore
 */
public class FirstServerResource  extends ServerResource {  

    
   @Get  
   public String toString() {  
      return "hello, world";  
   }

    
}
