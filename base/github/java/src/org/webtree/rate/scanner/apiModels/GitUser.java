package org.webtree.rate.scanner.apiModels;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author Maxim
 * @date $ {DATE}.
 */
public class GitUser {
    @Setter @Getter private int id;
    @Setter @Getter private int public_repos;
    @Setter @Getter private int public_gists;
    @Setter @Getter private int followers;
    @Setter @Getter private int following;
    @Setter @Getter private boolean site_admin;
    @Setter @Getter private boolean hireable;
    @Setter @Getter private Date created_at;
    @Setter @Getter private Date updated_at;
    @Setter @Getter private String login;
    @Setter @Getter private String avatar_url;
    @Setter @Getter private String gravatar_id;
    @Setter @Getter private String url;
    @Setter @Getter private String html_url;
    @Setter @Getter private String followers_url;
    @Setter @Getter private String following_url;
    @Setter @Getter private String gists_url;
    @Setter @Getter private String starred_url;
    @Setter @Getter private String subscriptions_url;
    @Setter @Getter private String organizations_url;
    @Setter @Getter private String repos_url;
    @Setter @Getter private String events_url;
    @Setter @Getter private String received_events_url;
    @Setter @Getter private String type;
    @Setter @Getter private String name;
    @Setter @Getter private String company;
    @Setter @Getter private String blog;
    @Setter @Getter private String location;
    @Setter @Getter private String email;
    @Setter @Getter private String bio;
}
