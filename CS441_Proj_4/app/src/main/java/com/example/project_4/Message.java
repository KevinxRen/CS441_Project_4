package com.example.project_4;

public class Message {
    private String text; // message body
    private MemberData memberData; // data of the user that sent this message
    private boolean belongsToCurrentUser;

    public Message(String text, MemberData memberData, boolean belongsToCurrentUser) {
        this.text = text;
        this.memberData = memberData;
        this.belongsToCurrentUser = belongsToCurrentUser;
    }

    public String getText() {
        return text;
    }

    public MemberData getMemberData() {
        return memberData;
    }

    public boolean isBelongsToCurrentUser() {
        return belongsToCurrentUser;
    }
}
