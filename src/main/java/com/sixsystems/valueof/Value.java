package com.sixsystems.valueof;

import com.sixsystems.valueof.validator.IntValidator;
import com.sixsystems.valueof.validator.StringValidator;

public class Value {

    public static StringValidator of(String value) {
        return new StringValidator(value);
    }

    public static IntValidator of(int value) {
        return new IntValidator(value);
    }
}
