package com.chenyh.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

    private static ObjectMapper json = new ObjectMapper();


    public static String toJSONString(Object object) throws JsonProcessingException {

        return json.writeValueAsString(object);

    }


}
