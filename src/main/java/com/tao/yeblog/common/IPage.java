package com.tao.yeblog.common;

import java.io.Serializable;
import java.util.List;

public interface IPage<T> extends Serializable {
    Pager getPager();

    List<T> getData();

}
