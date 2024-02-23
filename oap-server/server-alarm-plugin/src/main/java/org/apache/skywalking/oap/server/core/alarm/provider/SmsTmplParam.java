package org.apache.skywalking.oap.server.core.alarm.provider;

import lombok.Data;

@Data
public class SmsTmplParam {

    private String tmplParamVarName;
    private String tmplParamVarVal;
}
