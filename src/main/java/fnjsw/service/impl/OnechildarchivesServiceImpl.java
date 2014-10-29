package fnjsw.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fnjsw.component.impl.DivisionComponentImpl;
import fnjsw.component.impl.FamilyplanningcertificateComponentImpl;
import fnjsw.component.impl.GestationinfoComponentImpl;
import fnjsw.component.impl.OnechildarchivesComponentImpl;
import fnjsw.entity.Division;
import fnjsw.entity.Familyplanningcertificate;
import fnjsw.entity.Gestationinfo;
import fnjsw.entity.Onechildarchives;
import fnjsw.entity.OnechildarchivesExample;
import fnjsw.util.OnePage;

@Service
@Transactional(readOnly = true)
public class OnechildarchivesServiceImpl {

    @Autowired
    private OnechildarchivesComponentImpl ocaComponent;
    @Autowired
    private GestationinfoComponentImpl giComponent;
    @Autowired
    private FamilyplanningcertificateComponentImpl fpcComponent;
    @Autowired
    private DivisionComponentImpl divComponent;

    public Onechildarchives getOcaById(int id) {
        return ocaComponent.getById(id);
    }

    public List<Onechildarchives> getOcaByFName(String fname) {
        return ocaComponent.getByFName(fname);
    }

    public List<Onechildarchives> getAllOca() {
        return ocaComponent.getAll();
    }

    @Transactional
    public int saveOca(Onechildarchives oca) {
        return ocaComponent.save(oca);
    }

    @Transactional
    public int updateOca(Onechildarchives oca) {
        return ocaComponent.update(oca);
    }

    @Transactional
    public int deleteOca(int id) {
        return ocaComponent.delete(id);
    }

    public OnePage<Onechildarchives> selectOnePage(
            OnechildarchivesExample example, Onechildarchives oca,
            Date startdate, Date enddate) {
        OnechildarchivesExample.Criteria cirteria = example.createCriteria();
        try {
            // 在这里添加查询条件
            if (StringUtils.isNotEmpty(oca.getFname())) {
                cirteria.andFnameLike("%"
                        + URLDecoder.decode(oca.getFname(), "UTF-8") + "%");
            }
            if (StringUtils.isNotEmpty(oca.getFidcardno())) {
                cirteria.andFidcardnoEqualTo(oca.getFidcardno());
            }
            if (StringUtils.isNotEmpty(oca.getServiceno())) {
                cirteria.andServicenoEqualTo(URLDecoder.decode(oca.getFname(),
                        "UTF-8"));
            }
        } catch (UnsupportedEncodingException e) {

        }
        if (startdate != null && enddate != null) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(enddate);
            cal.add(Calendar.DATE, 1);
            cirteria.andRegistrationdateBetween(startdate, cal.getTime());
        } else if (startdate != null && enddate == null) {
            cirteria.andRegistrationdateGreaterThanOrEqualTo(startdate);
        } else if (startdate == null && enddate != null) {
            cirteria.andRegistrationdateLessThanOrEqualTo(enddate);
        }
        // 对 criteria 的条件进行修改
        return ocaComponent.selectOnePage(example);
    }

    public List<Gestationinfo> getGiByOcaId(int ocaId) {
        return giComponent.getByOcaId(ocaId);
    }

    public Gestationinfo getGiById(int id) {
        return giComponent.getById(id);
    }

    @Transactional
    public int saveGi(Gestationinfo gi) {
        return giComponent.save(gi);
    }

    @Transactional
    public int updateGi(Gestationinfo gi) {
        return giComponent.update(gi);
    }

    @Transactional
    public int deleteGi(int id) {
        return giComponent.delete(id);
    }

    public List<Familyplanningcertificate> getFpcByOcaId(int ocaId) {
        return fpcComponent.getByOcaId(ocaId);
    }

    public Familyplanningcertificate getFpcById(int id) {
        return fpcComponent.getById(id);
    }

    @Transactional
    public int saveFpc(Familyplanningcertificate fpc) {
        return fpcComponent.save(fpc);
    }

    @Transactional
    public int updateFpc(Familyplanningcertificate fpc) {
        return fpcComponent.update(fpc);
    }

    @Transactional
    public int deleteFpc(int fpc) {
        return fpcComponent.delete(fpc);
    }

    public List<Division> queryDivByCode(String code) {
        return divComponent.queryDivByCode(code);
    }
    
    public List<Division> getDivByCode(String code){
    	return divComponent.getDivByCode(code);
    }
}
