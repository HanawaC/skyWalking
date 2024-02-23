package org.apache.skywalking.oap.server.core.alarm.provider;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import org.apache.skywalking.oap.server.core.alarm.AlarmMessage;

import java.util.List;

/**
 * @author lq
 * 适配模式做参数转换
 */
public class RequestBoAdapter {

    private final Gson gson = new Gson();

    /**
     * 转换sms参数类型
     * @param body
     * @param alarmMessage
     * @return
     */
    public SmsRequestBo parseSmsBody(String body,AlarmMessage alarmMessage) {
        SmsRequestBo smsRequestBo = new SmsRequestBo();
        SmsTmplParam smsTmplParam = new SmsTmplParam();

        smsRequestBo = gson.fromJson(body,SmsRequestBo.class);

        smsTmplParam.setTmplParamVarName("Sywalking通知");
        smsTmplParam.setTmplParamVarVal(alarmMessage.getAlarmMessage());
        List<SmsTmplParam> smsTmplParamList = Lists.newArrayList();
        smsTmplParamList.add(smsTmplParam);

        List<String> targetAddList = Lists.newArrayList();
        targetAddList.add("13888888888");

        smsRequestBo.setSmsTmplId("testSkywalkingId");
        smsRequestBo.setSendTargetAdress(targetAddList);
        smsRequestBo.setTmplParmList(smsTmplParamList);
        return smsRequestBo;
    }
}
