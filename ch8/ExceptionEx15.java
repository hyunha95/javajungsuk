package ch8;

import java.io.File;

public class ExceptionEx15 {
    public static void main(String[] args) {
        // command line에서 입력받은 이름으로 갖는 파일을 생성한다.
        File f = createFile("");
        System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
    }

    private static File createFile(String fileName) {
        try {
            if(fileName == null || fileName.equals(""))
                throw new Exception("파일이름이 유효하지 않습니다.");
        } catch(Exception e) {
            // fileName이 부적절한 경우, 파일 이름을 '제목없음.txt로 한다.
            fileName = "제목없음.txt";
        } finally {
            File f = new File(fileName); // File클래스의 객체를 만든다ㅣ.
            createNewFile(f);
            return f;
        }
    }

    private static void createNewFile(File f) {
        try {
            f.createNewFile();  // 파일을 생성한다.
        }  catch (Exception e ) { }
    }
}
