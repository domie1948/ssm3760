package com.dao;

import com.entity.ChongwuHuifangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuHuifangView;

/**
 * 宠物回访 Dao 接口
 *
 * @author 
 * @since 2021-04-26
 */
public interface ChongwuHuifangDao extends BaseMapper<ChongwuHuifangEntity> {

   List<ChongwuHuifangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
