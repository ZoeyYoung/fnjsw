package fnjsw.mapper;

import fnjsw.entity.Gestationinfo;
import fnjsw.entity.GestationinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GestationinfoMapper {
    int countByExample(GestationinfoExample example);

    int deleteByExample(GestationinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gestationinfo record);

    int insertSelective(Gestationinfo record);

    List<Gestationinfo> selectByExample(GestationinfoExample example);

    Gestationinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gestationinfo record, @Param("example") GestationinfoExample example);

    int updateByExample(@Param("record") Gestationinfo record, @Param("example") GestationinfoExample example);

    int updateByPrimaryKeySelective(Gestationinfo record);

    int updateByPrimaryKey(Gestationinfo record);
}