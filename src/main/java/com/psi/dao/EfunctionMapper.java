package com.psi.dao;

import com.psi.bean.Efunction;
import com.psi.bean.EfunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EfunctionMapper {
    long countByExample(EfunctionExample example);

    int deleteByExample(EfunctionExample example);

    int deleteByPrimaryKey(Long fid);

    int insert(Efunction record);

    int insertSelective(Efunction record);

    List<Efunction> selectByExample(EfunctionExample example);

    Efunction selectByPrimaryKey(Long fid);

    int updateByExampleSelective(@Param("record") Efunction record, @Param("example") EfunctionExample example);

    int updateByExample(@Param("record") Efunction record, @Param("example") EfunctionExample example);

    int updateByPrimaryKeySelective(Efunction record);

    int updateByPrimaryKey(Efunction record);
}