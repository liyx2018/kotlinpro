package reflectforjava;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo {


    public static void main(String[] args) {

        //获取Class对象
        System.out.println("------------------------获取Class对象------------------------");
        //第一种方式获取Class对象
        Student stu1 = new Student();//这一new 产生一个Student对象，一个Class对象。
        Class stuClass = stu1.getClass();//获取Class对象
        System.out.println(stuClass.getName());

        //第二种方式获取Class对象
        Class stuClass2 = Student.class;
        System.out.println(stuClass == stuClass2);//判断第一种方式获取的Class对象和第二种方式获取的是否是同一个

        //第三种方式获取Class对象
        try {
            Class stuClass3 = Class.forName("reflectforjava.Student");//注意此字符串必须是真实路径，就是带包名的类路径，包名.类名
            System.out.println(stuClass3 == stuClass2);//判断三种方式是否获取的是同一个Class对象
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("------------------------通过反射获取构造方法并使用------------------------");

        //1.加载Class对象
        Class clazz = null;
        try {
            clazz = Class.forName("reflectforjava.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        //2.获取所有公有构造方法
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>所有公有构造方法");
        Constructor[] conArray = clazz.getConstructors();
        for (Constructor c : conArray) {
            System.out.println(c);
        }


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>所有的构造方法(包括：私有、受保护、默认、公有)");
        conArray = clazz.getDeclaredConstructors();
        for (Constructor c : conArray) {
            System.out.println(c);
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>获取公有、无参的构造方法");
        Constructor con = null;
        try {
            con = clazz.getConstructor(null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        //1>、因为是无参的构造方法所以类型是一个null,不写也可以：这里需要的是一个参数的类型，切记是类型
        //2>、返回的是描述这个无参构造函数的类对象。

        System.out.println("con = " + con);
        //调用构造方法
        Object obj = null;
        try {
            obj = con.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("obj = " + obj);
        //	Student stu = (Student)obj;

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>获取私有构造方法，并调用");
        try {
            con = clazz.getDeclaredConstructor(char.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println(con);
        //调用构造方法
        con.setAccessible(true);//暴力访问(忽略掉访问修饰符)
        try {
            obj = con.newInstance('男');
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------通过反射获取私有字段并使用------------------------");
        Class studentClass = Student.class;
        Field field = null;
        Object object = null;
        try {
            object =   studentClass.getConstructor().newInstance();
            field = studentClass.getDeclaredField("phoneNum");
            field.setAccessible(true);
            field.set(object,"李亚西");
            System.out.println("验证姓名:"+(Student)object);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("------------------------通过反射获取私有方法并使用------------------------");
        Class clazz0 = Student.class;
        Method method = null;
        Object object0 = null;
        try {
            object0 =   studentClass.getConstructor().newInstance();
            method = studentClass.getDeclaredMethod("show4",int.class);
            method.setAccessible(true);
            Object oobj= method.invoke(object0,999);
            System.out.println("验证:"+oobj);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("------------------------通过反射获取main方法------------------------");

        try {
            Method method2= Student.class.getMethod("main", String[].class);
            Object objj=  method2.invoke(null,(Object)new String[]{"a","b","c"});
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("------------------------通过反射越过泛型检查------------------------");

        ArrayList<String> strList = new ArrayList<>();
        strList.add("aaa");
        strList.add("bbb");


        try {
            Class strclass = strList.getClass();
            Method method5= strclass.getMethod("add", Object.class);
            method5.invoke(strList,777);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Object oo : strList) {
            System.out.println("--遍历---"+oo);
        }

    }

}
