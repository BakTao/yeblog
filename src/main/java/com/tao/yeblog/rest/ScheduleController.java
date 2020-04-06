package com.tao.yeblog.rest;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.common.Response;
import com.tao.yeblog.model.dto.ScheduleDTO;
import com.tao.yeblog.model.qo.ScheduleQO;
import com.tao.yeblog.service.IScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 事项管理Controller
 */
@RestController
@RequestMapping("/back/scheduleServices")
public class ScheduleController {

    @Autowired
    private IScheduleService scheduleService;

    /**
     * 获取事项信息
     *
     * @param scheduleQO
     * @return
     */
    @PostMapping("/pageScheduleInfo")
    public Response<IPage<ScheduleDTO>> pageScheduleInfo(@RequestBody ScheduleQO scheduleQO) {
        return Response.successData(scheduleService.pageScheduleInfo(scheduleQO));
    }

    /**
     * 更新事项信息
     *
     * @param scheduleDTO
     * @return
     */
    @PostMapping("/updateScheduleInfo")
    public Response<String> updateScheduleInfo(@RequestBody ScheduleDTO scheduleDTO) {
        return Response.successData(scheduleService.updateScheduleInfo(scheduleDTO));
    }

    /**
     * 删除事项信息
     *
     * @param scheduleDTO
     * @return
     */
    @PostMapping("/deleteSchedule")
    public Response<String> deleteSchedule(@RequestBody ScheduleDTO scheduleDTO) {
        if(scheduleDTO.getScheduleId() == null || "".equals(scheduleDTO.getScheduleId())){
            return new Response<>("001","事项ID不能为空");
        }
        return Response.successData(scheduleService.deleteSchedule(scheduleDTO));
    }
}
