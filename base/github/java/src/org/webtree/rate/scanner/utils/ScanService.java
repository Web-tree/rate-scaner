package org.webtree.rate.scanner.utils;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Component;
import org.webtree.rate.scanner.appModel.Repo;
import org.webtree.rate.scanner.appModel.User;
import org.webtree.rate.scanner.repositories.RepoRepository;
import org.webtree.rate.scanner.repositories.UserRepository;

import java.util.List;

/**
 * @author Maxim
 * @date $ {DATE}.
 */
@Component
public class ScanService {
    private static final int DEFAULT_USERS_LIMIT = 10;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RepoRepository repoRepository;

    public List<String> getUsersLogins() {
        return getUsersLogins(DEFAULT_USERS_LIMIT);
    }

    public List<String> getUsersLogins(int limit) {
        return Lists.newArrayList(
//                "Max-Levicky",
                "venantius"
//                "devilx",
//                "joshlemer",
//                "jklein"
        );
    }

    public User getUserByName(String userName) {
        return getUserByName(userName, false);
    }
    public User getUserByName(String userName, boolean createNew) {
        User user = userRepository.findByUsername(userName);
        if (createNew && user == null) {
            user = new User(userName);
            saveUser(user);
        }
        return user;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void saveRepo(Repo repo) {
        repoRepository.save(repo);
    }
}
