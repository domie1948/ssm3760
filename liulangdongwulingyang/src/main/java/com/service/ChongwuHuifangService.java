package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwuHuifangEntity;
import java.util.Map;

/**
 * 宠物回访 服务类
 * @author 
 * @since 2021-04-26
 */
public interface ChongwuHuifangService extends IService<ChongwuHuifangEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}