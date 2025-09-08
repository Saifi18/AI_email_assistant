package com.email.writer.pojo;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
