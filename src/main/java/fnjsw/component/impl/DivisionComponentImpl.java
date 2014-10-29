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

    public List<Division> getByCode(String code) {
        DivisionExample example = new DivisionExample();
        DivisionExample.Criteria criteria = example.createCriteria();
        // 大于等于两个0的情况
        String regex = "0{2,}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(code);
        // result 为前面非0的数字
        String result = m.replaceAll("").trim();
        // sql like 为 12%0000... 后面的零的个数，通过如下的 sb 获得
        int origLength = result.length();
        int zeroFill = 15 - 2 - origLength;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zeroFill; i++) {
            sb.append("0");
        }
        criteria.andDivcodeNotEqualTo(code);
        criteria.andDivcodeLike(result + "%" + sb.toString());
        return divisionMapper.selectByExample(example);
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
