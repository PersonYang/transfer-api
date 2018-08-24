package com.young.transfer.controller;

import com.young.transfer.service.TradeApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by young on 2018/8/23.
 */
@RestController
public class IndexController {

    @Autowired
    TradeApplication tradeApplication;

    @GetMapping("ok")
    public String index(){
        return tradeApplication.doTrade();
    }
}
