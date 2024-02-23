package ext;

import dao.IDao;
import org.springframework.stereotype.Repository;

@Repository("dao2")
public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("version web servie");
        double t = 77;
        return t;
    }
}
