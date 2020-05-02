package com.oracletutorial.learningTheLanguage.annotations;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.lang.reflect.Method;
import java.util.Set;

import com.oracletutorial.learningTheLanguage.annotations.Print;

@SupportedAnnotationTypes("com.oracletutorial.learningTheLanguage.annotations.Print")
@SupportedSourceVersion(SourceVersion.RELEASE_11)
public class PrintProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        StringBuilder printMessage = new StringBuilder();

        for (Element el : roundEnv.getElementsAnnotatedWith(Print.class)) {
            Print impl = el.getAnnotation(Print.class);

            printMessage.append("Methods found in: ").append(el.getSimpleName().toString()).append(":\n");
            for (Method m : impl.getClass().getMethods()) {
                printMessage.append(m.getName()).append("\n");
            }
            processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, printMessage);
        }

        return false;
    }
}
