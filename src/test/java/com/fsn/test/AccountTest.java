package com.fsn.test;

import com.fsn.dao.AccountDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountTest {

    @Test
    public void accountTest(){
        //得到Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //从容器中得到AccountDao对象
        AccountDao accountDao = applicationContext.getBean(AccountDao.class);
        //调用findAll()方法
        accountDao.findAll();
    /*
        F:\jdk\jdk1.8202\jdk\bin\java.exe -ea -Didea.test.cyclic.buffer.size=1048576 "-javaagent:F:\ideaUI\IntelliJ IDEA 2018.3.1\lib\idea_rt.jar=58630:F:\ideaUI\IntelliJ IDEA 2018.3.1\bin" -Dfile.encoding=UTF-8 -classpath "F:\ideaUI\IntelliJ IDEA 2018.3.1\lib\idea_rt.jar;F:\ideaUI\IntelliJ IDEA 2018.3.1\plugins\junit\lib\junit-rt.jar;F:\ideaUI\IntelliJ IDEA 2018.3.1\plugins\junit\lib\junit5-rt.jar;F:\jdk\jdk1.8202\jdk\jre\lib\charsets.jar;F:\jdk\jdk1.8202\jdk\jre\lib\deploy.jar;F:\jdk\jdk1.8202\jdk\jre\lib\ext\access-bridge-64.jar;F:\jdk\jdk1.8202\jdk\jre\lib\ext\cldrdata.jar;F:\jdk\jdk1.8202\jdk\jre\lib\ext\dnsns.jar;F:\jdk\jdk1.8202\jdk\jre\lib\ext\jaccess.jar;F:\jdk\jdk1.8202\jdk\jre\lib\ext\jfxrt.jar;F:\jdk\jdk1.8202\jdk\jre\lib\ext\localedata.jar;F:\jdk\jdk1.8202\jdk\jre\lib\ext\nashorn.jar;F:\jdk\jdk1.8202\jdk\jre\lib\ext\sunec.jar;F:\jdk\jdk1.8202\jdk\jre\lib\ext\sunjce_provider.jar;F:\jdk\jdk1.8202\jdk\jre\lib\ext\sunmscapi.jar;F:\jdk\jdk1.8202\jdk\jre\lib\ext\sunpkcs11.jar;F:\jdk\jdk1.8202\jdk\jre\lib\ext\zipfs.jar;F:\jdk\jdk1.8202\jdk\jre\lib\javaws.jar;F:\jdk\jdk1.8202\jdk\jre\lib\jce.jar;F:\jdk\jdk1.8202\jdk\jre\lib\jfr.jar;F:\jdk\jdk1.8202\jdk\jre\lib\jfxswt.jar;F:\jdk\jdk1.8202\jdk\jre\lib\jsse.jar;F:\jdk\jdk1.8202\jdk\jre\lib\management-agent.jar;F:\jdk\jdk1.8202\jdk\jre\lib\plugin.jar;F:\jdk\jdk1.8202\jdk\jre\lib\resources.jar;F:\jdk\jdk1.8202\jdk\jre\lib\rt.jar;F:\Project\gradleDemo\out\test\classes;F:\Project\gradleDemo\out\production\classes;F:\Project\gradleDemo\out\production\resources;F:\Gradle\gradle-4.4-all\gradle-4.4\.gradle\caches\modules-2\files-2.1\org.springframework\spring-context\5.0.2.RELEASE\743a5f6d94a8af5759e6e70c360a7b4a47a704c\spring-context-5.0.2.RELEASE.jar;C:\Users\ASUS\.m2\repository\junit\junit\4.12\junit-4.12.jar;F:\Gradle\gradle-4.4-all\gradle-4.4\.gradle\caches\modules-2\files-2.1\org.springframework\spring-aop\5.0.2.RELEASE\4d49aa2cff33be79da99413e28a905898600ccaa\spring-aop-5.0.2.RELEASE.jar;F:\Gradle\gradle-4.4-all\gradle-4.4\.gradle\caches\modules-2\files-2.1\org.springframework\spring-beans\5.0.2.RELEASE\301ee07b390bc8b5691f4206411b49beb06f7ff2\spring-beans-5.0.2.RELEASE.jar;F:\Gradle\gradle-4.4-all\gradle-4.4\.gradle\caches\modules-2\files-2.1\org.springframework\spring-expression\5.0.2.RELEASE\246bf50b5b46379041d333b4a46a01a7aea0b788\spring-expression-5.0.2.RELEASE.jar;F:\Gradle\gradle-4.4-all\gradle-4.4\.gradle\caches\modules-2\files-2.1\org.springframework\spring-core\5.0.2.RELEASE\45b2958ab3fb022dd29f8b1c553ebf1c75a144aa\spring-core-5.0.2.RELEASE.jar;C:\Users\ASUS\.m2\repository\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar;F:\Gradle\gradle-4.4-all\gradle-4.4\.gradle\caches\modules-2\files-2.1\org.springframework\spring-jcl\5.0.2.RELEASE\212a0bdd54e026641cf527aeb8e578f86e402bf1\spring-jcl-5.0.2.RELEASE.jar" com.intellij.rt.execution.junit.JUnitStarter -ideVersion5 -junit4 com.fsn.test.AccountTest,accountTest
        六月 16, 2020 2:33:04 下午 org.springframework.context.support.AbstractApplicationContext prepareRefresh
        信息: Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@6956de9: startup date [Tue Jun 16 14:33:04 CST 2020]; root of context hierarchy
        AccountDao - [findAll]: 列表查询成功！
        六月 16, 2020 2:33:04 下午 org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions

        信息: Loading XML bean definitions from class path resource [bean.xml]
        Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding=UTF-8

        Process finished with exit code 0

     */
    }






}
