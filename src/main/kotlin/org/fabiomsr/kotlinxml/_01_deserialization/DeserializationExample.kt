package org.fabiomsr.kotlinxml._01_deserialization

import org.fabiomsr.kotlinxml._00_serialization.Book
import org.simpleframework.xml.core.Persister
import java.io.File

/**
 * Created by fabiomsr on 2/7/16.
 */
fun deserializeBook(inputXml: File) : Book {
    val serializer = Persister()
    return serializer.read(Book::class.java, inputXml) ?: Book()
}