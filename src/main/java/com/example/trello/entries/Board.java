package com.example.trello.entries;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Board {

    @Id
    private String boardId;
    private String name;
    private String url;
    @ElementCollection
    @CollectionTable(name="listOfActions")
    private List<String> listOfActions;


    private Board(){};
    public Board(String boardId){
        this.boardId=boardId;
    }
    public Board(String boardId, String name){
        this.boardId=boardId;
        this.name=name;
    }
    public Board(String boardId, List<String> listOfActions, String name){
        this.boardId=boardId;
        this.listOfActions = listOfActions;
        this.name = name;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public List<String> getListOfActions() {
        return listOfActions;
    }

    public void setListOfActions(List<String> listOfActions) {
        this.listOfActions = listOfActions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}