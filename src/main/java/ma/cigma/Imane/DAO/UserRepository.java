package ma.cigma.Imane.DAO;

import ma.cigma.Imane.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}

