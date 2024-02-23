package org.apache.skywalking.oap.server.core.alarm.provider;

import lombok.Data;

import java.util.List;

@Data
public class SmsRequestBo {
    private String name;
    private String smsTmplId;
    private List<String> sendTargetAdress;
    private List<SmsTmplParam> tmplParmList;
}
