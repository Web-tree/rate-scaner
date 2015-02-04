package org.webtree.rate.scanner.apiModels;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author Maxim
 * @date $ {DATE}.
 */
public class GitRepo {
    @Setter @Getter private int id;
    @Setter @Getter private int forks_count;
    @Setter @Getter private int stargazers_count;
    @Setter @Getter private int watchers_count;
    @Setter @Getter private int size;
    @Setter @Getter private int open_issues_count;
    @Setter @Getter private GitUser owner;
    @SerializedName("private")
    @Setter @Getter private boolean isPrivate;
    @Setter @Getter private boolean fork;
    @Setter @Getter private boolean has_issues;
    @Setter @Getter private boolean has_wiki;
    @Setter @Getter private boolean has_pages;
    @Setter @Getter private boolean has_downloads;
    @Setter @Getter private boolean pushed_at;
    @Setter @Getter private String login;
    @Setter @Getter private String name;
    @Setter @Getter private String full_name;
    @Setter @Getter private String description;
    @Setter @Getter private String url;
    @Setter @Getter private String html_url;
    @Setter @Getter private String clone_url;
    @Setter @Getter private String git_url;
    @Setter @Getter private String ssh_url;
    @Setter @Getter private String svn_url;
    @Setter @Getter private String mirror_url;
    @Setter @Getter private String homepage;
    @Setter @Getter private String language;
    @Setter @Getter private String default_branch;
    @Setter @Getter private Date created_at;
    @Setter @Getter private Date updated_at;
    @Setter @Getter private Permissions permissions;
}
