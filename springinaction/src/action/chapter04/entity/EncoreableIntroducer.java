package action.chapter04.entity;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {

	@DeclareParents(value="action.chapter04.entity.Performance+", defaultImpl=DefaultEncoreable.class)
	
	public static Encoreable encoreable;
	
}
