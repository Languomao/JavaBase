/*
package lan.guomao.test;

*/
/**
 * Created by Languomao on 2018/2/6.
 *//*


import java.lang.reflect.Method;
import java.net.URL;
import java.util.Collection;
import java.util.Set;

import org.junit.Test;
import org.reflections.Configuration;
import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

public class GetPackTest {

    @Test
    public void test() throws Exception{
        String pack = GetPackTest.class.getPackage().getName(); //返回该类的上一级目录
        //String pack = "D:\\My Documents\\学习总结";
        Collection<URL> s = ClasspathHelper.forPackage(pack);
        URL url = s.iterator().next();
        //URL url = new URL("E:/Eclipse/workpace2/JavaBase/bin/");
        //Collection<URL> s = ClasspathHelper.forPackage("lan.guomao.Socket");
        URL newUrl = new URL(url.toString() + pack.replaceAll("\\.", "/"));
        //ArrayList list = com.google.common.collect.Lists.newArrayList(newUrl);
        Configuration config = new ConfigurationBuilder().setUrls(com.google.common.collect.Lists.newArrayList(newUrl)).setScanners(new MethodAnnotationsScanner());
        Reflections reflections = new Reflections(config);  //?
        System.out.println(reflections);
        //final Set<Method> methodSet = reflections.getMethodsAnnotatedWith(org.testng.annotations.Test.class);
        //Map<String, List<Method>> clazzMethodListMap = createClazzMethodListMap(methodSet);

        //List<XmlClass> xmlClassList = createXmlClassList(clazzMethodListMap.keySet());

        //XmlSuite suite = createXmlSuite(xmlClassList, parameter);
        System.out.println("END");
    }

    @Test
    public void test2() throws Exception{
        // 扫描测试类所在目录所有类
        String pack = GetPackTest.class.getPackage().getName(); //获得类所在的包的包名
        URL url = ClasspathHelper.forPackage(pack).iterator().next(); //forPackage返回Collection<URL>对象，遍历该对象取出元素
        URL newUrl = new URL(url.toString() + pack.replaceAll("\\.", "/")); //Java中.与|作为分割，转义字符必须加\\

        Reflections reflections = new Reflections(new ConfigurationBuilder().setUrls(com.google.common.collect.Lists.newArrayList(newUrl)).setScanners(new MethodAnnotationsScanner()));
        //final Set<Method> methodSet = reflections.getMethodsAnnotatedWith(org.testng.annotations.Test.class);

        //Map<String, List<Method>> clazzMethodListMap = createClazzMethodListMap(methodSet);

        //List<XmlClass> xmlClassList = createXmlClassList(clazzMethodListMap.keySet());

        //XmlSuite suite = createXmlSuite(xmlClassList, parameter);

        //runMethodParallelByTestNG(suite);
    }

    @Test
    public void test3() throws Exception{
        String pack = GetPackTest.class.getPackage().getName(); //获得类所在的包的包名
        Collection<URL> c = ClasspathHelper.forPackage(pack);
        URL url = c.iterator().next(); //forPackage返回Collection<URL>对象，元素为这个包的上一级目录，遍历该对象取出元素
        URL newUrl = new URL(url.toString() + pack.replaceAll("\\.", "/")); //Java中.与|作为分割，转义字符必须加\\
    }

}

*/
