package com.tao.yeblog.service.impl;

import com.tao.yeblog.dao.UploadMapper;
import com.tao.yeblog.model.dto.FileDTO;
import com.tao.yeblog.service.IUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UploadService implements IUploadService {

    @Autowired
    private UploadMapper uploadMapper;


    @Override
    public void saveUploadFile(FileDTO fileDTO) {
        uploadMapper.saveUploadFile(fileDTO);
    }
}
