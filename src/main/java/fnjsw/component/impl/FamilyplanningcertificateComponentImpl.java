package fnjsw.component.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springside.modules.mapper.JsonMapper;

import fnjsw.entity.Familyplanningcertificate;
import fnjsw.entity.FamilyplanningcertificateExample;
import fnjsw.mapper.FamilyplanningcertificateMapper;

@Component
public class FamilyplanningcertificateComponentImpl {

    private static Logger logger = LoggerFactory
            .getLogger(FamilyplanningcertificateComponentImpl.class);

    private static JsonMapper mapper = JsonMapper.nonDefaultMapper();

    @Autowired
    private FamilyplanningcertificateMapper fpcMapper;

    public Familyplanningcertificate getById(int id) {
        return fpcMapper.selectByPrimaryKey(id);
    }

    public List<Familyplanningcertificate> getByOcaId(int ocaId) {
        List<Familyplanningcertificate> osaList =
                new ArrayList<Familyplanningcertificate>();

        FamilyplanningcertificateExample example =
                new FamilyplanningcertificateExample();
        FamilyplanningcertificateExample.Criteria criteria =
                example.createCriteria();
        criteria.andOcaidEqualTo(ocaId);
        example.setOrderByClause("ID ASC");
        // add log & try catch
        osaList = fpcMapper.selectByExample(example);

        return osaList;
    }

    public int save(Familyplanningcertificate oca) {
        // add log & try catch
        int result = fpcMapper.insert(oca);
        return result;
    }

    public List<Familyplanningcertificate> getAll() {
        List<Familyplanningcertificate> ocaList =
                new ArrayList<Familyplanningcertificate>();

        FamilyplanningcertificateExample example =
                new FamilyplanningcertificateExample();
        // add log & try catch
        ocaList = fpcMapper.selectByExample(example);
        return ocaList;
    }

    public int update(Familyplanningcertificate oca) {
        return fpcMapper.updateByPrimaryKey(oca);
    }

    public int delete(int id) {
        return fpcMapper.deleteByPrimaryKey(id);
    }

}
