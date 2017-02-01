package org.egc;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;

import org.jgrapht.*;
import org.jgrapht.graph.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public void app()
    {
		UndirectedGraph<String,DefaultEdge> g = new SimpleGraph<String,DefaultEdge>(DefaultEdge.class);
		assertNotNull(g);
        assertTrue( true );
    }
}
