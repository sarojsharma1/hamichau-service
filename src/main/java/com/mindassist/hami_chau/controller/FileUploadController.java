package com.mindassist.hami_chau.controller;

import com.mindassist.hami_chau.service.FileUploadService;
import com.mindassist.hami_chau.util.TimeUtility;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/file-upload")
public class FileUploadController {

    @Autowired
    private final FileUploadService fileUploadService;

    //    @ResponseStatus()
    @PostMapping("")
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {
        //test file name null or not if user donot upload any thing

        if (file.isEmpty()) {
            System.out.println("file is empty");
            return "Fail";
        } else {
            this.fileUploadService.handleFileUpload(file);
            return "Success";
        }
    }

    @PostMapping("/test")
    public void Test() {
        TimeUtility.formatDate();
    }
}