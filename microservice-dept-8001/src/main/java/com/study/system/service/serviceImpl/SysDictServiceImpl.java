package com.study.system.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.study.common.utils.DateUtil;
import com.study.common.utils.Result;
import com.study.system.entity.SysDict;
import com.study.system.mapper.SysDictMapper;
import com.study.system.service.SysDictService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import org.eclipse.jetty.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Orange_Code
 * @since 2022-07-09
 */
@Service
public class SysDictServiceImpl extends ServiceImpl<SysDictMapper, SysDict> implements SysDictService {

    private static final Logger logger = LoggerFactory.getLogger(SysDictServiceImpl.class);

    @Autowired
    private SysDictMapper sysDictMapper;

    /* 新增数据字典 */
    @Override
    public Result addDict(SysDict sysDict) {
        SysDict dict = new SysDict();
        dict.setId(000);
        dict.setTypeId(sysDict.getTypeId());
        dict.setTypeName(sysDict.getCodeName());
        dict.setCodeType(sysDict.getCodeType());
        dict.setCodeName(sysDict.getCodeName());
        dict.setSeqno(sysDict.getSeqno());
        dict.setIsDel(0);
        dict.setCreatTime(DateUtil.getCurrentDateTwo());
        dict.setCreatUser("");
        int flag = sysDictMapper.insert(dict);
        if (flag == 1){
            return Result.error("系统提示：新增数据字典失败!!!");
        }
        return null;
    }

    /* 删除数据字典 */
    @Override
    public Result delDict(SysDict sysDict) {
        UpdateWrapper<SysDict> delWrapper = new UpdateWrapper<>();
        delWrapper.eq("id", sysDict.getId())
                .set("is_del", 1);
        int update = sysDictMapper.update(null, delWrapper);
        if (update == 1){
            return Result.error("系统提示：数据字典删除失败!!!");
        }
        return null;
    }

    /* 查询数据字典 */
    @Override
    public List<SysDict> queryDict(SysDict sysDict) {
        QueryWrapper<SysDict> qwDict = new QueryWrapper<>();

        //根据类型名称查询
//        if (!StringUtil.isEmpty(sysDict.getTypeName())){
//            qwDict.eq("type_name", sysDict.getTypeName());
//        }
        //根据字段名称查询
//        if (!StringUtil.isEmpty(sysDict.getTypeName())){
//            qwDict.eq("code_name", sysDict.getCodeName());
//        }
        //只查询未删除的字段
        qwDict.eq("is_del", "1");
        //根据时间进行降序
        qwDict.orderByDesc("create_time");

        Page<Object> page = new Page<>();

        List<SysDict> sysDicts = sysDictMapper.selectList(qwDict);
        return null;
    }

    /* 修改数据字典 */
    @Override
    public Result updateDict(SysDict sysDict) {
        UpdateWrapper<SysDict> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id", sysDict.getId())
                .set("type_id", 1)
                .set("type_name",sysDict.getTypeName())
                .set("code_type",sysDict.getCodeType())
                .set("code_name",sysDict.getCodeName())
                .set("seqno",sysDict.getSeqno());
        int update = sysDictMapper.update(null, updateWrapper);
        if (update == 1){
            return Result.error("系统提示：数据字典更新失败!!!");
        }
        return null;
    }
}
