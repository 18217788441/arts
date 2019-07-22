package com.arts.service.intercept;

import com.gepholding.log.constant.MDCPropertyConsts;
import com.gepholding.tool.dict.CharacterDict;
import java.io.UnsupportedEncodingException;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * spring 拦截器重写， 用于打印请求路径和生成日志ID信息
 * <p>
 * 1.
 * </p>
 *
 * @author : system
 * @version : 1.0.0
 * @date : 2019-07-19 16:03:12
 */
@Slf4j
@Configuration
public class BaseInterceptor extends HandlerInterceptorAdapter {

    /**
    * This implementation always returns {@code true}.
    *
    * @param request  请求参数信息
    * @param response response对象
    * @param handler  对象信息
    */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        before(request, response);
        return super.preHandle(request, response, handler);
    }


    /**
    * 设置日志id，请求时间
    *
    * @param request
    * @param response
    * @throws UnsupportedEncodingException
    */
    private void before(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        //请求时间
        Long startTime = System.currentTimeMillis();
        MDC.put(com.gepholding.tool.dict.CommonDict.REQ_TIME_KEY, startTime.toString());
        //设置请求和响应编码
        request.setCharacterEncoding(CharacterDict.UTF_8);
        response.setCharacterEncoding(CharacterDict.UTF_8);
        //设置日志ID
        MDC.put(MDCPropertyConsts.TRACE_LOG_ID, UUID.randomUUID().toString());
        String requestPath = request.getRequestURI();
        log.info("用户请求后台，地址：{}", requestPath);
    }


    /**
    * 请求执行完成之后调用
    *
    * @param request  请求对象
    * @param response 返回对象
    * @param handler  处理对象
    * @param ex       异常
    */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        Long intervalTime = (System.currentTimeMillis() - Long.parseLong(MDC.get(com.gepholding.tool.dict.CommonDict.REQ_TIME_KEY)));
        if (ex != null) {
            log.error("请求系统异常，异常内容：", ex);
        }
        log.info("本次请求总耗时：{}", intervalTime);
        MDC.clear();
    }

}