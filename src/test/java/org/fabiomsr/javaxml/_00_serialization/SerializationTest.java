package org.fabiomsr.javaxml._00_serialization;


import org.fabiomsr.javaxml._00_serialization.model.Book;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertTrue;

/**
 * Created by fabiomsr on 2/7/16.
 */
public class SerializationTest {

    /**
     * Xml Expected
     *
     * <book pages="864">
     *   <tlile>A Song of Ice and Fire</tlile>
     * </book>
     *
     */
    @Test
    public void serializationTest() throws Exception {
        File bookXml = new File("results/serialization/java_book.xml");

        if(bookXml.exists()){
            bookXml.delete();
        }

        Book book = new Book("A Song of Ice and Fire", 864);

        SerializationExample serializationExample = new SerializationExample();
        serializationExample.serializeBook(book, bookXml);

        assertTrue(bookXml.exists());
    }
}
