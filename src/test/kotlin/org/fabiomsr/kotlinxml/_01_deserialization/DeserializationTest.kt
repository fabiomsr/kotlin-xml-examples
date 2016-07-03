package org.fabiomsr.kotlinxml._00_serialization

import org.fabiomsr.kotlinxml._00_serialization.model.Book
import org.fabiomsr.kotlinxml._01_deserialization.deserializeBook
import org.junit.Test
import java.io.File
import org.junit.Assert.assertTrue

/**
 * Created by fabiomsr on 2/7/16.
 */
class DeserializationTest {

    @Test
    fun deserializationTest() {
        val bookXmlUrl = javaClass.getResource("/book1.xml")
        val bookXml = File(bookXmlUrl.toURI())

        val resultBook = deserializeBook(bookXml)
        val book = Book("A Song of Ice and Fire", 864)

        assertTrue(book.equals(resultBook))
    }
}
