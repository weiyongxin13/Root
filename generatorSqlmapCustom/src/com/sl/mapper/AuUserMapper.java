package com.sl.mapper;

import com.sl.entity.AuUser;
import com.sl.entity.AuUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuUserMapper {
    int countByExample(AuUserExample example);

    int deleteByExample(AuUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AuUser record);

    int insertSelective(AuUser record);

    List<AuUser> selectByExample(AuUserExample example);

    AuUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AuUser record, @Param("example") AuUserExample example);

    int updateByExample(@Param("record") AuUser record, @Param("example") AuUserExample example);

    int updateByPrimaryKeySelective(AuUser record);

    int updateByPrimaryKey(AuUser record);
}