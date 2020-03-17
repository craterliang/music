package com.gmd.controller;


import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class ImgUploadController {

    @Value("${web.upload-path}")
    private String path;

    @RequestMapping(value = "ImgUpload")
    public String ImgUpload(@RequestParam(value = "file", required = true) MultipartFile file) {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        try {
            byte[] bytes = file.getBytes();
            File saveFile = new File(path +"\\img\\"+ uuid + ".jpg");
            FileCopyUtils.copy(bytes, saveFile);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
        return uuid;
    }


}
