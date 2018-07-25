package com.giveu.giveufiletopartnerservicevhost.dao;

import com.giveu.giveufiletopartnerservicevhost.model.FilePushFail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component
@Mapper
public interface FilePushFailMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(FilePushFail record);

    int insertSelective(FilePushFail record);

    FilePushFail selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(FilePushFail record);

    int updateByPrimaryKey(FilePushFail record);
}