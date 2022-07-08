package com.study.system.service;

import com.study.common.utils.Result;
import com.study.system.entity.SysMenu;
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
public interface SysMenuService extends IService<SysMenu> {

    /* 新增菜单 */
    Result addMenu();

    /* 删除菜单 */
    Result delMenu();

    /* 查询菜单 */
    Result queryMenu();

    /* 修改菜单 */
    Result updateMenu();

}
