package com.mifind.oneless.model;

import java.util.List;

/**
 * Created by Xuanjiawei on 2016/10/31.
 */

public class MovieModel {

    private int res;

    private DataModel data;

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public DataModel getData() {
        return data;
    }

    public void setData(DataModel data) {
        this.data = data;
    }

    public static class DataModel {
        private int count;
        private List<DataInModel> data;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public List<DataInModel> getData() {
            return data;
        }

        public void setData(List<DataInModel> data) {
            this.data = data;
        }

        public static class DataInModel {
            private String id;
            private String movie_id;
            private String title;
            private String content;
            private String user_id;
            private String sort;
            private int praisenum;
            private String input_date;
            private String story_type;
            private User user;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getMovie_id() {
                return movie_id;
            }

            public void setMovie_id(String movie_id) {
                this.movie_id = movie_id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getUser_id() {
                return user_id;
            }

            public void setUser_id(String user_id) {
                this.user_id = user_id;
            }

            public String getSort() {
                return sort;
            }

            public void setSort(String sort) {
                this.sort = sort;
            }

            public int getPraisenum() {
                return praisenum;
            }

            public void setPraisenum(int praisenum) {
                this.praisenum = praisenum;
            }

            public String getInput_date() {
                return input_date;
            }

            public void setInput_date(String input_date) {
                this.input_date = input_date;
            }

            public String getStory_type() {
                return story_type;
            }

            public void setStory_type(String story_type) {
                this.story_type = story_type;
            }

            public User getUser() {
                return user;
            }

            public void setUser(User user) {
                this.user = user;
            }

            public static class User {
                private String user_id;
                private String user_name;
                private String web_url;

                public String getUser_id() {
                    return user_id;
                }

                public void setUser_id(String user_id) {
                    this.user_id = user_id;
                }

                public String getUser_name() {
                    return user_name;
                }

                public void setUser_name(String user_name) {
                    this.user_name = user_name;
                }

                public String getWeb_url() {
                    return web_url;
                }

                public void setWeb_url(String web_url) {
                    this.web_url = web_url;
                }
            }
        }
    }
}
