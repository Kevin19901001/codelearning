package action.chapter03.annotation;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * When only one customer annotation is not enough,
 * we can define other annotations.
 * @author Kevin
 * @since 2017-08-03
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ TYPE, FIELD, METHOD, CONSTRUCTOR })
@Qualifier
public @interface Creamy {

}
