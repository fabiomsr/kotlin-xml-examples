package org.fabiomsr.javaxml._02_nested_object;


import org.fabiomsr.javaxml._00_serialization.SerializationExample;
import org.fabiomsr.javaxml._00_serialization.model.Book;
import org.fabiomsr.javaxml._02_nested_object.model.Contact;
import org.fabiomsr.javaxml._02_nested_object.model.Name;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertTrue;

/**
 * Created by fabiomsr on 2/7/16.
 */
public class NestedObjectSerializationTest {

    /**
     * Xml Expected
     *
     * <contact>
     *   <name>
     *       <firstname>Fabio</firstname>
     *       <lastname>Santana</lastname>
     *   </name>
     *   <email>mail@example.com</email>
     * </contact>
     *
     */
    @Test
    public void serializationTest() throws Exception {
        File contactXml = new File("results/nested_object/java_contact.xml");

        if(contactXml.exists()){
            contactXml.delete();
        }

        Name name = new Name("Fabio", "Santana");
        Contact contact = new Contact(name, "mail@example.com");

        NestedObjectSerializationExample serializationExample = new NestedObjectSerializationExample();
        serializationExample.serializeContact(contact, contactXml);

        assertTrue(contactXml.exists());
    }
}
