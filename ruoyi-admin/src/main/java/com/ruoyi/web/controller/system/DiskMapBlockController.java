package com.ruoyi.web.controller.system;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.domain.DiskMapBlock;
import com.ruoyi.system.domain.dto.DiskMapBlockRequest;
import com.ruoyi.system.domain.vo.DiskMapBlockVo;
import com.ruoyi.system.service.DiskMapBlockService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 任务详细信息表(DiskMapBlock)表控制层
 *
 * @author makejava
 * @since 2023-07-14 16:17:09
 */
@Api(value = "diskMapBlock", tags = {"任务详细信息表(DiskMapBlock)表控制层"})
@RestController
@RequestMapping("diskMapBlock")
public class DiskMapBlockController {
    /**
     * 服务对象
     */
    @Resource
    private DiskMapBlockService diskMapBlockService;

    /**
     * 分页查询
     *
     * @param diskMapBlock 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @ApiOperation(value = "分页查询", notes = "分页查询", httpMethod = "Post")
    @PostMapping
    public ResponseEntity<Page<DiskMapBlockVo>> queryByPage(DiskMapBlockRequest diskMapBlock, PageRequest pageRequest) {
        return ResponseEntity.ok(this.diskMapBlockService.queryByPage(diskMapBlock, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", dataType = "long", name = "id", value = "主键", required = true)
    })
    @ApiOperation(value = "通过主键查询单条数据", notes = "通过主键查询单条数据", httpMethod = "GET")
    @GetMapping("{id}")
    public AjaxResult queryById(@PathVariable("id") Long id) {
        return AjaxResult.success(diskMapBlockService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param diskMapBlock 实体
     * @return 新增结果
     */
    @ApiOperation(value = "新增数据", notes = "新增数据", httpMethod = "POST")
    @PostMapping
    public ResponseEntity<DiskMapBlock> add(DiskMapBlock diskMapBlock) {
        return ResponseEntity.ok(this.diskMapBlockService.insert(diskMapBlock));
    }

    /**
     * 编辑数据
     *
     * @param diskMapBlock 实体
     * @return 编辑结果
     */
    @ApiOperation(value = "编辑数据", notes = "编辑数据", httpMethod = "PUT")
    @PutMapping
    public ResponseEntity<DiskMapBlock> edit(DiskMapBlock diskMapBlock) {
        return ResponseEntity.ok(this.diskMapBlockService.update(diskMapBlock));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @ApiOperation(value = "删除数据", notes = "删除数据", httpMethod = "DELETE")
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.diskMapBlockService.deleteById(id));
    }

}

