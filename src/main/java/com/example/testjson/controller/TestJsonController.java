package com.example.testjson.controller;

import com.example.testjson.model.TestObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestJsonController {

    @GetMapping("/json")
    public List<Map<String, Object>> returnJsonObject() {
        List<Map<String, Object>> jsonObject = new ArrayList<>();
        Map<String, Object> firstObject = new HashMap<>();
        firstObject.put("name", "jsonTest");
        firstObject.put("value", "test1");

        Map<String, Object> secondObject = new HashMap<>();
        secondObject.put("name", "complexObject");
        secondObject.put("value", new TestObject("prova1", "test1", 15, 42));

        jsonObject.add(firstObject);
        jsonObject.add(secondObject);
        return jsonObject;
    }

}
