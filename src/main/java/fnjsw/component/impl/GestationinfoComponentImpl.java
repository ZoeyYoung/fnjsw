package fnjsw.component.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fnjsw.entity.Gestationinfo;
import fnjsw.entity.GestationinfoExample;
import fnjsw.mapper.GestationinfoMapper;
import fnjsw.util.OnePage;

@Component
public class GestationinfoComponentImpl {
    private static Logger logger = LoggerFactory
            .getLogger(GestationinfoComponentImpl.class);

    @Autowired
    private GestationinfoMapper giMapper;

    public Gestationinfo getById(int id) {
        return giMapper.selectByPrimaryKey(id);
    }

    public int save(Gestationinfo gi) {
        // add log & try catch
        int result = giMapper.insert(gi);
        return result;
    }

    public int update(Gestationinfo gi) {
        return giMapper.updateByPrimaryKey(gi);
    }

    public int delete(int id) {
        return giMapper.deleteByPrimaryKey(id);
    }

    public int deleteByOcaId(int ocaId) {
        GestationinfoExample example = new GestationinfoExample();
        GestationinfoExample.Criteria criteria = example.createCriteria();
        criteria.andOcaidEqualTo(ocaId);
        return giMapper.deleteByExample(example);
    }

    public List<Gestationinfo> getAll() {
        List<Gestationinfo> ocaList = new ArrayList<Gestationinfo>();

        GestationinfoExample example = new GestationinfoExample();
        // add log & try catch
        ocaList = giMapper.selectByExample(example);
        return ocaList;
    }

    public OnePage<Gestationinfo> selectOnePage(
            GestationinfoExample example) {
        OnePage<Gestationinfo> onepage = new OnePage<Gestationinfo>();
        int count = giMapper.countByExample(example);
        List<Gestationinfo> ocaList = giMapper.selectByExample(example);
        example.getPage().setCount(count);
        onepage.setPage(example.getPage());
        onepage.setDataList(ocaList);
        return onepage;
    }

    public List<Gestationinfo> getByOcaId(int ocaId) {
        GestationinfoExample example = new GestationinfoExample();
        GestationinfoExample.Criteria criteria = example.createCriteria();
        criteria.andOcaidEqualTo(ocaId);
        example.setOrderByClause("ID ASC");
        return giMapper.selectByExample(example);
    }

}
