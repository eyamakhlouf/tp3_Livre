package lecture;
import java.util.List;
public interface IlectureCatalogue {
public List<Livre> getLivresParMotCle(String mc);
public void addLivre(Livre l);
}