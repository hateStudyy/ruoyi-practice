package com.ruoyi.system.domain.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 任务详细信息表(DiskMapBlock)实体类
 *
 * @author makejava
 * @since 2023-07-14 16:19:40
 */
@Data
public class DiskMapBlockVo implements Serializable {
    private static final long serialVersionUID = 376503756131473571L;
    /**
     * 唯一id
     */
    private Long id;
    /**
     * 编码
     */
    private String code;
    /**
     * 图纸
     */
    private String picture;
    /**
     * 名称
     */
    private String name;
    /**
     * 国际名称
     */
    private String nationName;

}

