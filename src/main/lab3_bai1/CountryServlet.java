package lab3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/country")
public class CountryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // Tạo danh sách dữ liệu quốc gia (sử dụng Arrays.asList để không bị lỗi trên Java 8)
        List<Country> list = Arrays.asList(
                new Country("VN", "Việt Nam"),
                new Country("US", "United States"),
                new Country("CN", "China")
        );

        // Truyền List sang JSP theo đúng yêu cầu đề bài
        req.setAttribute("countries", list);

        // Chuyển tiếp (Forward) dữ liệu tới file page.jsp nằm trong thư mục webapp/lab3
        req.getRequestDispatcher("/lab3/page.jsp").forward(req, resp);
    }
}