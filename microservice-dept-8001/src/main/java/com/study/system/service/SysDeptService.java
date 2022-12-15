package com.study.system.service;

import com.study.common.utils.Result;
import com.study.system.entity.SysDept;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Orange_Code
 * @since 2022-07-09
 */
public interface SysDeptService {

    /* 新增部门 */
    Result addDept();

    /* 删除部门 */
    Result delDept();

    /* 查询部门 */
    Result queryDept();

    /* 修改部门 */
    Result updateDept();

}
