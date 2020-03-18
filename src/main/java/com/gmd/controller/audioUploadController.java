package com.gmd.controller;

import com.gmd.pojo.Mp3Info;
import com.gmd.util.Mp3InfoUtil;
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
public class audioUploadController {
    @Value("${web.upload-path}")
    private String path;

    @RequestMapping(value = "audioUpload")
    public Mp3Info audioUpload(@RequestParam(value = "file", required = true) MultipartFile file) {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        Mp3Info songInfo = new Mp3Info();
        try {
            byte[] bytes = file.getBytes();
            File saveFile = new File(path +"\\audio\\"+ uuid + ".mp3");
            FileCopyUtils.copy(bytes, saveFile);
            songInfo= Mp3InfoUtil.getSongInfo(path +"\\audio\\"+ uuid + ".mp3");
            songInfo.setUuid(uuid);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return songInfo;
    }


}
