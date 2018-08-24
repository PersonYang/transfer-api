package com.young.transfer.service;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.young.user.baseinfo.request.UserInfoRequest;
import com.young.user.baseinfo.response.UserInfoResponse;
import com.young.user.baseinfo.service.UserAccountService;
import org.springframework.stereotype.Component;

/**
 * Created by young on 2018/8/23.
 */

@Component
public class TradeApplication {

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}")
    UserAccountService userAccountService;

    public String doTrade() {
        UserInfoRequest userInfoRequest = new UserInfoRequest();
        userInfoRequest.setUserId(10L);
        UserInfoResponse userInfoResponse = userAccountService.getUserInfo(userInfoRequest);
        return JSON.toJSONString(userInfoResponse);
    }

}
