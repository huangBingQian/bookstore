package dtdream.hbq.bokstore.mapper;

import dtdream.hbq.bokstore.po.book;
import dtdream.hbq.bokstore.po.bookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface bookMapper {
    long countByExample(bookExample example);

    int deleteByExample(bookExample example);

    int insert(book record);

    int insertSelective(book record);

    List<book> selectByExample(bookExample example);

    int updateByExampleSelective(@Param("record") book record, @Param("example") bookExample example);

    int updateByExample(@Param("record") book record, @Param("example") bookExample example);
}