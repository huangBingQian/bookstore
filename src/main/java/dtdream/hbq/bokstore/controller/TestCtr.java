package dtdream.hbq.bokstore.controller;

import dtdream.hbq.bokstore.mapper.bookMapper;
import dtdream.hbq.bokstore.po.book;
import dtdream.hbq.bokstore.po.bookExample;
import dtdream.hbq.bokstore.service.impl.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by hbq on 2017/7/4.
 */
@Controller
public class TestCtr {

    @Autowired
    private TestService testService;

    @RequestMapping("/test1")
    @ResponseBody
    public List<book> test1(){
        return testService.selectAllBooks();
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }


}
