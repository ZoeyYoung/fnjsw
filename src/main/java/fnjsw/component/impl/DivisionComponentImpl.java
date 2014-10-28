package fnjsw.component.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springside.modules.mapper.JsonMapper;

import fnjsw.entity.Division;
import fnjsw.entity.DivisionExample;
import fnjsw.mapper.DivisionMapper;

@Component
public class DivisionComponentImpl {

    private static Logger logger = LoggerFactory
            .getLogger(DivisionComponentImpl.class);

    private static JsonMapper mapper = JsonMapper.nonDefaultMapper();

    @Autowired
    private DivisionMapper divisionMapper;

    public List<Division> getByCode(String code) {
        List<Division> divisionList = new ArrayList<Division>();

        DivisionExample example = new DivisionExample();
        DivisionExample.Criteria criteria = example.createCriteria();
        criteria.andDivcodeLike(code + "");
        // add log & try catch
        divisionList = divisionMapper.selectByExample(example);

        return divisionList;
    }

    public int save(Division Division) {
        // add log & try catch
        int result = divisionMapper.insert(Division);
        return result;
    }

    public List<Division> getAll() {
        List<Division> DivisionList = new ArrayList<Division>();

        DivisionExample example = new DivisionExample();
        // DivisionExample.Criteria criteria = example.createCriteria();
        // add log & try catch
        DivisionList = divisionMapper.selectByExample(example);
        return DivisionList;
    }

    public int update(Division division) {
        return divisionMapper.updateByPrimaryKey(division);
    }

    public int delete(int id) {
        return divisionMapper.deleteByPrimaryKey(id);
    }

}
