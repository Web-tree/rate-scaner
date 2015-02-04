package org.webtree.rate.scanner.utils;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Component;
import org.webtree.rate.scanner.BaseApi;
import org.webtree.rate.scanner.apiModels.GitRepo;
import org.webtree.rate.scanner.apiModels.GitUser;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @author Maxim
 * @date $ {DATE}.
 */
@Component
public class GithubApi extends BaseApi {
    private static final String API_URL = "https://api.github.com/";

    public int getUserStarCount(String userName) throws IOException {
        GitUser user = new Gson().fromJson(httpRequest(HttpMethod.GET, API_URL + userName + "/stargazers"), GitUser.class);
        return user.getId();
    }

    public List<GitRepo> getUserRepos(String user) throws IOException {
        Type type = new TypeToken<List<GitRepo>>(){}.getType();
        return new Gson().fromJson(httpRequest(HttpMethod.GET, API_URL + "users/" + user + "/repos"), type);
    }

    public List<String> getUserFollowers(String userName) {
        return Lists.newArrayList();
    }

}
