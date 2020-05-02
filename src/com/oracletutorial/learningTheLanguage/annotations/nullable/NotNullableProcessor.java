package com.oracletutorial.learningTheLanguage.annotations.nullable;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.ElementFilter;
import javax.tools.Diagnostic;
import java.util.Set;

@SupportedAnnotationTypes("com.oracletutorial.learningTheLanguage.annotations.nullable.NotNullable")
public class NotNullableProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (VariableElement el : ElementFilter.fieldsIn(roundEnv.getElementsAnnotatedWith(NotNullable.class))) {
            if(el.getConstantValue() == null)
                processingEnv.getMessager().printMessage(Diagnostic.Kind.WARNING, el.getSimpleName() + " is null");
        }
        return false;
    }
}
