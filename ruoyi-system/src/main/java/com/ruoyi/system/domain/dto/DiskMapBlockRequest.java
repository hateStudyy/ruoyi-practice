package com.ruoyi.system.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ckl
 * @since 2023/7/18 10:44
 */
@Data
public class DiskMapBlockRequest implements Serializable {
    private static final long serialVersionUID = 376503756131473571L;
    /**
     * 编码
     */
    private String code;

    /**
     * 名称
     */
    private String name;
}
