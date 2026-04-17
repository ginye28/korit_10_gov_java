package ex4;

public class EncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) {
        System.out.println("인코딩 필터 전처리");
        filterChain.doFilter(request, response);
        System.out.println("인코딩 필터 후처리");
    }
}
