//package com.tao.yeblog.interceptor;
//
//import com.tao.yeblog.common.JwtUtils;
//import io.jsonwebtoken.Claims;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.servlet.HandlerInterceptor;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class LoginInterceptor implements HandlerInterceptor {
//
//    @Bean
//    JwtUtils getJwtUtils(){
//        return new JwtUtils();
//    }
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String header = request.getHeader("Authorization");
//
//        if(handler == null || !header.startsWith("ym:")){
//            response.setStatus(401);
//            response.sendError(401, "用户未登录,请重新登录");
//            return false;
//        }
//
//        String token = header.substring(3);
//
//        Claims claims = getJwtUtils().parseToken(token);
//
//        System.out.println(claims.getSubject());
//
//        return true;
//    }
//}
