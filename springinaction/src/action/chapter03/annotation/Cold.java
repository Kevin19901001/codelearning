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
 * By creating customer annotation, we can use
 * these annotations on entity classes to define
 * unique bean.
 * @since 2017-08-03
 * @author Kevin
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ TYPE, FIELD, METHOD, CONSTRUCTOR })
@Qualifier
public @interface Cold {

}
