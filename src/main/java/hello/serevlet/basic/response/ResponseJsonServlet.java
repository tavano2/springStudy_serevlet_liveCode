package hello.serevlet.basic.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import hello.serevlet.basic.HelloData;
import hello.serevlet.basic.HelloServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * http://localhost:8080/response-json
 *
 */
@WebServlet(name = "responseJsonServlet", urlPatterns = "/response-json")
public class ResponseJsonServlet extends HelloServlet {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Content-Type : application/json
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");

        HelloData helloData = new HelloData();
        helloData.setUsername("send Leem");
        helloData.setAge(30);

        // json 형태로 변환
        // {"username":"send Leem", "age":20}
        String result = objectMapper.writeValueAsString(helloData);
        response.getWriter().write(result);


    }
}
