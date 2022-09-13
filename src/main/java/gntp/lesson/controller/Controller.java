package gntp.lesson.controller;

import gntp.lesson.dao.BookDAO;
import gntp.lesson.service.BookService;
import gntp.lesson.utils.ConnectionManagerV2;
import gntp.lesson.vo.BookVO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

public class Controller extends HttpServlet {

    @Override
    public void init() throws ServletException {
        // TODO Auto-generated method stub
        System.out.println("init");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        this.doPost(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { //

        String url = req.getRequestURI();
        String[] temp = url.split("/");
        String command = temp[temp.length - 1];
        System.out.println(command);

        if(command.equals("viewInput.do")){
            url = "./Summary/Input.jsp";
        }else if(command.equals("output.do")){

            //ServletRequestContext src = new ServletRequestContext(req);

            // 클라이언트 데이터 수집
            String title = req.getParameter("bookTitle");
            String author = req.getParameter("bookAuthor");
            String price = req.getParameter("bookPrice");
            String Image = req.getParameter("bookImage");

            // VO 연결
            BookVO vo = new BookVO(0,title,author,Integer.valueOf(price),Image,null);
    
            // 로직 처리
            BookService bs = new BookService();
            BookVO book = bs.registBook(vo);

            if(book!=null){
                // request 객체에 저장
                req.setAttribute("book",book);
            }

            url = "./Summary/Output.jsp";
        }

        RequestDispatcher rd = req.getRequestDispatcher(url);
        rd.forward(req, resp);
    }
    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        System.out.println("destroy");
    }

}
