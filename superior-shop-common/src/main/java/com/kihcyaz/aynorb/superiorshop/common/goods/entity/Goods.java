package com.kihcyaz.aynorb.superiorshop.common.goods.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@TableName("tb_goods")
@ApiModel(value = "产品对象", description = "产品实体类")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId
    @ApiModelProperty(value = "id", name = "产品唯一标识", required = true, dataType = "Long")
    private Long id;

    /**
     * 商家ID
     */
    @TableField("seller_id")
    @ApiModelProperty(value = "sellerId", name = "商家唯一标识", dataType = "String")
    private String sellerId;

    /**
     * SPU名
     */
    @TableField("goods_name")
    @ApiModelProperty(value = "goodsName", name = "产品名称", dataType = "String")
    private String goodsName;

    /**
     * 默认SKU
     */
    @TableField("default_item_id")
    @ApiModelProperty(value = "defaultItemId", name = "默认SKU", dataType = "Long")
    private Long defaultItemId;

    /**
     * 状态
     */
    @TableField("audit_status")
    @ApiModelProperty(value = "auditStatus", name = "状态", dataType = "String")
    private String auditStatus;

    /**
     * 是否上架
     */
    @TableField("is_marketable")
    @ApiModelProperty(value = "isMarketable", name = "是否上架", dataType = "String")
    private String isMarketable;

    /**
     * 品牌
     */
    @TableField("brand_id")
    @ApiModelProperty(value = "brandId", name = "品牌唯一标识", dataType = "Long")
    private Long brandId;

    /**
     * 副标题
     */
    @TableField("caption")
    @ApiModelProperty(value = "caption", name = "产品副标题", dataType = "String")
    private String caption;

    /**
     * 一级类目
     */
    @TableField("category1_id")
    @ApiModelProperty(value = "category1Id", name = "一级类目唯一标识", dataType = "Long")
    private Long category1Id;

    /**
     * 二级类目
     */
    @TableField("category2_id")
    @ApiModelProperty(value = "category2Id", name = "二级类目唯一标识", dataType = "Long")
    private Long category2Id;

    /**
     * 三级类目
     */
    @TableField("category3_id")
    @ApiModelProperty(value = "category3Id", name = "三级类目唯一标识", dataType = "Long")
    private Long category3Id;

    /**
     * 小图
     */
    @TableField("small_pic")
    @ApiModelProperty(value = "smallPic", name = "小图", dataType = "String")
    private String smallPic;

    /**
     * 商城价
     */
    @TableField("price")
    @ApiModelProperty(value = "price", name = "商城价", dataType = "Double")
    private Double price;

    /**
     * 分类模板ID
     */
    @TableField("type_template_id")
    @ApiModelProperty(value = "typeTemplateId", name = "分类模板ID", dataType = "Long")
    private Long typeTemplateId;

    /**
     * 是否启用规格
     */
    @TableField("is_enable_spec")
    @ApiModelProperty(value = "isEnableSpec", name = "是否启用规格", dataType = "String")
    private String isEnableSpec;

    /**
     * 是否删除
     */
    @TableField("is_delete")
    @ApiModelProperty(value = "isDelete", name = "是否删除", dataType = "String")
    private String isDelete;
}
