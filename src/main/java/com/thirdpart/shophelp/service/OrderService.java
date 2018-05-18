package com.thirdpart.shophelp.service;

import com.thirdpart.shophelp.meta.ShopOrder;
import org.apache.ibatis.annotations.Param;

/**
 * created by yixinjiang on 2018/5/18
 */
public interface OrderService {

    /**
     *insert a new order to DB
     * @param order
     * @return
     */
    int insertOrder(@Param("order")ShopOrder order);

    /**
     *select an order data by kaolaOrderId
     * @param kaolaOrderId
     * @return
     */
    ShopOrder selectByKaolaOrderId(String kaolaOrderId);

    /**
     *
     * @param kaolaOrderId
     * @return
     */
    int setOrderPushDone(String kaolaOrderId);
}
