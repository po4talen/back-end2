package com.brainacad;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Users {
    private String name;
    private String job;
}
