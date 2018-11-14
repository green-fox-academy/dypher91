package com.greenfox.dypher91.demo.modules;
import javax.persistence.*;

    @Entity
    public class Todo {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        long id;

        private String title;
        private boolean isUrgent;
        private boolean isDone;

        public Todo() {
            this.isUrgent = false;
            this.isDone = false;
        }

        public Todo(String title) {
            this.title = title;
            this.isUrgent = false;
            this.isDone = false;
        }

        public Todo(String title, boolean isUrgent, boolean isDone) {
            this.title = title;
            this.isUrgent = isUrgent;
            this.isDone = isDone;
        }

        public long getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public boolean getIsUrgent() {
            return isUrgent;
        }

        public void setIsUrgent(boolean urgent) {
            isUrgent = urgent;
        }

        public boolean getIsDone() {
            return isDone;
        }

        public void setIsDone(boolean done) {
            isDone = done;
        }
    }

