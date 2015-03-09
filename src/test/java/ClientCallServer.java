/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import net.al76.restlet.test.Main;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.restlet.resource.ClientResource;

/**
 *
 * @author alessio.finamore
 */
public class ClientCallServer {

    public ClientCallServer() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws Exception {
        String[] args = {};
        Main.main(args);
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() throws IOException {
        // Create the client resource  
        ClientResource resource = new ClientResource("http://localhost:8182/firstSteps/hello");

        // Customize the referrer property  
        //resource.setReferrerRef("http://localhost");

        // Write the response entity on the console
        assertEquals(resource.get().getText(), "hello, world");
    }
}
