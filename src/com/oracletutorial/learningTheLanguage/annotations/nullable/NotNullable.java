package com.oracletutorial.learningTheLanguage.annotations.nullable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface NotNullable {

}
