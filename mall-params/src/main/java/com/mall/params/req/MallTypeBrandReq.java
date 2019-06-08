package com.mall.params.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MallTypeBrandReq {
    private Long id;

    private Long typeId;

    private Long brandId;
}