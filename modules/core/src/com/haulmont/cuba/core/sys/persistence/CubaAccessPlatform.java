package com.haulmont.cuba.core.sys.persistence;

import org.eclipse.persistence.exceptions.ConversionException;
import org.eclipse.persistence.platform.database.AccessPlatform;

import java.util.UUID;

// TODO: check if it works
public class CubaAccessPlatform extends AccessPlatform {
    @Override
    public Object convertObject(Object sourceObject, Class javaClass) throws ConversionException {
        if (sourceObject instanceof UUID && javaClass == String.class) {
            return sourceObject.toString().replace("-", "");
        }
        return super.convertObject(sourceObject, javaClass);
    }
}
