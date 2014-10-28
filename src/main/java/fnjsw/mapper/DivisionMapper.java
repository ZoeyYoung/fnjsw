package fnjsw.mapper;

import fnjsw.entity.Division;
import fnjsw.entity.DivisionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DivisionMapper {
    int countByExample(DivisionExample example);

    int deleteByExample(DivisionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Division record);

    int insertSelective(Division record);

    List<Division> selectByExample(DivisionExample example);

    Division selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Division record, @Param("example") DivisionExample example);

    int updateByExample(@Param("record") Division record, @Param("example") DivisionExample example);

    int updateByPrimaryKeySelective(Division record);

    int updateByPrimaryKey(Division record);
}