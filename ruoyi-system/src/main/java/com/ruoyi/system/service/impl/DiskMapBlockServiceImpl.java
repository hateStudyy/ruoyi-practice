package com.ruoyi.system.service.impl;

import com.ruoyi.common.utils.bean.BeanUtils;
import com.ruoyi.system.domain.DiskMapBlock;
import com.ruoyi.system.domain.dto.DiskMapBlockAddRequest;
import com.ruoyi.system.domain.dto.DiskMapBlockRequest;
import com.ruoyi.system.domain.dto.DiskMapBlockUpdateRequest;
import com.ruoyi.system.domain.vo.DiskMapBlockUpdateVo;
import com.ruoyi.system.domain.vo.DiskMapBlockVo;
import com.ruoyi.system.mapper.DiskMapBlockMapper;
import com.ruoyi.system.service.DiskMapBlockService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

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
    public DiskMapBlockUpdateVo queryById(Long id) {
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
    public Page<DiskMapBlockVo> queryByPage(DiskMapBlockRequest diskMapBlock, PageRequest pageRequest) {
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
    public int insert(DiskMapBlockAddRequest diskMapBlockAddRequest) {
        DiskMapBlock diskMapBlock = new DiskMapBlock();
        BeanUtils.copyBeanProp(diskMapBlock, diskMapBlockAddRequest);
        int insert = this.diskMapBlockMapper.insert(diskMapBlock);
        return insert;
    }

    /**
     * 修改数据
     *
     * @param diskMapBlock 实例对象
     * @return 实例对象
     */
    @Override
    public DiskMapBlockUpdateVo update(DiskMapBlockUpdateRequest diskMapBlock) {
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

    @Override
    public List<DiskMapBlockVo> selectDiskMapBlock(DiskMapBlockRequest diskMapBlockRequest) {
        return diskMapBlockMapper.selectDiskMapBlock(diskMapBlockRequest);
    }
}
