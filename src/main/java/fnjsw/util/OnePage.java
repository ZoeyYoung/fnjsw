package fnjsw.util;

import java.util.List;

/**
 * common one page data class
 * 
 * @author wangsg
 * @param <T>
 */
public class OnePage<T> {

    // data class
    private List<T> dataList;

    // page information
    private Page page;

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

}
