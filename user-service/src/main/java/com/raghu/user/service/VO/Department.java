package com.raghu.user.service.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* Here duplicating the Department POJO is fine because this is common in microservices
to make it independently working */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
