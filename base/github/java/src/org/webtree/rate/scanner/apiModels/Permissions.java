package org.webtree.rate.scanner.apiModels;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Maxim
 * @date $ {DATE}.
 */
public class Permissions {
    @Setter @Getter private boolean admin;
    @Setter @Getter private boolean push;
    @Setter @Getter private boolean pull;
}
