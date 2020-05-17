package com.example.test2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataTitle {

    @Attribute
    private String isShow;

    @Attribute
    private String dataFormat;

    @Attribute(required = false)
    private String yAxis;

    @Text
    private String title;

}
