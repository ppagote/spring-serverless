package com.pranav.springserverless;

import com.pranav.springserverless.functions.CustomFunction;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.function.context.FunctionRegistration;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.cloud.function.context.catalog.FunctionTypeUtils;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

import java.util.function.Function;

@SpringBootConfiguration
public class SpringServerlessFunctionalApplication implements ApplicationContextInitializer<GenericApplicationContext> {

    public static void main(String[] args) {
        FunctionalSpringApplication.run(SpringServerlessFunctionalApplication.class, args);
    }

    @Override
    public void initialize(GenericApplicationContext applicationContext) {
        applicationContext.registerBean("function", FunctionRegistration.class,
                () -> new FunctionRegistration<>(new CustomFunction()).type(CustomFunction.class));

        applicationContext.registerBean("uppercase", FunctionRegistration.class,
                () -> new FunctionRegistration<>(uppercase())
                        .type(FunctionTypeUtils.functionType(String.class, String.class)));
    }

    public Function<String, String> uppercase() {
        return String::toUpperCase;
    }

}
