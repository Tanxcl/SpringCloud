package com.study.system.service;

import com.study.common.utils.Result;
import com.study.system.entity.SysDict;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Orange_Code
 * @since 2022-07-09
 */
public interface SysDictService extends IService<SysDict> {

    /* 新增数据字典 */
    Result addDict(SysDict sysDict);

    /* 删除数据字典 */
    Result delDict(SysDict sysDict);

    /* 查询数据字典 */
    List<SysDict> queryDict(SysDict sysDict);

    /* 修改数据字典 */
    Result updateDict(SysDict sysDict);

}
