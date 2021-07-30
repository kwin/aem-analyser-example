package biz.netcentric.simple.impl;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "My Service Configuration", description = "Allows to configure stuff")
public @interface MyServiceImplConfiguration {
    @AttributeDefinition(name = "Boolean choice", description = "You can toggle between true and false")
    boolean booleanConfiguration() default true;

    @AttributeDefinition(name = "Integer value", description = "You can enter some integer values")
    int integerConfiguration() default -1;
}