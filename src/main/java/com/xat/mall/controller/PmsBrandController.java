package com.xat.mall.controller;

import com.xat.mall.common.api.CommonResult;
import com.xat.mall.mbg.model.PmsBrand;
import com.xat.mall.service.PmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 淡漠
 */
@Api(tags = "PmsBrandController",value = "商品品牌管理")
@Controller
@RequestMapping("/brand")
public class PmsBrandController {

    @Autowired
    private PmsBrandService pmsBrandService;

    private static final Logger logger = LoggerFactory.getLogger(PmsBrandController.class);

    @ApiOperation("获取所有品牌")
    @RequestMapping(value = "listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsBrand>> getBrandList() {
        return CommonResult.success(pmsBrandService.listAllBrands());
    }

    @ApiOperation("创建品牌")
    @RequestMapping(value = "/createBrand",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> createBrand(@RequestBody PmsBrand pmsBrand){
        CommonResult commonResult;
        int count = pmsBrandService.createBrand(pmsBrand);
        if (count == 1){
            commonResult = CommonResult.success(count);
            logger.debug("createBrand success:{}",pmsBrand);
        }else {
            commonResult = CommonResult.failed("操作失败");
            logger.debug("createBrand failed:{}",pmsBrand);
        }
        return commonResult;
    }

}
