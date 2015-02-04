package org.webtree.rate.scanner.repositories;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.webtree.rate.scanner.appModel.Repo;
import org.webtree.rate.scanner.appModel.User;

/**
 * @author Maxim
 * @date $ {DATE}.
 */
public interface RepoRepository extends GraphRepository<Repo> {
}
