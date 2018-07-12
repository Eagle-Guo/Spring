package org.core.spring.chapter3;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomizeApplicationContextLoad {

    private List<BeanDefinition> beanDefinitions = new ArrayList<>();
    private Map<String, Object> beans = new HashMap<>();

    public CustomizeApplicationContextLoad (String xmlFile) {
        this.readXML(xmlFile);
        this.instanceBean();
    }

    private void readXML(String xmlFile) {
        SAXReader saxReader = new SAXReader();
        Document document = null;
        try {
            URL xmlPath = this.getClass().getClassLoader().getResource(xmlFile);
            document = saxReader.read(xmlPath);
            Map<String, String> nsMap = new HashMap<>();
            nsMap.put("ns", "http://www.springframework.org/schema/beans"); // Add the name space
            XPath xSub = document.createXPath("//ns:beans/ns:bean");
            xSub.setNamespaceURIs(nsMap);
            List<Element> beans = xSub.selectNodes(document);
            for (Element element : beans) {
                String id = element.attributeValue("id");
                String clazz = element.attributeValue("class");
                BeanDefinition beanDefinition = new BeanDefinition(id, clazz);
                beanDefinitions.add(beanDefinition);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void instanceBean() {
        try {
            for (BeanDefinition beanDefinition : beanDefinitions) {
                Object clazz = Class.forName(beanDefinition.getClazz()).newInstance();
                //Object clazz = Class.forName("org.core.spring.impl.PersonServiceImpl").newInstance();
                beans.put(beanDefinition.getId(), clazz);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public Object getBean (String beanName) {
        return beans.get(beanName);
    }
}
