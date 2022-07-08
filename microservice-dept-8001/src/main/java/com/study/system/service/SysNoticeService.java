package com.study.system.service;

import com.study.common.utils.Result;
import com.study.system.entity.SysNotice;
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
public interface SysNoticeService extends IService<SysNotice> {

    /* 新增公告 */
    Result addNotice();

    /* 删除公告 */
    Result delNotice();

    /* 查询公告 */
    Result queryNotice();

    /* 修改公告 */
    Result updateNotice();

}
