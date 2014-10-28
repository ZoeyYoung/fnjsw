package fnjsw.mapper;

import fnjsw.entity.Onechildarchives;
import fnjsw.entity.OnechildarchivesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnechildarchivesMapper {
    int countByExample(OnechildarchivesExample example);

    int deleteByExample(OnechildarchivesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Onechildarchives record);

    int insertSelective(Onechildarchives record);

    List<Onechildarchives> selectByExampleWithBLOBs(OnechildarchivesExample example);

    List<Onechildarchives> selectByExample(OnechildarchivesExample example);

    Onechildarchives selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Onechildarchives record, @Param("example") OnechildarchivesExample example);

    int updateByExampleWithBLOBs(@Param("record") Onechildarchives record, @Param("example") OnechildarchivesExample example);

    int updateByExample(@Param("record") Onechildarchives record, @Param("example") OnechildarchivesExample example);

    int updateByPrimaryKeySelective(Onechildarchives record);

    int updateByPrimaryKeyWithBLOBs(Onechildarchives record);

    int updateByPrimaryKey(Onechildarchives record);
}