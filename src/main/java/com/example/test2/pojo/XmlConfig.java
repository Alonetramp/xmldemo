package com.example.test2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class XmlConfig {

    @Element(name = "chartType")
    private String chartType;

    @Element(name = "dataExpress")
    private String dataExpress;

    @ElementList(entry = "title", type = DataTitle.class, inline = true, required = false)
    private List<DataTitle> titles;

}
