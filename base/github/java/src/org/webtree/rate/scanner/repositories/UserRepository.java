package org.webtree.rate.scanner.repositories;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.webtree.rate.scanner.appModel.User;

/**
 * @author Maxim
 * @date $ {DATE}.
 */
public interface UserRepository extends GraphRepository<User> {
    @Query("start n=node(*) where n.userName={userName} return n")
    User findByUsername(@Param("userName") String themeId);
}
