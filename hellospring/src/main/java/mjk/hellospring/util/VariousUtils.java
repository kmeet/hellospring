package mjk.hellospring.util;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class VariousUtils {

	public static <T> List<T> castList(Class<? extends T> toClass, Collection<?> c) {

		try
		{
			List<T> list = new ArrayList<T>(c.size());
			
			for (Object o : c) {
				list.add(toClass.cast(o));
			}
			
			return list;
		} 
		//TODO Try & convert try-catch to throws. Identify correct exception to throw when class types do not match. 
		catch (Exception exc) {
			exc.printStackTrace();
			return null;
		}
	}
	
	public static <T> T castObject(Class<T> toClass, Object o) {

		try
		{
			return toClass.cast(o);
		} 
		//TODO Try & convert try-catch to throws. Identify correct exception to throw when class types do not match. 
		catch (Exception exc) {
			
			exc.printStackTrace();
			return null;
		}
	}
}