package com.honglu.headline.rule.config.facade.business;

import com.honglu.headline.rule.config.facade.domain.AvlidRead;
import com.honglu.headline.rule.config.facade.domain.RedPackage;

import java.util.HashMap;
import java.util.List;
/**
 *  查询红包规则
 * @author  yangyang
 *
 * **/
public interface RedPacketDubboBusiness {

    public List<RedPackage> queryAllRedPacket(HashMap<String, Object> paramValue);



}
