package com.thirdpart.shophelp.meta;

import lombok.Data;

import javax.persistence.*;

/**
 * created by yixinjiang on 2018/5/18
 */
@Data
@Table(name="tb_shophelp_order")
public class ShopOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String kaolaOrderId;
    private Integer status;
    private String detail;
}
