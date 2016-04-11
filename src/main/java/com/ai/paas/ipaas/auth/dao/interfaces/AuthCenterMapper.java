package com.ai.paas.ipaas.auth.dao.interfaces;

import com.ai.paas.ipaas.auth.dao.mapper.bo.AuthCenter;
import com.ai.paas.ipaas.auth.dao.mapper.bo.AuthCenterCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthCenterMapper {
    int countByExample(AuthCenterCriteria example);

    int deleteByExample(AuthCenterCriteria example);

    int deleteByPrimaryKey(Long authId);

    int insert(AuthCenter record);

    int insertSelective(AuthCenter record);

    List<AuthCenter> selectByExample(AuthCenterCriteria example);

    AuthCenter selectByPrimaryKey(Long authId);

    int updateByExampleSelective(@Param("record") AuthCenter record, @Param("example") AuthCenterCriteria example);

    int updateByExample(@Param("record") AuthCenter record, @Param("example") AuthCenterCriteria example);

    int updateByPrimaryKeySelective(AuthCenter record);

    int updateByPrimaryKey(AuthCenter record);
}