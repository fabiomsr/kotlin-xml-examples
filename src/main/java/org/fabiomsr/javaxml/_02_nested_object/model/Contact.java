package org.fabiomsr.javaxml._02_nested_object.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by fabiomsr on 3/7/16.
 */
@Root
public class Contact {

    @Element
    private Name name;

    @Element
    private String email;

    public Contact(Name name, String email) {
        this.name = name;
        this.email = email;
    }

}
