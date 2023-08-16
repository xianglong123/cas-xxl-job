package com.cas.jobhandler;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: xianglong
 * @create: 2023-08-16 22:57
 **/
@Component
public class HelloWorldHandler {

    @XxlJob("helloWorldHandler")
    public void helloWorldHandler() throws Exception {
        XxlJobHelper.log("XXL-JOB, Hello World. ====================== 1111111111111");
    }

    @XxlJob("valWorldHandler")
    public void valWorldHandler() throws Exception {
        String jobParam = XxlJobHelper.getJobParam();
        XxlJobHelper.log("XXL-JOB, Hello World. ====================== 1111111111111" + jobParam);
    }
}
