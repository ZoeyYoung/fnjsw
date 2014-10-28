package fnjsw.component.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springside.modules.mapper.JsonMapper;

import fnjsw.entity.Division;
import fnjsw.entity.DivisionExample;
import fnjsw.entity.Onechildarchives;
import fnjsw.entity.OnechildarchivesExample;
import fnjsw.mapper.DivisionMapper;
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
    private DivisionMapper divMapper;

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

    public List<Division> queryDivision(String code) {
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
        return divMapper.selectByExample(example);
    }

}
