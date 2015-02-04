package org.webtree.rate.scanner.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.webtree.rate.scanner.apiModels.GitRepo;
import org.webtree.rate.scanner.appModel.User;

import java.io.IOException;

/**
 * @author Maxim
 * @date $ {DATE}.
 */
@Component
public class Scanner implements Runnable {
    @Autowired
    private GithubApi api;
    @Autowired
    private ScanService service;

    public Scanner() {
    }

    public void scan() {
        service.getUsersLogins().forEach(this::scanUser);
    }

    private void scanUser(String userName) {
//        service.saveUserFollowers(userName, api.getUserFollowers(userName));
        User user = service.getUserByName(userName, true);
        try {
            int userStarsCounter = 0;
            for (GitRepo repo : api.getUserRepos(userName)) {
                userStarsCounter += repo.getStargazers_count();
                
            }
            user.setStars(userStarsCounter);
        } catch (IOException e) {
            e.printStackTrace();
        }
        service.saveUser(user);
    }

    @Override
    public void run() {
        scan();
    }
}
