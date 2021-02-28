package com.hau.bui.learning.eventsourcingaxonspringboot.event;

import com.hau.bui.learning.eventsourcingaxonspringboot.base.BaseEvent;
import com.hau.bui.learning.eventsourcingaxonspringboot.entity.aggregate.Status;

public class AccountActivatedEvent extends BaseEvent<String> {

    public final Status status;

    public AccountActivatedEvent(String id, Status status) {
        super(id);
        this.status = status;
    }
}
