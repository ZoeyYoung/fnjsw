package fnjsw.mapper;

import fnjsw.entity.Familyplanningcertificate;
import fnjsw.entity.FamilyplanningcertificateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FamilyplanningcertificateMapper {
    int countByExample(FamilyplanningcertificateExample example);

    int deleteByExample(FamilyplanningcertificateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Familyplanningcertificate record);

    int insertSelective(Familyplanningcertificate record);

    List<Familyplanningcertificate> selectByExample(FamilyplanningcertificateExample example);

    Familyplanningcertificate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Familyplanningcertificate record, @Param("example") FamilyplanningcertificateExample example);

    int updateByExample(@Param("record") Familyplanningcertificate record, @Param("example") FamilyplanningcertificateExample example);

    int updateByPrimaryKeySelective(Familyplanningcertificate record);

    int updateByPrimaryKey(Familyplanningcertificate record);
}