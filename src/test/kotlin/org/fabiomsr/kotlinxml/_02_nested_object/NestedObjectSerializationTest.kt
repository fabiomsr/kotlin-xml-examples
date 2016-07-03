package org.fabiomsr.kotlinxml._00_serialization

import org.fabiomsr.javaxml._02_nested_object.model.Contact
import org.fabiomsr.javaxml._02_nested_object.model.Name
import org.fabiomsr.kotlinxml._00_serialization.model.Book
import org.fabiomsr.kotlinxml._02_nested_object.serializeContact
import org.junit.Test
import java.io.File
import org.junit.Assert.assertTrue

/**
 * Created by fabiomsr on 2/7/16.
 */
class NestedObjectSerializationTest {

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
    fun serializationTest() {
        val contactXml = File("results/nested_object/kotlin_contact.xml")

        if(contactXml.exists()){
            contactXml.delete()
        }

        val name = Name("Fabio", "Santana")
        val contact = Contact(name, "mail@example.com")

        serializeContact(contact, contactXml)

        assertTrue(contactXml.exists())
    }
}