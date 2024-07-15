package com.mindassist.hami_chau.service;

import com.mindassist.hami_chau.object.dto.UploadFileInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class FileUploadService {

    @Value("${uploadDir}")
    private String uploadDir;

    public void handleFileUpload(MultipartFile file) {
        StringBuilder stringBuilder = new StringBuilder();
        String filePath = stringBuilder.append(uploadDir)
                .append(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()))
                .append(file.getOriginalFilename()).toString();

        UploadFileInfo uploadFileInfo = UploadFileInfo.builder()
                .fileName(file.getOriginalFilename())
                .fileSize(file.getSize())
                .contentType(file.getContentType())
                .fileUploadDate(new Date()).build();

        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
            byte[] fileByte = file.getBytes();
            fileOutputStream.write(fileByte);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
