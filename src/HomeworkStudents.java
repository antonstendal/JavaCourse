import java.util.List;

public class HomeworkStudents {
    public static void main(String[] args) {
        Students firstStudent = new Students();
        Students secondStudent = new Students();
        Students thirdStudent = new Students();

        firstStudent.name = "Mark";
        firstStudent.secondName = "Sheiko";
        firstStudent.nickName = "starWarsJedi";
        firstStudent.email = "starwars@gmail.com";
        firstStudent.indexNumber = "20042019";

        secondStudent.name = "Anton";
        secondStudent.secondName = "Sheiko";
        secondStudent.nickName = "freedom";
        secondStudent.email = "antonstendal19@gmail.com";
        secondStudent.indexNumber = "15061991";

        thirdStudent.name = "Liuba";
        thirdStudent.secondName = "Generalitska";
        thirdStudent.nickName = "harryPotter";
        thirdStudent.email = "generalitskaya@gmail.com";
        thirdStudent.indexNumber = "02051993";

        Students[] listStudent = new Students[3];
        listStudent[0] = firstStudent;
        listStudent[1] = secondStudent;
        listStudent[2] = thirdStudent;

        for (int i = 0; i < listStudent.length; i++) {
            listStudent[i].hello();
            listStudent[i].logIn();
            listStudent[i].enterEmail();
            listStudent[i].enterIndexNumber();
        }
    }
}
