package Dao;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements Dao.IDao {
    @Override
    public double getData() {
        System.out.println("Version base de données");
        double temp = 25;
        return temp;
    }
}
