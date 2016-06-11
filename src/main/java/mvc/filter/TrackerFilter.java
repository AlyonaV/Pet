package mvc.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by Alona on 11.06.2016.
 */
public class TrackerFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FILLLTER");
        Enumeration<String> params = servletRequest.getParameterNames();
        while(params.hasMoreElements())
            System.out.println(params.nextElement());
        System.out.println(servletRequest.getServletContext().getContextPath());
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
