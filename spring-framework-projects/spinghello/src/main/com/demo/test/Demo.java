package com.demo.test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @Author: liulg
 * @Date: 2020/9/23 16:43
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String s =  mapper.readValue("123",String.class);

//        当反序列化json时，未知属性会引起的反序列化被打断，这里我们禁用未知属性打断反序列化功能，
//        因为，例如json里有10个属性，而我们的bean中只定义了2个属性，其它8个属性将被忽略
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        //从json映射到java对象，得到country对象后就可以遍历查找,下面遍历部分内容，能说明问题就可以了
        TestJson testJson = mapper.readValue("{\"a\":\"1\",\"b\":\"2\",\"c\":\"test\",\"d\":\"true\",\"e\":\"e\"}", TestJson.class);
      System.out.println(s);

    }
}

class TestJson {
    private Integer a;
    private Integer b;
    private String c;
    private Boolean d;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public Boolean getD() {
        return d;
    }

    public void setD(Boolean d) {
        this.d = d;
    }
}
