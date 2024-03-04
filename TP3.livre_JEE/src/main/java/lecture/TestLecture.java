package lecture;
import java.util.List;
public class TestLecture {
public static void main(String[] args) {
LectureImpl lecture= new LectureImpl();
List<Livre> livs = lecture.getLivresParMotCle("Les Mise");
for (Livre l : livs)
System.out.println(l.getTitreLivre());
}
}
