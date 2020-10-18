package seedu.address.scraper;

import seedu.address.commons.exceptions.WrongLoginDetailsException;

public interface Scraper {
    void authenticate() throws WrongLoginDetailsException;
    void getMissions() throws WrongLoginDetailsException;
    void getStudents() throws WrongLoginDetailsException;
    void getQuests() throws WrongLoginDetailsException;
    void getUngradedMissionsAndQuests() throws WrongLoginDetailsException;
    void shutDown();
}
