/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfranc.com;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author sd987073
 */
public class Stephane_Ducher_Test {
    
        @Test
	public void stephane_test() {
		Markov m = new Markov();
		m.readFile("test.txt");
		Couple p = new Couple("hello", "world");// Markov.randomElement(m.couples.keySet());
                assertEquals(1, m.couples.size());
        }
        
        @Test
        public void testGeneration() {
                Markov m = new Markov();
                m.readFile ("test.txt");
                Couple p = new Couple ("il","était une");
                String res = m.generateText(p, 3);
                assertEquals("il était une " ,res);
        }
        
        @Test
        public void test(){
            Markov m = new Markov();
            m.readFile("test.txt");
            Couple p = new Couple ("il","était une");
            List<String> L = new ArrayList<String>();
            L.add("une");
            assertEquals(L, m.couples.get(p));
        }
        
        public void mêmephrase(){
            Markov m = new Markov();
            m.readFile("test.txt");
            Couple p = new Couple ("il","était une");
            assertEquals(3, m.couples.size());
        }   
	
}
