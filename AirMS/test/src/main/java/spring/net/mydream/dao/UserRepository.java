package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface UserRepository extends JpaRepository<User, Integer> ,JpaSpecificationExecutor<User>{
	List<User> findByBelongedRole(Role role);
	List<User> findByBelongedDepartment(Department department);
	User findByNameAndPassword(Object name,Object password);
}
