package ex4;

public class SecurityFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) {
        System.out.println("시큐리티 필터 전처리");
        filterChain.doFilter(request, response);
        System.out.println("시큐리티 필터 후처리");
    }
}
