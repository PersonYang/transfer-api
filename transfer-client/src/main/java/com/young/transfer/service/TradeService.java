package com.young.transfer.service;

import com.young.transfer.request.TradeRequest;
import com.young.transfer.response.TradeReponse;

/**
 *
 * Created by young on 2018/8/23.
 */
public interface TradeService {

    /**
     *
     * @param tradeRequest
     * @return
     */
    TradeReponse doTrade(TradeRequest tradeRequest);
}
