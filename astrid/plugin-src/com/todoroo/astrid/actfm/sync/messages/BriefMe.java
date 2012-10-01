package com.todoroo.astrid.actfm.sync.messages;

import java.math.BigInteger;

import com.todoroo.astrid.data.RemoteModel;

public class BriefMe<TYPE extends RemoteModel> implements ClientToServerMessage {

    private final Class<? extends RemoteModel> modelClass;
    private final BigInteger uuid;
    private long pushedAt; // TODO: Populate and use

    public BriefMe(TYPE entity) {
        this.modelClass = entity.getClass();
        this.uuid = entity.getValue(RemoteModel.UUID_PROPERTY);
    }

    public void sendMessage() {
        // Send message
    }

}
