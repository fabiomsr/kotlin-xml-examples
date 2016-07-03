package org.fabiomsr.javaxml._02_nested_object;

import org.fabiomsr.javaxml._02_nested_object.model.Contact;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;

/**
 * Created by fabiomsr on 3/7/16.
 */
public class NestedObjectSerializationExample {

    public void serializeContact(Contact contact, File outputXml) throws Exception {
        Serializer serializer = new Persister();
        serializer.write(contact, outputXml);
    }

}
