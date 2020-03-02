package com.tao.yeblog.common;

import java.io.Serializable;

public class Pager implements Serializable {
    protected int pageIndex;
    protected int pageSize;
    protected int pageCount = 0;
    protected int recordCount = 0;

    private int prePageIndex = 0;
    private int nextPageIndex = 0;
    private boolean existsPrePage = false;
    private boolean existsNextPage = false;

    protected Pager() {
        this.pageIndex = 1;
        this.pageSize = 10;
    }

}
