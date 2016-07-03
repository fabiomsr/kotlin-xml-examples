package org.fabiomsr.kotlinxml._00_serialization

import org.fabiomsr.kotlinxml._00_serialization.model.Book
import org.junit.Test
import java.io.File
import org.junit.Assert.assertTrue

/**
 * Created by fabiomsr on 2/7/16.
 */
class SerializationTest {

    /**
     * Xml Expected
     *
     * <book pages="864">
     *   <tlile>A Song of Ice and Fire</tlile>
     * </book>
     *
     */
    @Test
    fun serializationTest() {
        val bookXml = File("results/serialization/kotlin_book.xml")

        if(bookXml.exists()){
            bookXml.delete()
        }

        val book = Book("A Song of Ice and Fire", 864)

        serializeBook(book, bookXml)

        assertTrue(bookXml.exists())
    }
}