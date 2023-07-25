package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.exception.file.FileException;
import com.ruoyi.common.utils.file.FileUploadUtils;
import com.ruoyi.system.domain.DiskMapBlock;
import com.ruoyi.system.domain.dto.DiskMapBlockAddRequest;
import com.ruoyi.system.domain.dto.DiskMapBlockRequest;
import com.ruoyi.system.domain.dto.DiskMapBlockUpdateRequest;
import com.ruoyi.system.domain.vo.DiskMapBlockUpdateVo;
import com.ruoyi.system.domain.vo.DiskMapBlockVo;
import com.ruoyi.system.service.DiskMapBlockService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 任务详细信息表(DiskMapBlock)表控制层
 *
 * @author makejava
 * @since 2023-07-14 16:17:09
 */
@Anonymous
@Api(value = "diskMapBlock", tags = {"任务详细信息表(DiskMapBlock)表控制层"})
@RestController
@RequestMapping("diskMapBlock")
public class DiskMapBlockController extends BaseController {
    /**
     * 服务对象
     */
    @Resource
    private DiskMapBlockService diskMapBlockService;

    /**
     * 文件上传
     * @param multipartFile
     * @param httpRequest
     * @return
     */
    @ApiOperation(value = "文件上传")
    @PostMapping("/upload")
    public AjaxResult upload(MultipartFile multipartFile, HttpRequest httpRequest) {
        try {
            FileUploadUtils.upload(multipartFile);
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return success();
    }

    /**
     * 普通查询
     *
     * @param diskMapBlock 筛选条件
     * @return 查询结果
     */
    @ApiOperation(value = "普通查询" +
            "页)", notes = "普通查询", httpMethod = "Get")
    @GetMapping("/listDiskMapBlock")
    public AjaxResult list(DiskMapBlockRequest diskMapBlock) {
        List<DiskMapBlockVo> diskMapBlockVos = diskMapBlockService.selectDiskMapBlock(diskMapBlock);
        return AjaxResult.success(diskMapBlockVos);
    }
    /**
     * 分页查询
     *
     * @param diskMapBlock 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @ApiOperation(value = "分页查询", notes = "分页查询", httpMethod = "Post")
    @PostMapping("/page")
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
    @PostMapping("/add")
    public AjaxResult add(@RequestBody DiskMapBlockAddRequest diskMapBlock) {
        int insert = diskMapBlockService.insert(diskMapBlock);
        return toAjax(insert);
    }

    /**
     * 编辑数据
     *
     * @param diskMapBlock 实体
     * @return 编辑结果
     */
    @ApiOperation(value = "编辑数据", notes = "编辑数据", httpMethod = "PUT")
    @PutMapping
    public AjaxResult edit(DiskMapBlockUpdateRequest diskMapBlock) {
        DiskMapBlockUpdateVo update = diskMapBlockService.update(diskMapBlock);
        return AjaxResult.success(update);
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @ApiOperation(value = "删除数据", notes = "删除数据", httpMethod = "DELETE")
    @DeleteMapping
    public AjaxResult deleteById(Long id) {
        boolean b = diskMapBlockService.deleteById(id);
        return success(b);
    }

}

