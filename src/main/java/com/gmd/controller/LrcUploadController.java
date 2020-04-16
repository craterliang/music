package com.gmd.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import com.gmd.pojo.Lrc;
import com.gmd.service.LrcService;
import com.gmd.util.LrcData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class LrcUploadController {
    @Autowired
    private LrcService lrcService;

    @Value("${web.upload-path}")
    private String path;

    @RequestMapping(value = "lrcUpload")
    public void audioUpload(@RequestParam(value = "file[]", required = true) MultipartFile[] file) {
        String uuid;
        try {
            for (int i=0;i<file.length;i++) {
                uuid = UUID.randomUUID().toString().replaceAll("-", "");
                byte[] bytes = file[i].getBytes();
                File saveFile = new File(path + "\\lrc\\" + uuid + ".lrc");
                FileCopyUtils.copy(bytes, saveFile);
                LrcData ld = new LrcData(path + "\\lrc\\" + uuid + ".lrc");
                Lrc lrc =new Lrc();
                lrc.setLrcName(ld.printLrcName());
                lrc.setLrcPath(uuid);
                lrcService.insert(lrc);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}

