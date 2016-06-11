package mvc.filter;

import javax.servlet.*;
import java.io.IOException;

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
        System.out.println(servletRequest.getDispatcherType().toString());
        System.out.println(servletRequest.getAttribute("javax.servlet.forward.request_uri"));
        System.out.println(servletRequest.getAttribute("javax.servlet.forward.query_string"));
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
