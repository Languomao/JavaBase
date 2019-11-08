package lan.guomao.test;

/**
 * Created by Languomao on 2018/2/6.
 */
import java.lang.reflect.Method;

public class MethodDemo {

    public void test(){
        System.out.println("Test");
    }

    public static void main(String[] args) {
        //Method[] methods = SampleClass.class.getMethods();
        Method[] methods = MethodDemo.class.getMethods();
        Class declaringClass = methods[0].getDeclaringClass(); //获得该方法所在的类的Class对象
        Package aPackage = declaringClass.getPackage();
        String className = declaringClass.getSimpleName();
        String classKey = aPackage == null ? className : aPackage.getName() + "." + className;
        System.out.println(declaringClass.getName());
    }
}

class SampleClass {
    private String sampleField;

    public String getSampleField() {
        return sampleField;
    }

    public void setSampleField(String sampleField) {
        this.sampleField = sampleField;
    }
}
