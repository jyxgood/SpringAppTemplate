package com.thirdpart.shophelp.web;

import com.thirdpart.shophelp.meta.ShopOrder;
import com.thirdpart.shophelp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by yixinjiang on 2018/5/18
 */
@RestController
public class TestController {
    @Autowired
    private OrderService service;

    @RequestMapping("/test")
    public String test() {
        ShopOrder shopOrder = service.selectByKaolaOrderId("");
      return   shopOrder.getKaolaOrderId();
//        return "test API!!";
    }
}
