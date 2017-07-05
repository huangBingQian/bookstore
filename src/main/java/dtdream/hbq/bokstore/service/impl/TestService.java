package dtdream.hbq.bokstore.service.impl;

import dtdream.hbq.bokstore.mapper.bookMapper;
import dtdream.hbq.bokstore.po.book;
import dtdream.hbq.bokstore.po.bookExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hbq on 2017/7/4.
 */
@Service
public class TestService {

    @Resource
    private bookMapper bookMapper;

    public List<book> selectAllBooks(){
        bookExample be = new bookExample();
        bookExample.Criteria c = be.createCriteria();
        c.getAllCriteria();
        List<book> books = bookMapper.selectByExample(be);
        return books;

    }
}
