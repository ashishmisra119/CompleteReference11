package enumerationsAutoboxingAnnotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno2 {
	String str() default "Testing";
	int val() default 9000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
	MyAnno2[] value();
}

public class RepeatAnno {
	
	@MyAnno2(str = "First annotation", val= -1)
	@MyAnno2(str = "Second annotation", val = 100)
	public static void myMeth(String str, int i) {
		RepeatAnno ob = new RepeatAnno();
		
		try {
			Class<?> c = ob.getClass();
			Method m = c.getMethod("myMeth", String.class, int.class);
			
			Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
			System.out.println(anno);
		}catch(NoSuchMethodException e) {
			System.out.println("Method Not Found.");
		}
	}
public static void main(String[] args) {
	myMeth("test",10);
}
}
