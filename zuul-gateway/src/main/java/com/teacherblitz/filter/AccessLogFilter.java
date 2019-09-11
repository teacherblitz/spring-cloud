package com.teacherblitz.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author teacherblitz
 * @version v1.0
 * @description 请求之后的filter
 * @date 2019/9/8 15:00
 */
@Slf4j
@Component
public class AccessLogFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        // 在最后一个请求响应之前处理
        return FilterConstants.SEND_RESPONSE_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        Long startTime = (Long) ctx.get("startTime");

        HttpServletRequest request = ctx.getRequest();
        StringBuffer url = request.getRequestURL();

        long duration = System.currentTimeMillis() - startTime;
        log.info("URL：{},Duraction：{}ms", url, duration/100);

        return null;
    }
}
