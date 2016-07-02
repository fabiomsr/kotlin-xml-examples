package org.fabiomsr.kotlinxml._00_serialization

import org.simpleframework.xml.core.Persister
import java.io.File

/**
 * Created by fabiomsr on 2/7/16.
 */
fun serializeBook(book: Book, outputXml: File) {
    val serializer = Persister()
    serializer.write(book, outputXml)
}