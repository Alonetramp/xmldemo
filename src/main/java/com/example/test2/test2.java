package com.example.test2;


import com.example.test2.pojo.DataTitle;
import com.example.test2.pojo.XmlConfig;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class test2 {

   /*
   *    spring + Simple注解实现读取XML配置文件
   *    参考:https://www.jianshu.com/p/b5283224d0f1
   *
   * */
    public static void main(String[] agrs) throws Exception {
        Resource resource = new ClassPathResource("test2.xml");
        //利用输入流获取XML文件内容
        BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream(), "UTF-8"));
        Serializer serializer = new Persister();
        XmlConfig config = serializer.read(XmlConfig.class,br);

        System.out.println(config.getChartType());

        System.out.println(config.getDataExpress());


        List<DataTitle> dataTitles = config.getTitles();

        for (DataTitle dataTitle:dataTitles){
            System.out.println(dataTitle);
        }
    }


}
