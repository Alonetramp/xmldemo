package com.example.test;

import com.example.test.pojo.City;
import com.example.test.pojo.CityList;
import com.example.test.pojo.XmlConfig;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class test {

   /*
   *    spring + javax注解实现读取XML配置文件
   *    注意：据说JDK11后没有javax。xml了！！！！
   *
   * */
    public static void main(String[] agrs) throws Exception {
        //读取Resource目录下的XML文件
        Resource resource = new ClassPathResource("test.xml");
        //利用输入流获取XML文件内容
        BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream(), "UTF-8"));
        StringBuffer buffer = new StringBuffer();
        String line = "";
        while ((line = br.readLine()) != null) {
            buffer.append(line);
        }
        br.close();
        //XML转为JAVA对象
        XmlConfig xmlConfig = (XmlConfig) XmlBuilder.xmlStrToObject(XmlConfig.class, buffer.toString());
        CityList cityList = xmlConfig.getCityList();
        System.out.println(cityList);
        List<City> cities = cityList.getCityLst();
        for (City c:cities) {
            System.out.println(c);
        }
    }


}
