package ext;

import Dao.IDao;
import Metier.IMetier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao2")
public class DaoImplV2 implements IDao {

    @Override
    public double getData() {


        System.out.println("Version web service");
        double t = 77;
        return t;

    }

}
