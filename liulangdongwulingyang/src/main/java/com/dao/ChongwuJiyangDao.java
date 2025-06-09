package com.dao;

import com.entity.ChongwuJiyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuJiyangView;

/**
 * 宠物寄养 Dao 接口
 *
 * @author 
 * @since 2021-04-26
 */
public interface ChongwuJiyangDao extends BaseMapper<ChongwuJiyangEntity> {

   List<ChongwuJiyangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
