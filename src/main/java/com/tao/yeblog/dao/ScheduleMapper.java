package com.tao.yeblog.dao;

import com.github.pagehelper.Page;
import com.tao.yeblog.model.dto.ScheduleDTO;
import com.tao.yeblog.model.qo.ScheduleQO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 事项管理Mapper
 */
@Mapper
public interface ScheduleMapper {

    /**
     * 获取博客信息
     * @param scheduleQO
     * @return
     */
    Page<ScheduleDTO> pageScheduleInfo(ScheduleQO scheduleQO);

    /**
     * 更新事项信息
     * @param scheduleDTO
     * @return
     */
    void updateScheduleInfo(ScheduleDTO scheduleDTO);

    /**
     * 删除事项信息
     * @param scheduleDTO
     * @return
     */
    void deleteSchedule(ScheduleDTO scheduleDTO);

}
