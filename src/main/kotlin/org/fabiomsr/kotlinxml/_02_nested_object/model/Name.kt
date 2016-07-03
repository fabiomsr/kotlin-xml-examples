package org.fabiomsr.kotlinxml._02_nested_object.model

import org.simpleframework.xml.Element

/**
 * Created by fabiomsr on 3/7/16.
 */
data class Name(@field:Element var firstname: String,
                @field:Element var lastname: String) {

    constructor( ) : this("", "") {}
}