package org.webtree.rate.scanner.appModel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

import java.util.Set;

/**
 * @author Maxim
 * @date $ {DATE}.
 */
@NodeEntity
@NoArgsConstructor
public class Repo {
    @Getter
    @Setter
    @GraphId
    private Long id;
    @Getter @Setter
    private Long gitId;
    @Getter @Setter
    private int stars;
    @Getter @Setter
    @RelatedTo(type = "OWNER", direction = Direction.INCOMING)
    private User owner;
    @Getter @Setter
    @RelatedTo(type = "SUBSCRIBERS", direction = Direction.INCOMING)
    private Set<User> subscribers;
    @Getter @Setter
    @RelatedTo(type = "STARGAZERS", direction = Direction.INCOMING)
    private Set<User> stargazers;
}
