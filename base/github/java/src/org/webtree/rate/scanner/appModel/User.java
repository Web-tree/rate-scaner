package org.webtree.rate.scanner.appModel;

import com.sun.istack.internal.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

import java.util.Set;

/**
 * @author Maxim
 * @date $ {DATE}.
 */
@NodeEntity
@NoArgsConstructor
public class User {
    @Getter @Setter
    @GraphId
    private Long id;
    @Getter @Setter
    @Indexed
    private String userName;
    @Getter @Setter
    private Long gitId;
    @Getter @Setter
    private int stars;
    @Getter @Setter
    @RelatedTo(type = "FOLLOWER", direction = Direction.INCOMING)
    private Set<User> followers;
    @Getter @Setter
    @RelatedTo(type = "FOLLOWING", direction = Direction.OUTGOING)
    private Set<User> following;


    public User(String userName) {
        this.userName = userName;
    }
}
