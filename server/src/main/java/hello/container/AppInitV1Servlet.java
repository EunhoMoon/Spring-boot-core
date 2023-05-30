package hello.container;

import hello.servlet.HelloServlet;
import jakarta.servlet.ServletContext;

public class AppInitV1Servlet implements AppInit {
    @Override
    public void onStartup(ServletContext servletContext) {
        System.out.println("AppInitV1Servlet.onStartup");

        // 순수 서블릿 코드
        servletContext
                .addServlet("helloServlet", new HelloServlet())
                .addMapping("/hello-servlet");
    }
}
