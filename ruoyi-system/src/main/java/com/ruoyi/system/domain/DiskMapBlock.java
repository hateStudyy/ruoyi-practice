package com.ruoyi.system.domain;

import java.util.Date;
import java.io.Serializable;

/**
 * 任务详细信息表(DiskMapBlock)实体类
 *
 * @author makejava
 * @since 2023-07-14 16:19:40
 */
public class DiskMapBlock implements Serializable {
    private static final long serialVersionUID = 376503756131473571L;
    /**
     * 编码
     */
    private Long id;
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
    /**
     * 描述
     */
    private String description;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 是否删除
     */
    private Integer isDelete;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

}

