package com.doganilbars.aop.stereotype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@BenimStereoType
@Data @AllArgsConstructor @NoArgsConstructor
public class StereoTypeBean {
    private int id;
    private String name="Merhabalar";
    private String trade;
}
