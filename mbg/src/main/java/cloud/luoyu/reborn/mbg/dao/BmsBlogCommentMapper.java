package cloud.luoyu.reborn.mbg.dao;

import cloud.luoyu.reborn.mbg.model.BmsBlogComment;
import cloud.luoyu.reborn.mbg.model.BmsBlogCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsBlogCommentMapper {
    long countByExample(BmsBlogCommentExample example);

    int deleteByExample(BmsBlogCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BmsBlogComment record);

    int insertSelective(BmsBlogComment record);

    List<BmsBlogComment> selectByExample(BmsBlogCommentExample example);

    BmsBlogComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BmsBlogComment record, @Param("example") BmsBlogCommentExample example);

    int updateByExample(@Param("record") BmsBlogComment record, @Param("example") BmsBlogCommentExample example);

    int updateByPrimaryKeySelective(BmsBlogComment record);

    int updateByPrimaryKey(BmsBlogComment record);
}