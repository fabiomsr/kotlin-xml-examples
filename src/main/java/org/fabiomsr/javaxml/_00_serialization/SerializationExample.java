package org.fabiomsr.javaxml._00_serialization;

import org.fabiomsr.javaxml._00_serialization.model.Book;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;

/**
 * Created by fabiomsr on 2/7/16.
 */
public class SerializationExample {

    public void serializeBook(Book book, File outputXml) throws Exception {
        Serializer serializer = new Persister();
        serializer.write(book, outputXml);
    }

}
