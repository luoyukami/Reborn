package cloud.luoyu.reborn.mbg.dao;

import cloud.luoyu.reborn.mbg.model.BmsTagBlogRelation;
import cloud.luoyu.reborn.mbg.model.BmsTagBlogRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsTagBlogRelationMapper {
    long countByExample(BmsTagBlogRelationExample example);

    int deleteByExample(BmsTagBlogRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BmsTagBlogRelation record);

    int insertSelective(BmsTagBlogRelation record);

    List<BmsTagBlogRelation> selectByExample(BmsTagBlogRelationExample example);

    BmsTagBlogRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BmsTagBlogRelation record, @Param("example") BmsTagBlogRelationExample example);

    int updateByExample(@Param("record") BmsTagBlogRelation record, @Param("example") BmsTagBlogRelationExample example);

    int updateByPrimaryKeySelective(BmsTagBlogRelation record);

    int updateByPrimaryKey(BmsTagBlogRelation record);
}