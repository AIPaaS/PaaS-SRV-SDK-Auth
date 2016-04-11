package com.ai.paas.ipaas.auth.dao.interfaces;

import com.ai.paas.ipaas.auth.dao.mapper.bo.AuthHistory;
import com.ai.paas.ipaas.auth.dao.mapper.bo.AuthHistoryCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthHistoryMapper {
    int countByExample(AuthHistoryCriteria example);

    int deleteByExample(AuthHistoryCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthHistory record);

    int insertSelective(AuthHistory record);

    List<AuthHistory> selectByExample(AuthHistoryCriteria example);

    AuthHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthHistory record, @Param("example") AuthHistoryCriteria example);

    int updateByExample(@Param("record") AuthHistory record, @Param("example") AuthHistoryCriteria example);

    int updateByPrimaryKeySelective(AuthHistory record);

    int updateByPrimaryKey(AuthHistory record);
}