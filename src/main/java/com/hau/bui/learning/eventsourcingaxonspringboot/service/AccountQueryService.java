package com.hau.bui.learning.eventsourcingaxonspringboot.service;

import java.util.List;

public interface AccountQueryService {
    public List<Object> listEventsForAccount(String accountNumber);
}
