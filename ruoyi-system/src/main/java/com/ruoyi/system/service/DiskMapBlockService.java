package com.ruoyi.system.service;


import com.ruoyi.system.domain.DiskMapBlock;
import com.ruoyi.system.domain.dto.DiskMapBlockAddRequest;
import com.ruoyi.system.domain.dto.DiskMapBlockRequest;
import com.ruoyi.system.domain.dto.DiskMapBlockUpdateRequest;
import com.ruoyi.system.domain.vo.DiskMapBlockUpdateVo;
import com.ruoyi.system.domain.vo.DiskMapBlockVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * 任务详细信息表(DiskMapBlock)表服务接口
 *
 * @author makejava
 * @since 2023-07-14 16:19:42
 */
public interface DiskMapBlockService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DiskMapBlockUpdateVo queryById(Long id);

    /**
     * 分页查询
     *
     * @param diskMapBlock 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<DiskMapBlockVo> queryByPage(DiskMapBlockRequest diskMapBlock, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param diskMapBlock 实例对象
     * @return 实例对象
     */
    int insert(DiskMapBlockAddRequest diskMapBlock);

    /**
     * 修改数据
     *
     * @param diskMapBlock 实例对象
     * @return 实例对象
     */
    DiskMapBlockUpdateVo update(DiskMapBlockUpdateRequest diskMapBlock);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     * 查询所有数据
     * @param diskMapBlockRequest dto
     * @return  DiskMapBlockVo
     */
    List<DiskMapBlockVo> selectDiskMapBlock(DiskMapBlockRequest diskMapBlockRequest);
}
