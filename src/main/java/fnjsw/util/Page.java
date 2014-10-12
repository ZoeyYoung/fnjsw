package fnjsw.util;

/**
 * Pagination class
 */
public class Page {
    // 分页查询开始记录位置
    private int begin;
    // 分页查看下结束位置
    private int end;
    // 每页显示记录数
    private int length;
    // 查询结果总记录数
    private int count;
    // 当前页码
    private int current;
    // 总共页数
    private int total;

    private boolean haveNext = false;

    private boolean havePrevious = false;

    private boolean haveFirstPage = false;

    private boolean haveLastPage = false;

    private int nextPageNo;

    private int previousPageNo;

    public Page() {}

    /**
     * 构造函数
     * 
     * @param begin
     * @param length
     */
    public Page(int begin, int length) {
        this.begin = begin;
        this.length = length;
        this.end = this.begin + this.length;
        this.current = (int) Math.floor((this.begin * 1.0d) / this.length) + 1;
    }

    /**
     * @param begin
     * @param length
     * @param count
     */
    public Page(int begin, int length, int count) {
        this(begin, length);
        this.count = count;
    }

    /**
     * @return the begin
     */
    public int getBegin() {
        return begin;
    }

    /**
     * @return the end
     */
    public int getEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(int end) {
        this.end = end;
    }

    /**
     * @param begin the begin to set
     */
    public void setBegin(int begin) {
        this.begin = begin;
        if (this.length != 0) {
            this.current =
                    (int) Math.floor((this.begin * 1.0d) / this.length) + 1;
        }
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
        if (this.begin != 0) {
            this.current =
                    (int) Math.floor((this.begin * 1.0d) / this.length) + 1;
        }
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
        this.total = (int) Math.floor((this.count * 1.0d) / this.length);
        if (this.count % this.length != 0) {
            this.total++;
        }
    }

    /**
     * @return the current
     */
    public int getCurrent() {
        return current;
    }

    /**
     * @param current the current to set
     */
    public void setCurrent(int current) {
        this.current = current;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        if (total == 0) {
            return 1;
        }
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    public boolean getHaveNext() {
        if (this.current < this.total)
            haveNext = true;
        return haveNext;
    }

    public void setHaveNext(boolean haveNext) {
        this.haveNext = haveNext;
    }

    public boolean getHavePrevious() {
        if (this.current > 1)
            havePrevious = true;
        return havePrevious;
    }

    public void setHavePrevious(boolean havePrevious) {
        this.havePrevious = havePrevious;
    }

    public boolean getHaveFirstPage() {
        if (this.current > 1)
            haveFirstPage = true;
        return haveFirstPage;
    }

    public void setHaveFirstPage(boolean haveFirstPage) {
        this.haveFirstPage = haveFirstPage;
    }

    public boolean getHaveLastPage() {
        if (this.current < this.total)
            haveLastPage = true;
        return haveLastPage;
    }

    public void setHaveLastPage(boolean haveLastPage) {
        this.haveLastPage = haveLastPage;
    }

    public int getNextPageNo() {
        if (this.current >= 1 && this.current < this.total) {
            this.nextPageNo = this.current + 1;
        } else {
            this.nextPageNo = this.total;
        }
        return nextPageNo;
    }

    public int getPreviousPageNo() {
        if (this.current > 1) {
            this.previousPageNo = this.current - 1;
        } else {
            this.previousPageNo = 1;
        }
        return previousPageNo;
    }

    @Override
    public String toString() {
        return "Page [begin=" + begin + ", end=" + end + ", length=" + length
                + ", count=" + count + ", current=" + current + ", total="
                + total + ", haveNext=" + haveNext + ", havePrevious="
                + havePrevious + ", haveFirstPage=" + haveFirstPage
                + ", haveLastPage=" + haveLastPage + ", nextPageNo="
                + nextPageNo + ", previousPageNo=" + previousPageNo + "]";
    }


}
