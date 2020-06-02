package cloud.luoyu.reborn.mbg.dao;

import cloud.luoyu.reborn.mbg.model.BmsTag;
import cloud.luoyu.reborn.mbg.model.BmsTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsTagMapper {
    long countByExample(BmsTagExample example);

    int deleteByExample(BmsTagExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BmsTag record);

    int insertSelective(BmsTag record);

    List<BmsTag> selectByExample(BmsTagExample example);

    BmsTag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BmsTag record, @Param("example") BmsTagExample example);

    int updateByExample(@Param("record") BmsTag record, @Param("example") BmsTagExample example);

    int updateByPrimaryKeySelective(BmsTag record);

    int updateByPrimaryKey(BmsTag record);
}