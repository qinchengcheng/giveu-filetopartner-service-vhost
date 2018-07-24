package com.giveu.giveufiletopartnerservicevhost.dao;

import com.giveu.giveufiletopartnerservicevhost.model.FilePushFail;
import java.math.BigDecimal;

public interface FilePushFailMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(FilePushFail record);

    int insertSelective(FilePushFail record);

    FilePushFail selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(FilePushFail record);

    int updateByPrimaryKey(FilePushFail record);
}