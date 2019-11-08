package lan.guomao.coreJava;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 * Created by Languomao on 2018/4/18.
 *
 *分析数组类型(数值类型的数组)以及数组中元素的类型和值
 */
public class ObjectAnalizer {
    private ArrayList<Object> visited= new ArrayList<>();

    public String toString(Object obj){
        if(obj==null) return "null";
        if(visited.contains(obj)) return "...";
        visited.add(obj);
        Class c1 = obj.getClass();
        if(c1==String.class) return (String)obj;
        if(c1.isArray()){
            String r = c1.getComponentType()+"[]{"; //返回数组的组件类型
            for(int i = 0;i< Array.getLength(obj);i++){
                if(i>0) r +="";
                Object val = Array.get(obj,i);  //数组obj的第i个值
                if(c1.getComponentType().isPrimitive()) r +=val;
                else r += toString(val);
            }
            return r+"}";
        }

        String r = c1.getName();
        do{
            r += "[";
            Field[] fields = c1.getDeclaredFields();
            AccessibleObject.setAccessible(fields,true);
            for(Field f :fields){
                if(!Modifier.isStatic(f.getModifiers())){
                    if(!r.endsWith("[")) r +=",";
                    r += f.getName() + "=";
                    try{
                        Class t = f.getType();
                        Object val = f.get(obj);
                        if(t.isPrimitive()) r += val;
                        else r += toString(val);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
            r += "]";
            c1 = c1.getSuperclass();
        }
        while(c1!=null);
        return r;
    }
}

