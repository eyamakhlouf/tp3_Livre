package lecture;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class LectureImpl implements IlectureCatalogue{
	@Override
	public List<Livre> getLivresParMotCle(String mc) {
	List<Livre> livs= new ArrayList<Livre>();
	Connection conn=SingletonConnection.getConnection();
	try {

	PreparedStatement ps= conn.prepareStatement("select * from LIVRES where TITRE_LIVRE LIKE ?");

	ps.setString(1, "%"+mc+"%");
	ResultSet rs = ps.executeQuery();
	while (rs.next()) {
	Livre l = new Livre();
	l.setIdLivre(rs.getLong("ID_LIVRE"));
	l.setTitreLivre(rs.getString("TITRE_LIVRE"));
	l.setAuteur(rs.getString("AUTEUR"));
	l.setPrix(rs.getDouble("PRIX"));
	l.setGenre(rs.getString("GENRE"));
	l.setNbpages(rs.getInt("NB_PAGES"));
	livs.add(l);
	}
	} catch (SQLException e) {
	e.printStackTrace();
	}
	return livs;
	}
	@Override
	public void addLivre(Livre l) {
	// TODO Auto-generated method stub
	}
	}

