package org.oyach.spring.cache.domain;

/**
 * @author liuzhenyuan
 * @version Last modified 15/4/8
 * @since 0.0.1
 */
public class User {

    private long id;
    private String username;
    private String nickname;
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
