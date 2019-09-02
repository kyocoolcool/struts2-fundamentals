import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName CharacterEncodingFilter
 * @Description TODO
 * @Author chris
 * @Date 2019-02-18 16:48
 * @Version 1.0
 **/

public class CharacterEncodingFilter implements Filter {


    //默认编码类型
    private static String userEncoding = "utf-8";

    /**
     * (non-Javadoc) 过滤器初始化，初始化配置文件中的配置信息
     *
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
     */
    public void init(FilterConfig config) throws ServletException {
        try {
            // 获取在web.xml 设置的参数值：用户定义的编码
            String encoding = config.getInitParameter("encoding");
            System.out.println("encoding:   " + encoding);
            if (!"".equals(encoding) && encoding != null) {
                userEncoding = encoding;
            }
        } catch (RuntimeException e) {
        }
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException {
        try {
            // 转型
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            HttpServletResponse httpResponse = (HttpServletResponse) response;


            //设置编码为用户定义的编码
            if (null != userEncoding) {
                httpRequest.setCharacterEncoding(userEncoding);
                httpResponse.setCharacterEncoding(userEncoding);
            }
            /**此段代碼會將所有是jsp的請求都導到錯誤頁面*/
//            httpResponse.sendRedirect("/Struts2Demo/errorRequest.do");
            chain.doFilter(httpRequest, httpResponse);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void destroy() {
        userEncoding = null;
    }
}