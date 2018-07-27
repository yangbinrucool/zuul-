package com.example.cloudconfigclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class CloudconfigclientApplicationTests {

//    @Test
    public void contextLoads() {
    }

    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("1", 23);
        map.put("2", 24);
        System.out.println(map.toString());
    }
}
