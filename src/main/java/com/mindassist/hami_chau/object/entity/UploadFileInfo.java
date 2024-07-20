package com.mindassist.hami_chau.object.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "UploadedFileInfo")
public class UploadFileInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long fileId;

    @Column(name = "FileName", nullable = false)
    String fileName;

    @Column(name = "FileSize")
    long fileSize;

    @Column(name = "ContentType")
    String contentType;

    @Column(name = "FileUploadDate")
    Date fileUploadDate;
}
