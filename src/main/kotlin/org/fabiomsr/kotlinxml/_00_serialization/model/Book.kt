package org.fabiomsr.kotlinxml._00_serialization.model

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

/**
 * Created by fabiomsr on 2/7/16.
 */
@Root
data class Book( @field:Element var title: String,
                 @field:Attribute var pages: Int) {

    constructor( ) : this("", 0) {}
}