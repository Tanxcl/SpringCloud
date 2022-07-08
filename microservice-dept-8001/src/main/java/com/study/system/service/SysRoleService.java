package com.study.system.service;

import com.study.common.utils.Result;
import com.study.system.entity.SysRole;
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
public interface SysRoleService extends IService<SysRole> {

    /* 新增角色 */
    Result addRole();
    /* 删除角色 */
    Result delRole();

    /* 查询角色 */
    Result queryRole();

    /* 修改角色 */
    Result updateRole();

}
