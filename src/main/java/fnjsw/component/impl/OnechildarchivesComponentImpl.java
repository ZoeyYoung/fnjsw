package fnjsw.component.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springside.modules.mapper.JsonMapper;

import fnjsw.entity.Gestationinfo;
import fnjsw.entity.GestationinfoExample;
import fnjsw.entity.Onechildarchives;
import fnjsw.entity.OnechildarchivesExample;
import fnjsw.mapper.GestationinfoMapper;
import fnjsw.mapper.OnechildarchivesMapper;
import fnjsw.util.OnePage;

@Component
public class OnechildarchivesComponentImpl {

    private static Logger logger = LoggerFactory
            .getLogger(OnechildarchivesComponentImpl.class);

    private static JsonMapper mapper = JsonMapper.nonDefaultMapper();

    @Autowired
    private OnechildarchivesMapper ocaMapper;

    @Autowired
    private GestationinfoMapper giMapper;
    
    public Onechildarchives getById(int id) {
        return ocaMapper.selectByPrimaryKey(id);
    }

    public List<Onechildarchives> getByFName(String fname) {
        List<Onechildarchives> osaList = new ArrayList<Onechildarchives>();

        OnechildarchivesExample example = new OnechildarchivesExample();
        OnechildarchivesExample.Criteria criteria = example.createCriteria();
        criteria.andFnameEqualTo(fname);
        // add log & try catch
        osaList = ocaMapper.selectByExample(example);

        return osaList;
    }

    public int save(Onechildarchives oca) {
        // add log & try catch
        int result = ocaMapper.insert(oca);
        return result;
    }

    public List<Onechildarchives> getAll() {
        List<Onechildarchives> ocaList = new ArrayList<Onechildarchives>();

        OnechildarchivesExample example = new OnechildarchivesExample();
        // add log & try catch
        ocaList = ocaMapper.selectByExample(example);
        return ocaList;
    }

    public OnePage<Onechildarchives> selectOnePage(
            OnechildarchivesExample example) {
        OnePage<Onechildarchives> onepage = new OnePage<Onechildarchives>();

        int count = ocaMapper.countByExample(example);

        List<Onechildarchives> ocaList = ocaMapper.selectByExample(example);

        example.getPage().setCount(count);
        onepage.setPage(example.getPage());
        onepage.setDataList(ocaList);

        return onepage;
    }

    public int update(Onechildarchives oca) {
        return ocaMapper.updateByPrimaryKey(oca);
    }

    public int delete(int id) {
        return ocaMapper.deleteByPrimaryKey(id);
    }

    public List<Gestationinfo> getGestationInfo(int ocaId) {
        GestationinfoExample example = new GestationinfoExample();
        GestationinfoExample.Criteria criteria = example.createCriteria();
        criteria.andOcaidEqualTo(ocaId);
        example.setOrderByClause("ID ASC");
        return giMapper.selectByExample(example);
    }

}
