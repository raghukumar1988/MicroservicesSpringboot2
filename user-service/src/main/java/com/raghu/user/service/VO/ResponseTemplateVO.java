package com.raghu.user.service.VO;

import com.raghu.user.service.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// VO - value object is a wrapper object  to get the combined response of both APIs
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private User user;
    private Department department;
}
