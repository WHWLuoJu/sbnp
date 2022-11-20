package constant;

/**
 * @create 王宏伟
 * @time 2022-10-17 21:05
 */

import java.util.Arrays;
import java.util.List;

/**
 *
 * 这个类是所有关于授权相关的常量
 */

public interface  AuthConstant {
    /**
     * 网关放行的路径
     */
    List<String> ALLOW_URLS = Arrays.asList("/auth-server/doLogin");


    /**
     * token在header的key
     */
    String AUTHORIZATION = "Authorization";

    /**
     * 持票人 前端发起的请求的token前缀
     */
    String BEARER = "bearer ";

    /**
     * token存储的redis前缀
     */
    String TOKEN_PREFIX = "login_token:";

    /**
     * 登录的路径
     */
    String LOGIN_URL = "/doLogin";

    /**
     * 登出的路径
     */
    String LOGOUT_URL = "/doLogout";

    /**
     * 登录平台类型
     */
    String LOGIN_TYPE = "loginType";

    /**
     * 后台管理员的
     */
    String SYS_USER = "sysUser";

    /**
     * 前台会员的
     */
    String MEMBER = "member";

    /**
     * token过期时间
     */
    Long TOKEN_EXPIRE_TIME = 7200L;

    /**
     * 过期的阈值
     */
    Long PRE_EXPIRE_TIME = 300L;

}
