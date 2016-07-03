package org.fabiomsr.javaxml._01_deserialization;

import org.fabiomsr.javaxml._00_serialization.model.Book;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;

/**
 * Created by fabiomsr on 2/7/16.
 */
public class DeserializationExample {

    public Book deserializeBook(File inputXml) throws Exception {
        Serializer serializer = new Persister();
        return serializer.read(Book.class, inputXml);
    }
}
