package jsr303;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = ArrayItemLenValidator.class)
@Documented
public @interface ArrayItemLen {

	String message() default "数组元素长度必须在{min}到{max}之间!";

	int max() default Integer.MAX_VALUE;

	int min() default 0;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
