package com.mindassist.hami_chau.object.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UploadFileInfo {
    String fileName;
    long fileSize;
    String contentType;
    Date fileUploadDate;
}
