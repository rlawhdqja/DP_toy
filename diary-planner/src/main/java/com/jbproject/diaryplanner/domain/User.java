package com.jbproject.diaryplanner.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Columns;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    @Column(length = 255)
    private Long uid;

    @Column(length = 45, name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(length = 16 , name = "nickname")
    private String nickname;

    @Column(name = "email_check")
    private boolean email_check;

    public void passwordUpdate(String password){// builder와 사용 목적이 같다.
        this.password = password;
    }

    public void nickNameUpdate(String nickname) {
        this.nickname = nickname;
    }
    // Jwt 토큰을 위해 UserDetails

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
