package org.dlj.smartparking.security;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.Collections;

@Getter
@Setter
public class SecurityUser extends User {

    private Long id;

    public SecurityUser(
            final String username,
            final Long id
    ) {
        super(username, "FAKE_PASSWORD", Collections.emptyList());
        this.id = id;
    }

    public SecurityUser(
            final String username,
            final String password,
            final Collection<? extends GrantedAuthority> authorities
    ) {
        super(username, password, authorities);
    }

    public SecurityUser(
            final String username,
            final String password,
            final boolean enabled,
            final boolean accountNonExpired,
            final boolean credentialsNonExpired,
            final boolean accountNonLocked,
            final Collection<? extends GrantedAuthority> authorities
    ) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }
}
