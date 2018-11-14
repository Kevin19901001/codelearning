package action.chapter03.entity;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Configure bean's prototype scope when define
 * a class. Use '@Scope' annotation.
 * @author Kevin
 * @since 2017-08-03
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Notepad {

}
