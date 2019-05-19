package com.javaedge.mapper;

import com.javaedge.po.Rectab;
import com.javaedge.po.RectabExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RectabMapper {
    int countByExample(RectabExample example);

    int deleteByExample(RectabExample example);

    int insert(Rectab record);

    int insertSelective(Rectab record);

    List<Rectab> selectByExample(RectabExample example);

    int updateByExampleSelective(@Param("record") Rectab record, @Param("example") RectabExample example);

    int updateByExample(@Param("record") Rectab record, @Param("example") RectabExample example);
}