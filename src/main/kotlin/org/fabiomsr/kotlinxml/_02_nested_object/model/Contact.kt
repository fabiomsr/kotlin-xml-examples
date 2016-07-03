package org.fabiomsr.kotlinxml._02_nested_object.model

import org.simpleframework.xml.Element

/**
 * Created by fabiomsr on 3/7/16.
 */
data class Contact( @field:Element var name: Name,
                    @field:Element var email: String) {

    constructor( ) : this(Name("", ""), "") {}
}
