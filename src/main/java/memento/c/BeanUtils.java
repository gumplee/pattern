package memento.c;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

public class BeanUtils {
	public static HashMap<String,Object> backupProp(Object bean)
	{
		HashMap<String,Object> result = new HashMap<String, Object>();
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
			for(PropertyDescriptor p : pds)
			{
				String name = p.getName();
				Method getter = p.getReadMethod();
				Object value = getter.invoke(bean, new Object[]{});
				if (!name.equalsIgnoreCase("class")) {
					result.put(name, value);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static void restoreProp(Object bean,HashMap<String, Object> proHashMap)
	{
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
			for(PropertyDescriptor p : pds)
			{
				String name = p.getName();
				if (proHashMap.containsKey(name)) {
					Method setter = p.getWriteMethod();
					setter.invoke(bean, new Object[]{proHashMap.get(name)});
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
