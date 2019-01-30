package com.chenyh.controller;

import com.chenyh.repository.BasicNativeSQLQuery;
import com.chenyh.repository.UserRepository;
import com.chenyh.util.JsonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BasicNativeSQLQuery basicNativeSQLQuery;

    @RequestMapping
    @ResponseBody
    public List<Object> index(HttpServletRequest request) throws JsonProcessingException {
        List<Object> result = userRepository.customizeNativeSQL(2);
////        List<User> users = (List<User>) userRepository.findAll();
////        JsonUtil.toJSONString(users);
        List<Object> sqlResult = basicNativeSQLQuery.execNativeSQLReturnListResult("SELECT * FROM user_device where report_date = '2018-02-01shrfsgfhdfghsfdghgfdhgfdhdhgffdhgdfhg'");
        System.out.println(JsonUtil.toJSONString(sqlResult));
        return sqlResult;
    }

}
