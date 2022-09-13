package gntp.lesson.service;

import gntp.lesson.dao.BookDAO;
import gntp.lesson.vo.BookVO;

public class BookService {

    public BookVO registBook(BookVO book) {         // ServletRequestContext req
        BookVO vo = null;
        BookDAO dao = new BookDAO();
        // FileItem을 통해서 BookVO 필드값 구한 후 객체생성

        // vo를 삽입요청하는 코드
        boolean flag = dao.insertBook(book);

        if(flag) {
            vo = book;
            // 업로드 실행
            
            
        }

        return vo;
    }

}
