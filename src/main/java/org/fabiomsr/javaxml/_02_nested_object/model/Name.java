package org.fabiomsr.javaxml._02_nested_object.model;

import org.simpleframework.xml.Element;

/**
 * Created by fabiomsr on 3/7/16.
 */
public class Name {
    @Element
    private String firstname;

    @Element
    private String lastname;

    public Name(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
