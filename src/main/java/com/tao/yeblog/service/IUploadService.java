package com.tao.yeblog.service;

import com.tao.yeblog.model.dto.FileDTO;

/**
 * 文件上传Service
 */
public interface IUploadService {

    /**
     * 存储文件信息
     * @param fileDTO
     * @return
     */
    void saveUploadFile(FileDTO fileDTO);
}
