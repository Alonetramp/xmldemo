package com.example.test.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "configuration")   //根标签，此类对应configuration
@XmlAccessorType(XmlAccessType.FIELD)
public class XmlConfig {
    @XmlElement(name = "city")   //子节点
    private CityList cityList;
}
