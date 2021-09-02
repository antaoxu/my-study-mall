package com.xat.mall.service;

import com.xat.mall.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author 淡漠
 */
public interface PmsBrandService {
    /**
     * 获取品牌列表
     * @return
     */
    List<PmsBrand> listAllBrands();

    /**
     * 新增品牌
     * @param pmsBrand
     * @return
     */
    int createBrand(PmsBrand pmsBrand);

    /**
     * 根据id修改品牌
     * @param id
     * @param pmsBrand
     * @return
     */
    int updateBrand(long id,PmsBrand pmsBrand);

    /**
     * 通过id删除品牌
     * @param id
     * @return
     */
    int deleteBrand(long id);

    /**
     * 分页查询品牌
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<PmsBrand> getPmsBand(int pageNum,int pageSize);

    /**
     * 通过id获取单个品牌
     * @param id
     * @return
     */
    PmsBrand getPmsBrand(long id);
}
