package com.springFramework.spel;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.expression.Expression;
//import org.springframework.expression.spel.standard.SpelExpressionParser;

public class test {

    public static void main(String[] args) throws Exception {
        // Load Spring context
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springFramework/spel/sterotypeAnnotations.xml");
        Demo d = context.getBean("demo", Demo.class);
        System.out.println(d);

        // Use SpEL parser
//        SpelExpressionParser tmp = new SpelExpressionParser();
//        Expression expression = tmp.parseExpression("22 + 44"); // Use Spring's Expression interface
//        Integer result = expression.getValue(Integer.class); // Evaluate the expression as Integer
//        System.out.println("Result of SpEL: " + result);

        context.registerShutdownHook();
    }
}
