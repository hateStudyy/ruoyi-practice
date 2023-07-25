package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.DiskMapBlock;
import com.ruoyi.system.domain.dto.DiskMapBlockAddRequest;
import com.ruoyi.system.domain.dto.DiskMapBlockRequest;
import com.ruoyi.system.domain.dto.DiskMapBlockUpdateRequest;
import com.ruoyi.system.domain.vo.DiskMapBlockUpdateVo;
import com.ruoyi.system.domain.vo.DiskMapBlockVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 任务详细信息表(DiskMapBlock)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-14 16:19:39
 */
public interface DiskMapBlockMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DiskMapBlockUpdateVo queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param diskMapBlock 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<DiskMapBlockVo> queryAllByLimit(DiskMapBlockRequest diskMapBlock, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param diskMapBlock 查询条件
     * @return 总行数
     */
    long count(DiskMapBlockRequest diskMapBlock);

    /**
     * 新增数据
     *
     * @param diskMapBlock 实例对象
     * @return 影响行数
     */
    int insert(DiskMapBlock diskMapBlock);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<DiskMapBlock> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<DiskMapBlock> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<DiskMapBlock> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<DiskMapBlock> entities);

    /**
     * 修改数据
     *
     * @param diskMapBlock 实例对象
     * @return 影响行数
     */
    int update(DiskMapBlockUpdateRequest diskMapBlock);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 查询所有数据
     * @param diskMapBlockRequest
     * @return
     */
    List<DiskMapBlockVo> selectDiskMapBlock(DiskMapBlockRequest diskMapBlockRequest);
}

