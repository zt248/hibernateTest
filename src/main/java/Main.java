import dao.DaoException;
import dao.impl.AddressDaoImpl;
import entity.Address;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import util.HibernateUtil;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

public class Main {
    public static void main(String[] args) throws DaoException {
        AddressDaoImpl addressDaoImpl = new AddressDaoImpl();
        Address address = new Address();
        address.setCountry("Belarus");
        address.setCity("Minsk");
        address.setStreet("Fogela 1E");
        address.setPostCode("123456");

        addressDaoImpl.add(address);
        HibernateUtil.shutdown();
    }
}