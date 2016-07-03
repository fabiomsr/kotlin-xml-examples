package org.fabiomsr.kotlinxml._02_nested_object

import org.fabiomsr.javaxml._02_nested_object.model.Contact
import org.fabiomsr.kotlinxml._00_serialization.model.Book
import org.simpleframework.xml.core.Persister
import java.io.File

/**
 * Created by fabiomsr on 2/7/16.
 */
fun serializeContact(contact: Contact, outputXml: File) {
    val serializer = Persister()
    serializer.write(contact, outputXml)
}