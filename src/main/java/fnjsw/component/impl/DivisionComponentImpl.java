package fnjsw.component.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fnjsw.entity.Division;
import fnjsw.entity.DivisionExample;
import fnjsw.mapper.DivisionMapper;

@Component
public class DivisionComponentImpl {

    private static Logger logger = LoggerFactory
            .getLogger(DivisionComponentImpl.class);

    @Autowired
    private DivisionMapper divisionMapper;

    public List<Division> getByCode(String code){
        DivisionExample example = new DivisionExample();
        DivisionExample.Criteria criteria = example.createCriteria();
        // 
        String query = getTrimResult(code);
        criteria.andDivcodeNotEqualTo(code);
        criteria.andDivcodeLike(query);
        return divisionMapper.selectByExample(example);
    }

    private String getTrimResult(String code) {
        if (code == null || "".equals(code)) {
            return "%0000000000000"; // 13个0
        }
        String str02 = code.substring(0, 2);
        String str24 = code.substring(2, 4);
        String str46 = code.substring(4, 6);
        String str69 = code.substring(6, 9);
        String str912 = code.substring(9, 12);
        // String str1215 = code.substring(12, 15);
        if (str02.equals("00")) {
            return code;
        }
        if (str24.equals("00")) {
            return str02 + "%00000000000"; // 11 个0
        }
        if (str46.equals("00")) {
            return str02 + str24 + "%000000000"; // 9个0
        }
        if (str69.equals("000")) {
            return str02 + str24 + str46 + "%000000"; // 6个0
        }
        if (str912.equals("000")) {
            return str02 + str24 + str46 + str69 + "%000"; // 3个0
        }
        return code;
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
