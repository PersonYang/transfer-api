package com.young.transfer.application;
import com.young.transfer.request.TradeRequest;
import com.young.transfer.response.TradeReponse;
import com.young.transfer.service.TradeService;
import org.springframework.stereotype.Service;

/**
 * Created by young on 2018/8/23.
 */
@Service
public class TradeServiceImpl implements TradeService {


    @Override
    public TradeReponse doTrade(TradeRequest tradeRequest) {
        TradeReponse tradeReponse = new TradeReponse();
        return tradeReponse;
    }

}
