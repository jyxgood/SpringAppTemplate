package com.thirdpart.shophelp.service.impl;

import com.thirdpart.shophelp.dao.OrderMapper;
import com.thirdpart.shophelp.meta.ShopOrder;
import com.thirdpart.shophelp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by yixinjiang on 2018/5/18
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public int insertOrder(ShopOrder order) {
        return 0;
    }

    @Override
    public ShopOrder selectByKaolaOrderId(String kaolaOrderId) {
        ShopOrder shopOrder = orderMapper.selectByPrimaryKey(1L);
        return shopOrder;
    }

    @Override
    public int setOrderPushDone(String kaolaOrderId) {
        return 0;
    }
}
