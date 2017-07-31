package cn.com.cmbc.study.domain;

/**
 * Created by yemin on 2017/7/29.
 */
    public class User {
        private String userId;
        private String nickname;
        private String password;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
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


        public User() {
        }

        public User(String userId, String nickname, String password) {
            this.userId = userId;
            this.nickname = nickname;
            this.password = password;
        }
    }
