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

import fnjsw.component.impl.OnechildarchivesComponentImpl;
import fnjsw.entity.Onechildarchives;
import fnjsw.entity.OnechildarchivesExample;
import fnjsw.util.OnePage;

@Service
@Transactional(readOnly = true)
public class OnechildarchivesServiceImpl {

    @Autowired
    private OnechildarchivesComponentImpl ocaComponent;

    public Onechildarchives getById(int id) {
        return ocaComponent.getById(id);
    }

    public List<Onechildarchives> getByFName(String fname) {
        return ocaComponent.getByFName(fname);
    }

    @Transactional
    public int save(Onechildarchives oca) {
        return ocaComponent.save(oca);
    }

    public List<Onechildarchives> getAll() {
        return ocaComponent.getAll();
    }

    public OnePage<Onechildarchives> selectOnePage(
            OnechildarchivesExample example, Onechildarchives oca) {
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
        if (oca.getRegistrationdate() != null) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(oca.getRegistrationdate());
            cal.set(Calendar.DAY_OF_MONTH, 1);
            Date start = cal.getTime();
            cal.add(Calendar.MONTH, 1);
            cal.set(Calendar.DAY_OF_MONTH, 0);
            Date end = cal.getTime();
            System.out.println(start.toString() + " " + end.toString());
            cirteria.andRegistrationdateBetween(start, end);
        }
        // 对 criteria 的条件进行修改
        return ocaComponent.selectOnePage(example);
    }

    @Transactional
    public int update(Onechildarchives oca) {
        return ocaComponent.update(oca);
    }

    @Transactional
    public int delete(int id) {
        return ocaComponent.delete(id);
    }

}
