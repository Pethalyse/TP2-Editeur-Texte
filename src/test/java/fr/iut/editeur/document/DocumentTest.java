package fr.iut.editeur.document;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class DocumentTest extends TestCase {

    Document doc;

    @Before
    public void setUp(){
        doc = new Document();
    }
    @Test
    public void testAjouter(){
        String s = "test";
        doc.ajouter(s);

        assertEquals(doc.getTexte().substring(doc.getTexte().length() - s.length()), s);
    }
}
