package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.DiskMapBlock;
import com.ruoyi.system.mapper.DiskMapBlockMapper;
import com.ruoyi.system.service.DiskMapBlockService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 任务详细信息表(DiskMapBlock)表服务实现类
 *
 * @author makejava
 * @since 2023-07-14 16:19:43
 */
@Service
public class DiskMapBlockServiceImpl implements DiskMapBlockService {
    @Resource
    private DiskMapBlockMapper diskMapBlockMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DiskMapBlock queryById(Long id) {
        return this.diskMapBlockMapper.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param diskMapBlock 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<DiskMapBlock> queryByPage(DiskMapBlock diskMapBlock, PageRequest pageRequest) {
        long total = this.diskMapBlockMapper.count(diskMapBlock);
        return new PageImpl<>(this.diskMapBlockMapper.queryAllByLimit(diskMapBlock, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param diskMapBlock 实例对象
     * @return 实例对象
     */
    @Override
    public DiskMapBlock insert(DiskMapBlock diskMapBlock) {
        this.diskMapBlockMapper.insert(diskMapBlock);
        return diskMapBlock;
    }

    /**
     * 修改数据
     *
     * @param diskMapBlock 实例对象
     * @return 实例对象
     */
    @Override
    public DiskMapBlock update(DiskMapBlock diskMapBlock) {
        this.diskMapBlockMapper.update(diskMapBlock);
        return this.queryById(diskMapBlock.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.diskMapBlockMapper.deleteById(id) > 0;
    }
}
