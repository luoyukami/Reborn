package cloud.luoyu.reborn.mbg.dao;

import cloud.luoyu.reborn.mbg.model.BmsBlog;
import cloud.luoyu.reborn.mbg.model.BmsBlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsBlogMapper {
    long countByExample(BmsBlogExample example);

    int deleteByExample(BmsBlogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BmsBlog record);

    int insertSelective(BmsBlog record);

    List<BmsBlog> selectByExampleWithBLOBs(BmsBlogExample example);

    List<BmsBlog> selectByExample(BmsBlogExample example);

    BmsBlog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BmsBlog record, @Param("example") BmsBlogExample example);

    int updateByExampleWithBLOBs(@Param("record") BmsBlog record, @Param("example") BmsBlogExample example);

    int updateByExample(@Param("record") BmsBlog record, @Param("example") BmsBlogExample example);

    int updateByPrimaryKeySelective(BmsBlog record);

    int updateByPrimaryKeyWithBLOBs(BmsBlog record);

    int updateByPrimaryKey(BmsBlog record);
}