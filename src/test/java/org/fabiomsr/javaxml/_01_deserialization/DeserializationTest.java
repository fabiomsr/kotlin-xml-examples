package org.fabiomsr.javaxml._01_deserialization;


import org.fabiomsr.javaxml._00_serialization.Book;
import org.fabiomsr.javaxml._00_serialization.SerializationExample;
import org.junit.Test;

import java.io.File;
import java.net.URL;

import static org.junit.Assert.assertTrue;

/**
 * Created by fabiomsr on 2/7/16.
 */
public class DeserializationTest {

    @Test
    public void deserializationTest() throws Exception {
        URL bookXmlUrl = DeserializationTest.class.getResource("/book1.xml");
        File bookXml = new File(bookXmlUrl.toURI());
        Book book = new Book("A Song of Ice and Fire", 864);

        DeserializationExample serializationExample = new DeserializationExample();
        Book resultBook = serializationExample.deserializeBook(bookXml);

        assertTrue(book.equals(resultBook));
    }
}
